/**
 * Created by Letg4 on 2017/8/14.
 */
var map= new BMap.Map("map-container");
var point=new BMap.Point(117.041,39.108);
const YYAPIH="http://yingyan.baidu.com/api/v3/fence/";
map.centerAndZoom(point,11);
map.enableScrollWheelZoom();
map.addControl(new BMap.NavigationControl());
var overlays=[];

var styleOptions = {
    strokeColor:"red",    //边线颜色。
    fillColor:"red",            //填充颜色。当参数为空时，圆形将没有填充效果。
    strokeWeight: 2,       //边线的宽度，以像素为单位。
    strokeOpacity: 0.8,	   //边线透明度，取值范围0 - 1。
    fillOpacity: 0.6,      //填充的透明度，取值范围0 - 1。
    strokeStyle: 'solid' //边线的样式，solid或dashed。
};
var drawingManager = new BMapLib.DrawingManager(map,{
    isOpen: false, //是否开启绘制模式
    drawingToolOptions: {
        anchor: BMAP_ANCHOR_TOP_RIGHT, //位置
        offset: new BMap.Size(5, 5) //偏离值
    },//是否显示工具栏
    enableCalculate: false,
    circleOptions: styleOptions, //圆的样式
    polylineOptions: styleOptions, //线的样式
    polygonOptions: styleOptions, //多边形的样式
    rectangleOptions: styleOptions //矩形的样式
});
drawingManager.addEventListener('overlaycomplete',function (e) {
    overlays.push(e.overlay);
    console.log(e.overlay);
    drawingManager.close();
});
var eleApp=angular.module('eleFence',[]);
eleApp.controller('fenceCtrl',['$scope','$http','$rootScope',eleFenceCtrl]);
function eleFenceCtrl($scope,$http,$rootScope) {
    $scope.mapstatus="none";
    $scope.fenceList=[
        {id:1,name:'围栏1',type:'circle',monitor:'#allentity',overlay:{
            center:{lng:117.041,lat:39.108},
            radius:5000
        }},
        {id:3,name:'围栏2',type:'circle',monitor:'实体1',overlay:{
            center:{lng:117.041,lat:39.108},
            radius:2500.0
        }},
        {id:4,name:'围栏3',type:'polygon',monitor:'实体2',overlay:{
            path:[{lng:117.1,lat:39.1},{lng:117.2,lat:39.1},{lng:117.2,lat:39.2},{lng:117.1,lat:39.2}]
        }},
        {id:5,name:'围栏4',type:'polygon',monitor:'实体2',overlay:{
            path:[{lng:117.2,lat:39.2},{lng:117.3,lat:39.2},{lng:117.3,lat:39.3},{lng:117.2,lat:39.3}]
        }},
        {id:6,name:'围栏5',type:'polygon',monitor:'实体2',overlay:{
            path:[{lng:117.1,lat:39.1},{lng:117.4,lat:39.2},{lng:117.4,lat:39.4},{lng:117.2,lat:39.4}]
        }}
    ];
    $scope.ctrlbarClps=function(){

        $(".left-bot-container").slideToggle(300);
        $(".new-fence-btn").toggle();
        $(".toggle-icon i").toggleClass("rotated");
    };
    $scope.mapstatusReset=function () {
        if($scope.mapstatus=="new"){
            $("#draw-edit").removeClass("active");
            for(var i = 0; i < overlays.length; i++){
                map.removeOverlay(overlays[i]);
            }
            overlays.length = 0;
            drawingManager.close();
            $(".btn-flipper").removeClass('rotated');
        }else if($scope.mapstatus=="show"){
            for(var i = 0; i < overlays.length; i++){
                map.removeOverlay(overlays[i]);
            }
            overlays.length = 0;
            $(".panel-body .btn-flipper.rotated").removeClass("rotated");
            $(".collapse").slideUp('fast');
        }
        $scope.mapstatus="none";
        return true;
    };
    $scope.drawFence=function (e) {
        $scope.mapstatusReset();
        $(".new-fence-btn").addClass("drawing");
        $scope.mapstatus="new";
        $("#draw-type-btn-group>.btn").removeClass("active");
        switch ($(e.target).attr('draw-type')){
            case "circle":
                drawingManager.setDrawingMode(BMAP_DRAWING_CIRCLE);
                break;
            case "rectangle":
                drawingManager.setDrawingMode(BMAP_DRAWING_RECTANGLE);
                break;
            case "polygon":
                drawingManager.setDrawingMode(BMAP_DRAWING_POLYGON);
                break;
            default:
                return;
        }
        $('.btn-flipper').addClass('rotated');
        drawingManager.open();
    };
    $scope.drawCancel=function(e){
        $scope.mapstatusReset();
        $(".new-fence-btn").removeClass("drawing");
    };
    $scope.drawEdit=function(e) {
        if($(e.target).hasClass("active")){
            overlays[0].disableEditing();
            $(e.target).removeClass("active");
        }else{
            overlays[0].enableEditing();
            $(e.target).addClass("active");
        }
        console.log(angular.toJson(overlays[0].getPath()));
    };
    $scope.drawSubmit=function(e) {
        if($("#draw-edit").hasClass("active")){
            overlays[0].disableEditing();
            $("#draw-edit").removeClass("active");
        }
        var fence=overlays[0];
        console.log(fence instanceof BMap.Circle);
        if (fence instanceof BMap.Circle){
            var data={
                name:"围栏1",
                monitor:"#allentity",
                overlay:{
                    center:overlays[0].getCenter(),
                    radius:overlays[0].getRadius()
                }
            };
            console.log(data);
            $http.post("http://localhost:3000/elecFence/addFence",data,{
                headers:{'Content-Type': 'application/json;charset=utf-8'}
            }).then(function (res) {
                console.log("ok!");
                console.log(res.data);
            },function (res) {
                console.log("wrong!");
                console.log(res.data);
            });
            alert("start!");

        }
    };
    $scope.slctFence=function (e){
        $scope.mapstatusReset();
        if ($("#collapse"+$(e.target).attr('id')).css("display")!='none') {
            return;
        }
        $("#collapse"+$(e.target).attr('id')).slideDown('fast');
        $scope.mapstatus="show";
        var fenceid=$(e.target).attr('id');
        for(var i=0;i<$scope.fenceList.length;i++){
            if($scope.fenceList[i].id==fenceid){
                if($scope.fenceList[i].type=='circle'){
                    var ovlay=new BMap.Circle($scope.fenceList[i].overlay.center,
                        $scope.fenceList[i].overlay.radius,
                        styleOptions);
                    overlays.push(ovlay);
                    map.addOverlay(ovlay);
                    console.log(map.getViewport([ovlay.getCenter()]));
                    map.setViewport(map.getViewport([ovlay.getCenter()],{
                        zoomFactor:-6,
                        margins: [30,30,30,30]
                    }));
                }else if($scope.fenceList[i].type=='polygon'){
                    var path=$scope.fenceList[i].overlay.path;
                    var ovlay=new BMap.Polygon(path,styleOptions);
                    overlays.push(ovlay);
                    map.addOverlay(ovlay);
                    console.log(map.getViewport([ovlay.getPath()]));
                    map.setViewport(map.getViewport(ovlay.getPath()));

                }
            }
        }
    };
    $scope.editFence=function (e) {
        overlays[0].enableEditing();
        $(e.target).parent().parent().addClass("rotated");
    };
    $scope.cancelEditFence= function (e) {
        for(var i = 0; i < overlays.length; i++){
            map.removeOverlay(overlays[i]);
        }
        overlays.length = 0;
        var id=$(e.target).parents(".panel-body").attr("id").substring(8);
        $scope.fenceList.forEach(function (value, index, arr) {
            if(value.id==id){
                if(value.type=='circle'){
                    var ovlay=new BMap.Circle(value.overlay.center,
                        value.overlay.radius,
                        styleOptions);
                }else if(value.type=='polygon'){
                    var ovlay=new BMap.Polygon(value.overlay.path,styleOptions);
                }
                overlays.push(ovlay);
                map.addOverlay(ovlay);
            }
        });
        $(e.target).parent().parent().removeClass("rotated");
    };
    $scope.commitEditFence=function (e) {
        overlays[0].disableEditing();
        var id=$(e.target).parents(".panel-body").attr("id").substring(8);
        for(var i=0;i<$scope.fenceList.length;i++){
            if($scope.fenceList[i].id==id) {
                if ($scope.fenceList[i].type == 'circle') {
                    $scope.fenceList[i].overlay.center = overlays[0].getCenter();
                    $scope.fenceList[i].overlay.radius = overlays[0].getRadius();
                } else if ($scope.fenceList[i].type == 'polygon') {
                    $scope.fenceList[i].setPath($scope.fenceList[i].overlay.path);
                }
            }
        }
        $(e.target).parent().parent().removeClass("rotated");
    }
}
