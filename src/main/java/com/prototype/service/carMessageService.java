package com.prototype.service;

import com.prototype.entity.carMessage.maintenanceRecord;

import java.util.List;

public interface carMessageService {

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
