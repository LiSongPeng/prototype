package main.java.entity;

import java.util.Date;

/**
 * 电子围栏越界记录
 * Created by Administrator on 2017/7/31.
 */
public class Alarm {
    private String id;
    private String carId;
    private String content;
    private Date crossTime;
    private Date returnTime;
    private String fid;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCrossTime() {
        return crossTime;
    }

    public void setCrossTime(Date crossTime) {
        this.crossTime = crossTime;
    }

    public Date getReturnTime() {
        return returnTime;
    }

    public void setReturnTime(Date returnTime) {
        this.returnTime = returnTime;
    }

    public String getFid() {
        return fid;
    }

    public void setFid(String fid) {
        this.fid = fid;
    }

    public Alarm(String id, String carId, String content, Date crossTime, Date returnTime, String fid) {
        this.id = id;
        this.carId = carId;
        this.content = content;
        this.crossTime = crossTime;
        this.returnTime = returnTime;
        this.fid = fid;


    }

}
