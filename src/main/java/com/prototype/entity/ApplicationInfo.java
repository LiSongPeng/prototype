package com.prototype.entity;

import java.util.Date;

/**
 * Created by luozhong on 2017/8/16.
 */
public class ApplicationInfo {
    int id;
    String company;
    String vehicle_type;
    String car_area;
    Date vehicle_time;
    Date return_teim;
    String vehicle_reason;
    String secrecy;
    int passenger_number;
    String applicant;
    String number;
    String path;

    public ApplicationInfo(int id, String company, String vehicle_type, String car_area, Date vehicle_time, Date return_teim, String vehicle_reason, String secrecy, int passenger_number, String applicant, String number, String path) {
        this.id = id;
        this.company = company;
        this.vehicle_type = vehicle_type;
        this.car_area = car_area;
        this.vehicle_time = vehicle_time;
        this.return_teim = return_teim;
        this.vehicle_reason = vehicle_reason;
        this.secrecy = secrecy;
        this.passenger_number = passenger_number;
        this.applicant = applicant;
        this.number = number;
        this.path = path;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getVehicle_type() {
        return vehicle_type;
    }

    public void setVehicle_type(String vehicle_type) {
        this.vehicle_type = vehicle_type;
    }

    public String getCar_area() {
        return car_area;
    }

    public void setCar_area(String car_area) {
        this.car_area = car_area;
    }

    public Date getVehicle_time() {
        return vehicle_time;
    }

    public void setVehicle_time(Date vehicle_time) {
        this.vehicle_time = vehicle_time;
    }

    public Date getReturn_teim() {
        return return_teim;
    }

    public void setReturn_teim(Date return_teim) {
        this.return_teim = return_teim;
    }

    public String getVehicle_reason() {
        return vehicle_reason;
    }

    public void setVehicle_reason(String vehicle_reason) {
        this.vehicle_reason = vehicle_reason;
    }

    public String getSecrecy() {
        return secrecy;
    }

    public void setSecrecy(String secrecy) {
        this.secrecy = secrecy;
    }

    public int getPassenger_number() {
        return passenger_number;
    }

    public void setPassenger_number(int passenger_number) {
        this.passenger_number = passenger_number;
    }

    public String getApplicant() {
        return applicant;
    }

    public void setApplicant(String applicant) {
        this.applicant = applicant;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public String toString() {
        return "ApplicationInfo{" +
                "id=" + id +
                ", company='" + company + '\'' +
                ", vehicle_type='" + vehicle_type + '\'' +
                ", car_area='" + car_area + '\'' +
                ", vehicle_time=" + vehicle_time +
                ", return_teim=" + return_teim +
                ", vehicle_reason='" + vehicle_reason + '\'' +
                ", secrecy='" + secrecy + '\'' +
                ", passenger_number=" + passenger_number +
                ", applicant='" + applicant + '\'' +
                ", number='" + number + '\'' +
                ", path='" + path + '\'' +
                '}';
    }
}
