package entity;

/**
 * 电子围栏主表
 * Created by Administrator on 2017/8/24.
 */
public class Fence {
    private String id;
    private String fenceName;
    private Double longitude;
    private Double latitude;
    private Double radius;
    private String area;
    private Integer type;

    public Fence(String id, String fenceName, Double longitude, Double latitude, Double radius, String area, Integer type) {
        this.id = id;
        this.fenceName = fenceName;
        this.longitude = longitude;
        this.latitude = latitude;
        this.radius = radius;
        this.area = area;
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFenceName() {
        return fenceName;
    }

    public void setFenceName(String fenceName) {
        this.fenceName = fenceName;
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

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}


