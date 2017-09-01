/**
 * Created by Letg4 on 2017/8/6.
 */
var stuffListApp=angular.module('stuffListApp',[]);


stuffListApp.controller('stuffListCtrl',function ($scope) {
    $scope.editFlag=false;
    $scope.stuffList=[{'id':'11','head':'testhead1.jpg','name':'王峰焰','sex':'男','age':'23','company':'天津理工','depart':'软件学院'},
        {'id':'22','head':'testhead.jpg','name':'李宇轩','sex':'男','age':'23','company':'天津理工','depart':'软件学院'},
        {'id':'13','head':'testhead2.jpg','name':'李建鹏','sex':'男','age':'23','company':'天津理工','depart':'软件学院'}];

    $scope.sltStuffIndex=0;
    $scope.sltStuff=angular.copy($scope.stuffList[$scope.sltStuffIndex]);
    $scope.stuffHover=function (index) {
        if($scope.editFlag) {return;}
        $scope.sltStuffIndex=index;
        $scope.sltStuff = angular.copy($scope.stuffList[index]);
    };
    $scope.submitEdit=function () {
        if ($scope.sltStuffIndex=='new'){
            if(!confirm("确定要添加此员工信息吗？")){return;}
            $scope.stuffList.push(angular.copy($scope.sltStuff));
        }else {
            if(!confirm("确定要提交修改吗？")){return;}
            $scope.stuffList[$scope.sltStuffIndex]=angular.copy($scope.sltStuff);
        }
        $scope.editFlag=false;
    };
    $scope.cancelEdit=function () {
        if($scope.sltStuffIndex=='new'){
            $scope.sltStuffIndex=0;
        }
        $scope.sltStuff= angular.copy($scope.stuffList[$scope.sltStuffIndex]);
        $scope.editFlag=false;
    };
    $scope.resetEdit=function () {
        if(!confirm("确定要重置吗？")){return;}
        if($scope.sltStuffIndex=='new'){
            $scope.sltStuff=null;
        }else {
            $scope.sltStuff= angular.copy($scope.stuffList[$scope.sltStuffIndex]);
        }
    };
    $scope.editStuffInfo=function (index) {
        $scope.editFlag=true;
        $scope.sltStuffIndex=index;
        $scope.sltStuff= angular.copy($scope.stuffList[index]);
    };
    $scope.delStuff=function (stuffidArray) {
        for(var i=0;i<stuffidArray.length;i++){
            console.log(stuffidArray[i])
        }
    };
    $scope.delStuffRow=function (index) {
        var delIdArr=new Array();
        delIdArr.push($scope.stuffList[index].id);
        $scope.delStuff(delIdArr);
    };
    $scope.delStuffSlct=function () {
        var delIdArr=new Array();
        delIdArr.push($scope.stuffList[$scope.sltStuffIndex].id);
        $scope.delStuff(delIdArr);
    };
    $scope.delStuffChk=function () {
        var delIdArr=new Array();
        for(var i=0;i<$scope.stuffList.length;i++){
            if(angular.element(".stuffChkbox").eq(i).is(':checked')){
                delIdArr.push($scope.stuffList[i].id);
            }
        }
        $scope.delStuff(delIdArr);
    };
    $scope.newStuff=function () {
        $scope.sltStuff=null;
        $scope.sltStuffIndex='new';
        $scope.editFlag=true;
    }
});