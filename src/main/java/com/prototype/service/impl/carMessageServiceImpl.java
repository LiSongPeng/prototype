package com.prototype.service.impl;

import com.prototype.dao.carMessageDao;
import com.prototype.entity.carMessage.carType;
import com.prototype.entity.carMessage.maintenanceRecord;
import com.prototype.service.carMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("carMessageService")
public class carMessageServiceImpl implements carMessageService {

    @Autowired
    private carMessageDao carMessageDao;


    /**
     * 车辆类型
     * 1.按照车型ID查询车型信息
     * 2.按照汽车品牌查询车型信息
     * 3.查询所有车型信息
     * 4.按照车型ID删除车型信息
     * 5.添加车型信息
     **/

    //1.按照车型ID查询车型信息
    public carType queryCarTypeById(String typeId) {
        return carMessageDao.queryCarTypeById(typeId);
    }

    //2.按照汽车品牌查询车型信息
    public List<carType> queryAllByBrand(String brand) {
        return carMessageDao.queryAllByBrand(brand);
    }

    //3.查询所有车型信息
    public List<carType> queryCarType() {
        return carMessageDao.queryCarType();
    }

    //4.按照车型ID删除车型信息
    public void deleteCarType(String typeId) {
        carMessageDao.deleteCarType(typeId);
    }

    //5.添加车型信息
    public void addCarType(carType carType) {
        carMessageDao.addCarType(carType);

    }

    /**
     * 车辆保养
     * 1.按照保养ID查询保养信息
     * 2.按照车牌ID查询保养信息
     * 3.查询所有保养信息
     * 4.按照保养ID删除保养信息
     * 5.添加保养信息
     **/

    //1.按照保养ID查询保养信息
    public maintenanceRecord queryMaintenanceById(String maintenanceId) {
        return carMessageDao.queryMaintenanceById(maintenanceId);
    }

    //2.按照车牌ID查询保养信息
    public List<maintenanceRecord> queryMaintenanceByLid(String Lid) {

        return carMessageDao.queryMaintenanceByLid(Lid);
    }

    //3.查询所有保养信息
    public List<maintenanceRecord> queryMaintenance() {

        return carMessageDao.queryMaintenance();
    }

    //4.按照保养ID删除保养信息
    public void deleteMaintenance(String maintenanceId) {
        carMessageDao.deleteMaintenance(maintenanceId);
    }

    //5.添加保养信息
    public void addMaintenance(maintenanceRecord maintenanceRecord) {
        carMessageDao.addMaintenance(maintenanceRecord);

    }
}
