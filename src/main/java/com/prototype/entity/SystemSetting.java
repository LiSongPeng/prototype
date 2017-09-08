package com.prototype.entity;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * Created by luozhong on 2017/8/8.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class SystemSetting {
    private Integer id;
    private String sysName;
    private String sysKey;
    private String sysValue;
    private String modifyPersonId;

    private Date modifyTime;
    private String status;
    private String remarks;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSysName() {
        return sysName;
    }

    public void setSysName(String sysName) {
        this.sysName = sysName;
    }

    public String getSysKey() {
        return sysKey;
    }

    public void setSysKey(String sysKey) {
        this.sysKey = sysKey;
    }

    public String getSysValue() {
        return sysValue;
    }

    public void setSysValue(String sysValue) {
        this.sysValue = sysValue;
    }

    public String getModifyPersonId() {
        return modifyPersonId;
    }

    public void setModifyPersonId(String modifyPersonId) {
        this.modifyPersonId = modifyPersonId;
    }
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public SystemSetting() {

    }
    public SystemSetting(Integer id, String sysName, String sysKey, String sysValue, String modifyPersonId, Date modifyTime, String status, String remarks) {
        this.id = id;
        this.sysName = sysName;
        this.sysKey = sysKey;
        this.sysValue = sysValue;
        this.modifyPersonId = modifyPersonId;
        this.modifyTime = modifyTime;
        this.status = status;
        this.remarks = remarks;
    }

    @Override
    public String toString() {
        return "SystemSetting{" +
                "id=" + id +
                ", sysName='" + sysName + '\'' +
                ", sysKey='" + sysKey + '\'' +
                ", sysValue='" + sysValue + '\'' +
                ", modifyPersonId='" + modifyPersonId + '\'' +
                ", modifyTime=" + modifyTime +
                ", status='" + status + '\'' +
                ", remarks='" + remarks + '\'' +
                '}';
    }
}

