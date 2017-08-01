package main.java.entity;

/**
 * 车辆动态
 * Created by Administrator on 2017/7/31.
 */
public class Dynamic {
    private String id;
    private String carId;
    private String alarm;
    private Float speed;
    private Double longitude;
    private Double latitude;
    private String direction;

    public Dynamic(String id, String carId, String alarm, Float speed, Double longitude, Double latitude, String direction) {
        this.id = id;
        this.carId = carId;
        this.alarm = alarm;
        this.speed = speed;
        this.longitude = longitude;
        this.latitude = latitude;
        this.direction = direction;
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

    public String getAlarm() {
        return alarm;
    }

    public void setAlarm(String alarm) {
        this.alarm = alarm;
    }

    public Float getSpeed() {
        return speed;
    }

    public void setSpeed(Float speed) {
        this.speed = speed;
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

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }
}
