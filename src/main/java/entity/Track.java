package main.java.entity;

import java.util.Date;

/**
 * Created by Administrator on 2017/7/31.
 */
public class Track {
    private String id;
    private String carId;
    private Double longitude;
    private Double latitude;
    private Date uploadTime;


    public Track(String id, String carId, Double longitude, Double latitude, Date uploadTime) {
        this.id = id;
        this.carId = carId;
        this.longitude = longitude;
        this.latitude = latitude;
        this.uploadTime = uploadTime;

    }

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

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Date getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(Date uploadTime) {
        this.uploadTime = uploadTime;
    }

}
