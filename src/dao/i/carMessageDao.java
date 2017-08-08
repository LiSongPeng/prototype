package dao.i;


import entity.*;

import org.springframework.stereotype.Repository;

@Repository
public interface carMessageDao {
    //车辆基本信息

    public carMessage queryCarMessage(int carId);


    //车辆事故

    public accidentRecord queryAccident(int accidentId);


    //车辆年审

    public annualRecord queryAnnual(int annualId);


    //车辆保险

    public insuranceRecords queryInsurance(int insuranceId);


    //车辆车型

    public carType queryCarType(int typeId);

    //车辆保养

    public maintenanceRecord queryMaintenance(int maintenanceId);

}
