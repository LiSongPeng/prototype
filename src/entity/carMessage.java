package entity;

public class carMessage {
    public int carId;   //车辆Id
    public String carImg;   //车辆图片
    public String licenseId;    //车牌号码
    public int typeId;    //车型
    public int TerminalNumber; //终端绑定编号
    public String engineNumber;    //发动机编号
    public String chassisNumber;   //底盘车架编号
    public float totalKilometers;  //已行驶里程
    public String companyUnits;  //所属单位
    public String scrapVehicle;  //车辆报废
    public String vehicleStatus; //车辆状态


    public int getTerminalNumber() {
        return TerminalNumber;
    }

    public void setTerminalNumber(int terminalNumber) {
        TerminalNumber = terminalNumber;
    }

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public String getCarImg() {
        return carImg;
    }

    public void setCarImg(String carImg) {
        this.carImg = carImg;
    }

    public String getLicenseId() {
        return licenseId;
    }

    public void setLicenseId(String licenseId) {
        this.licenseId = licenseId;
    }

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public String getEngineNumber() {
        return engineNumber;
    }

    public void setEngineNumber(String engineNumber) {
        this.engineNumber = engineNumber;
    }

    public String getChassisNumber() {
        return chassisNumber;
    }

    public void setChassisNumber(String chassisNumber) {
        this.chassisNumber = chassisNumber;
    }

    public float getTotalKilometers() {
        return totalKilometers;
    }

    public void setTotalKilometers(float totalKilometers) {
        this.totalKilometers = totalKilometers;
    }

    public String getCompanyUnits() {
        return companyUnits;
    }

    public void setCompanyUnits(String companyUnits) {
        this.companyUnits = companyUnits;
    }

    public String getScrapVehicle() {
        return scrapVehicle;
    }

    public void setScrapVehicle(String scrapVehicle) {
        this.scrapVehicle = scrapVehicle;
    }

    public String getVehicleStatus() {
        return vehicleStatus;
    }

    public void setVehicleStatus(String vehicleStatus) {
        this.vehicleStatus = vehicleStatus;
    }
}
