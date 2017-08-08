package entity;

import java.util.Date;

/**
 * Created by luozhong on 2017/8/8.
 */
public class Set {
    private Integer id;
    private Date annul_examinatin_time;
    private int state1;
    private Date renewal_time;
    private int state2;
    private int maintenance_mileage;
    private int state3;
    private int maintenance_time;
    private int state4;
    private String refresh_frequency;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getAnnul_examinatin_time() {
        return annul_examinatin_time;
    }

    public void setAnnul_examinatin_time(Date annul_examinatin_time) {
        this.annul_examinatin_time = annul_examinatin_time;
    }

    public int getState1() {
        return state1;
    }

    public void setState1(int state1) {
        this.state1 = state1;
    }

    public Date getRenewal_time() {
        return renewal_time;
    }

    public void setRenewal_time(Date renewal_time) {
        this.renewal_time = renewal_time;
    }

    public int getState2() {
        return state2;
    }

    public void setState2(int state2) {
        this.state2 = state2;
    }

    public int getMaintenance_mileage() {
        return maintenance_mileage;
    }

    public void setMaintenance_mileage(int maintenance_mileage) {
        this.maintenance_mileage = maintenance_mileage;
    }

    public int getState3() {
        return state3;
    }

    public void setState3(int state3) {
        this.state3 = state3;
    }

    public int getMaintenance_time() {
        return maintenance_time;
    }

    public void setMaintenance_time(int maintenance_time) {
        this.maintenance_time = maintenance_time;
    }

    public int getState4() {
        return state4;
    }

    public void setState4(int state4) {
        this.state4 = state4;
    }

    public String getRefresh_frequency() {
        return refresh_frequency;
    }

    public void setRefresh_frequency(String refresh_frequency) {
        this.refresh_frequency = refresh_frequency;
    }
}

