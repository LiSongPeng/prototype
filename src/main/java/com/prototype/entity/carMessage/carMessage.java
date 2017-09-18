package com.prototype.entity.carMessage;

public class carMessage {

    public static final String SCRAPPING="报废";
    public static final String UNSCAPPING="正常";
    public static final String  SENDING="已派遣";
    public static final String UNSENGING="未派遣";

    private String carId;   //车辆Id
    private String carImg;   //车辆图
    private String licenseId;    //车牌号码
    private String typeId;    //车型编号
    private int TerminalNumber; //终端绑定编号
    private String engineNumber;    //发动机编号
    private String chassisNumber;   //底盘车架编号
    private float totalKilometers;  //已行驶里程
    private String companyUnits;  //所属单位
    private String scrapVehicle;  //车辆报废
    private String vehicleStatus; //车辆状态


    public int getTerminalNumber() {
        return TerminalNumber;
    }

    public void setTerminalNumber(int terminalNumber) {
        TerminalNumber = terminalNumber;
    }

    public String getCarId() {
        return carId;
    }

    public void setCarId(String  carId) {
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

    public String  getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    public String getEngineNumber() {
        return engineNumber;
    }

    public void setEngineNumber(String engineNumber) { this.engineNumber = engineNumber; }

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
