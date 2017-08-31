package entity;

/**
 * 多边形围栏附表
 * Created by Administrator on 2017/7/31.
 */
public class Golygon {
    private String id;
    private Double longitude;
    private Double latitude;
    private String fid;

    public Golygon(String id, Double longitude, Double latitude, String fid) {
        this.id = id;
        this.longitude = longitude;
        this.latitude = latitude;
        this.fid = fid;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getFid() {
        return fid;
    }

    public void setFid(String fid) {
        this.fid = fid;
    }
}

