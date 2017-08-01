package main.java.entity;


import java.util.Date;

/**
 * Created by luozhong on 2017/8/8.
 */
public class systemSetting {
    private Integer id;
    private Date annual_examination_time;
    private int state1;
    private Date renewal_time;
    private int state2;
    private int maintenance_mileage;
    private int state3;
    private Date maintenance_time;
    private int state4;
    private String refresh_frequency;
    private int state5;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getAnnual_examination_time() {
        return annual_examination_time;
    }

    public void setAnnual_examination_time(Date annual_examination_time) {
        this.annual_examination_time = annual_examination_time;
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

    public Date getMaintenance_time() {
        return maintenance_time;
    }

    public void setMaintenance_time(Date maintenance_time) {
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

    public int getState5() {
        return state5;
    }

    public void setState5(int state5) {
        this.state5 = state5;
    }

    public systemSetting(Integer id, Date annul_examinatin_time, int state1, Date renewal_time, int state2, int maintenance_mileage, int state3, Date maintenance_time, int state4, String refresh_frequency, int state5) {
        this.id = id;
        this.annual_examination_time = annul_examinatin_time;
        this.state1 = state1;
        this.renewal_time = renewal_time;
        this.state2 = state2;
        this.maintenance_mileage = maintenance_mileage;
        this.state3 = state3;
        this.maintenance_time = maintenance_time;
        this.state4 = state4;
        this.refresh_frequency = refresh_frequency;
        this.state5 = state5;
    }

    @Override
    public String toString() {
        return "systemSetting{" +
                "id=" + id +
                ", annual_examination_time=" + annual_examination_time +
                ", state1=" + state1 +
                ", renewal_time=" + renewal_time +
                ", state2=" + state2 +
                ", maintenance_mileage=" + maintenance_mileage +
                ", state3=" + state3 +
                ", maintenance_time=" + maintenance_time +
                ", state4=" + state4 +
                ", refresh_frequency='" + refresh_frequency + '\'' +
                ", state5=" + state5 +
                '}';
    }
}

