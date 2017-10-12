package com.prototype.service;

import com.prototype.entity.carMessage.carType;
import com.prototype.entity.carMessage.maintenanceRecord;

import java.util.List;

public interface carMessageService {


    /**
     * 车辆类型
     * 1.按照车型ID查询车型信息
     * 2.按照汽车品牌查询车型信息
     * 3.查询所有车型信息
     * 4.按照车型ID删除车型信息
     * 5.添加车型信息
     **/

    public carType queryCarTypeById(String typeId);

    public List<carType> queryAllByBrand(String brand);

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
     **/
    public maintenanceRecord queryMaintenanceById(String maintenanceId);

    public List<maintenanceRecord> queryMaintenanceByLid(String Lid);

    public List<maintenanceRecord> queryMaintenance();

    public void deleteMaintenance(String maintenanceId);

    public void addMaintenance(maintenanceRecord maintenanceRecord);


}
