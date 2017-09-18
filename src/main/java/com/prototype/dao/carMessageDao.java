package com.prototype.dao;


import com.prototype.entity.carMessage.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface carMessageDao {
    /**
     * 车辆车辆基本信息
     * 1.按照车牌ID查询信息
     * 2.按照信息ID查询信息
     * 3.查询所有信息
     * 4.按照信息ID删除信息
     * 5.修改信息
     * 6.添加信息
     *
     * **/
    public List<carMessage> queryCarMessageByLid(String Lid);

    public carMessage queryCarMessageById(String carmessageId);

    public List<carMessage> queeryCarMessage();

    public void deleteCarMessage(String carmessageId);

    public void updateCarMessage(carMessage carmessage);
    public void addCarMessage(carMessage carmessage);

    /**
     * 车辆事故
     * 1.按照事故ID查询事故信息
     * 2.按照事故ID查询事故信息
     * 3.查询所有事故信息
     * 4.按照事故ID删除事故信息
     * 5.添加事故信息
     *
     * **/

    public accidentRecord queryAccidentById(String accidentId);
    public List<accidentRecord> queryAccidentByLid(String Lid);
    public List<accidentRecord>  queryAccident();
    public void deleteAccident(String accidentId);
    public void addAccident(accidentRecord accident);

    /**
     * 车辆年审
     * 1.按照年审ID查询年审信息
     * 2.按照车牌ID查询年审信息
     * 3.查询所有年审信息
     * 4.按照年审ID删除年审信息
     * 5.添加年审信息
     *
     * **/

    public annualRecord queryAnnualById(String annualId);
    public List<annualRecord> queryAnnualByLid(String Lid);
    public List<annualRecord> queryAnnual();
    public void deleteAnnual(String AnnualId);
    public void addAnnual(annualRecord annual);
    /**
     * 车辆保险
     * 1.按照保险ID查询保险信息
     * 2.按照车牌ID查询保险信息
     * 3.查询所有保险信息
     * 4.按照保险ID删除保险信息
     * 5.添加保险信息
     *
     * **/

    public insuranceRecords queryInsuranceById(String insuranceId);
    public List<insuranceRecords> queryInsuranceByLid(String Lid);
    public List<insuranceRecords> queryInsurance();
    public void deleteInsurance(String insuranceId);
    public void addInsurance(insuranceRecords insurance);
    /**
     * 车辆类型
     * 1.按照车型ID查询车型信息
     * 2.按照汽车品牌查询车型信息
     * 3.查询所有车型信息
     * 4.按照车型ID删除车型信息
     * 5.添加车型信息
     *
     * **/

    public carType queryCarTypeById(String typeId);
    public List<carType>  queryAllByBrand(String brand);
    public List<carType> queryCarType();
    public void deleteCarType(String typeId);
    public void addCarType(carType carType);

    /**
     * 车辆保养
     * 1.按照保养ID查询保养信息
     * 2.按照车牌ID查询保养信息
     * 3.查询所有保养信息
     * 4.按照保养ID删除保养信息
     * 5.添加保养信息
     *
     * **/
    public maintenanceRecord queryMaintenanceById(String  maintenanceId);
    public List<maintenanceRecord> queryMaintenanceByLid(String Lid);
    public List<maintenanceRecord> queryMaintenance();
    public void deleteMaintenance(String maintenanceId);
    public void addMaintenance(maintenanceRecord maintenanceRecord);
}
