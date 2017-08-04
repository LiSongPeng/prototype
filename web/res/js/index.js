angular.module('manager', ['ngRoute'])
    .controller('menuController', ['$scope', function ($scope) {
        $scope.navItems = ['首页'];//导航条
        var lastClickedItem = null;
        $scope.itemClicked = function (firstTitle, link, target, secondTitle) {
            if (secondTitle)
                $scope.navItems = [firstTitle, secondTitle];
            else
                $scope.navItems = [firstTitle];
            $scope.link = "embed/" + link + ".html";
            if (lastClickedItem != target)
                target.style.color = 'green';
            if (lastClickedItem && lastClickedItem != target)
                lastClickedItem.style.color = 'white';
            lastClickedItem = target;
        }
        $scope.menus = [{
            'picture': 'settings',
            'title': '系统管理',
            'secondMenus': [{'link': 'resourceManage', 'title': '资源管理'}, {'link': 'roleManage', 'title': '角色管理'},
                {'link': 'departmentManage', 'title': '单位管理'}, {'link': 'peopleManage', 'title': '人员管理'},
                {'link': 'deviceManage', 'title': '设备管理'}, {'link': 'dataDictionary', 'title': '数据字典'},
                {'link': 'electricFence', 'title': '电子围栏'}, {'link': 'systemSetting', 'title': '系统设置'},
            ],
        }, {
            'picture': 'airport_shuttle',
            'title': '用车管理',
            'secondMenus': [{'link': 'vehicleApply', 'title': '用车申请'}, {'link': 'leaderApprove', 'title': '领导审批'},
                {'link': 'vehicleDeploy', 'title': '车辆派遣'}, {'link': 'vehicleReturn', 'title': '车辆归还'},
                {'link': 'deployedVehicle', 'title': '用车查询'}, {'link': 'vehicleUsage', 'title': '车辆使用情况'}],
        }, {
            'picture': 'directions_car',
            'title': '车辆动态',
            'secondMenus': [{'link': 'realtimeLocation', 'title': '实时位置'}, {'link': 'travelingTrack', 'title': '行驶轨迹'},
                {'link': 'vehicleCondition', 'title': '动态车况'}, {'link': 'fenceBreakQuery', 'title': '围栏越界查询'},
            ],
        }, {
            'picture': 'directions_bus',
            'title': '车辆信息',
            'secondMenus': [{'link': 'vehicleDetail', 'title': '车辆明细'}, {'link': 'vehicleModel', 'title': '车型库'},
                {'link': 'terminalBind', 'title': '终端绑定'}, {'link': 'maintainManage', 'title': '保养管理'},
                {'link': 'annualVerification', 'title': '年审管理'}, {'link': 'insuranceManage', 'title': '保险管理'},
                {'link': 'accidentManage', 'title': '事故管理'}, {'link': 'retirementManage', 'title': '报废管理'},
                {'link': 'vehicleAllot', 'title': '车辆调拨'},
            ],
        }, {
            'picture': 'build',
            'title': '查询统计',
            'secondMenus': [{'link': 'vehicleStatistics', 'title': '车辆统计'}, {
                'link': 'vehicleUsageStatistics',
                'title': '车辆使用情况统计'
            },
                {'link': 'officialUsageMonthlyStatistics', 'title': '公务用车月统计'}, {
                    'link': 'officialUsageModel',
                    'title': '公务用车类型汇总'
                },
            ],
        }];
    }])
    .filter('trustAsResourceUrl', ['$sce', function ($sce) {
        return function (val) {
            return $sce.trustAsResourceUrl(val);
        };
    }]);
$(document).ready(function () {
    $('.collapsible').collapsible();
    $('.dropdown-button').dropdown({
            inDuration: 300,
            outDuration: 225,
            constrainWidth: false, // Does not change width of dropdown to that of the activator
            hover: false, // Activate on hover
            gutter: 0, // Spacing from edge
            belowOrigin: true, // Displays dropdown below the button
            alignment: 'left', // Displays dropdown with edge aligned to the left of button
            stopPropagation: false // Stops event propagation
        }
    );
    $('.header').click(function () {
        var arrow = $($(this).children('.right'));
        if (arrow.hasClass('rotateUp')) {
            arrow.removeClass('rotateUp');
            arrow.addClass('rotateDown');
        } else {
            arrow.removeClass('rotateDown');
            arrow.addClass('rotateUp');
        }
    });
});