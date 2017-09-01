<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<form action="addCarMessage.do" method="post" enctype="multipart/form-data">
    <div class="modal-content">
        <div class="row">
            <input  type="text"  name="carId"/>
            <div class="file-field input-field col s6">
                <div class="btn waves-effect waves-purple">
                    <span>上传汽车图片</span>
                    <input type="file" name="carImg"/>
                </div>

            </div>
            <div class="input-field col s6">
                <input id="licenseId" placeholder=" " type="text" name="licenseId" >
                <label for="licenseId">车牌号码</label>
            </div>
            <div class="input-field col s6">
                <input id="typeId" placeholder=" " name="typeId" type="text" >
                <label for="typeId">车型编号</label>
            </div>
            <div class="input-field col s6">
                <input id="TerminalNumber" placeholder=" " name="TerminalNumber" type="text"
                       >
                <label for="TerminalNumber">终端编号</label>
            </div>
            <div class="input-field col s6">
                <input id="engineNumber" placeholder=" " name="engineNumber" type="text"
                       >
                <label for="engineNumber">引擎编号</label>
            </div>
            <div class="input-field col s6">
                <input id="chassisNumber" placeholder=" " type="text" name="chassisNumber"
                       >
                <label for="chassisNumber">车架编号</label>
            </div>
            <div class="input-field col s6">
                <input id="totalKilometers" placeholder=" " type="text" name="totalKilometers"
                      >
                <label for="totalKilometers">行驶里程</label>
            </div>
            <div class="input-field col s6">
                <input id="companyUnits" placeholder=" " type="text" name="companyUnits"
                       >
                <label for="companyUnits">所属单位</label>
            </div>
            <div class="input-field col s6">
                <input id="scrapVehicle" placeholder=" " type="text" name="scrapVehicle"
                       >
                <label for="scrapVehicle">报废状态</label>
            </div>
            <div class="input-field col s6">
                <input id="vehicleStatus" placeholder=" " type="text" name="vehicleStatus"
                       >
                <label for="vehicleStatus">车辆状态</label>
            </div>
        </div>
    </div>
    <div class="modal-footer">
        <a class="modal-action modal-close waves-effect waves-purple btn-flat">取消</a>
        <button class="modal-action modal-close waves-effect waves-purple btn-flat" type="submit">确认
        </button>
    </div>
</form>
<%--<form action="aa.do" method="post">--%>
    <%----%>
        <%--姓名：<input type="text" name="name"><br>--%>
        <%--密码：<input type="text" name="password"><br>--%>
        <%--<input type="submit" value="提交">--%>

<%--</form>--%>
<%--<form action="cc.do" method="post">--%>

    <%--车辆Id：<input type="text" name="carId">--%>
    <%--车辆图片：<input type="text" name="carImg">--%>
    <%--车牌号码：<input type="text" name="licenseId">--%>
    <%--车型编号：<input type="text" name="typeId">--%>
    <%--终端绑定编号：<input type="text" name="TerminalNumber">--%>
    <%--发动机编号：<input type="text" name="engineNumber">--%>
    <%--姓名：<input type="text" name="chassisNumber">--%>
    <%--底盘车架编号：<input type="text" name="totalKilometers">--%>
    <%--所属单位：<input type="text" name="companyUnits">--%>
    <%--车辆报废：<input type="text" name="scrapVehicle">--%>
    <%--车辆状态：<input type="text" name="vehicleStatus">--%>

    <%--<input type="submit" value="提交">--%>

<%--</form>--%>
</body>
</html>
