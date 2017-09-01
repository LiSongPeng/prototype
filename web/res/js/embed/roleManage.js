/**
 * Created by Letg4 on 2017/8/8.
 */
var roleApp=angular.module("roleMng",[]);
roleApp.controller("roleMngCtrl",function ($scope,$rootScope) {
    $rootScope.slctUserIndex=null;
    $rootScope.slctUser={};
    $scope.getUserList=function (http) {
        $rootScope.userList=[
            {'userId':'1','userName':'liyuxuan','password':'liyuxuan','role':'员工','remark':'无'},
            {'userId':'2','userName':'wangfengyan','password':'123456','role':'员工','remark':'无'},
            {'userId':'4','userName':'lihuibo','password':'123456','role':'管理员','remark':'无'},
            {'userId':'5','userName':'jeff123','password':'123456','role':'员工','remark':'无'}
        ];
    }
    $scope.dltUserBg=function(http,idArr){
        alert('成功删除'+idArr);
    }
    $scope.getUserList(null);
})
roleApp.controller("userListCtrl",['$scope','$rootScope',userListCtrl]);
roleApp.controller("modalCtrl",['$scope','$rootScope',modalCtrl]);
function userListCtrl($scope,$rootScope) {
    $scope.editUser=function (index) {
        $rootScope.slctUserIndex=index;
        $rootScope.slctUser=angular.copy($rootScope.userList[index]);
    }
    $scope.addUser=function () {
        $rootScope.slctUserIndex='new';
        $rootScope.slctUser=null;
    }
    $scope.dltUser=function () {
        var delIdArr=[];
        angular.forEach($rootScope.userList,function (data,index,arr) {
            if (angular.element("#"+data.userId).eq(0).is(':checked')){
                delIdArr.push(data.userId);
            }
        });
        if(delIdArr.length>0){
            $scope.dltUserBg(null,delIdArr);
        }
    }
}
function modalCtrl($scope,root) {
    $scope.submitUser=function () {
        if(root.slctUserIndex=='new'){
            root.userList.push(angular.copy(root.slctUser));
//                    添加新增用户 后台方法
        }else {
            root.userList[root.slctUserIndex]=angular.copy(root.slctUser);
            //添加修改用户 方法
        }
    }
}