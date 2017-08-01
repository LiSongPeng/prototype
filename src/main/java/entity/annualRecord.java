package main.java.entity;

import java.util.Date;

public class annualRecord {
    private int annualId;   //年审记录ID
    private String licenseId;  //车牌号码
    private Date annualTime; //年审时间
    private String annualText; //年审内容

    public int getAnnualId() {
        return annualId;
    }

    public void setAnnualId(int annualId) {
        this.annualId = annualId;
    }

    public String getLicenseId() {
        return licenseId;
    }

    public void setLicenseId(String licenseId) {
        this.licenseId = licenseId;
    }

    public Date getAnnualTime() {
        return annualTime;
    }

    public void setAnnualTime(Date annualTime) {
        this.annualTime = annualTime;
    }

    public String getAnnualText() {
        return annualText;
    }

    public void setAnnualText(String annualText) {
        this.annualText = annualText;
    }
}
