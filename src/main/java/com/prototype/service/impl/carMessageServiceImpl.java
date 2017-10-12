package com.prototype.service.impl;

import com.prototype.dao.carMessageDao;
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
     * 车辆保养
     * 1.按照保养ID查询保养信息
     * 2.按照车牌ID查询保养信息
     * 3.查询所有保养信息
     * 4.按照保养ID删除保养信息
     * 5.添加保养信息
     *
     * **/
    public maintenanceRecord queryMaintenanceById(String maintenanceId) {
        return carMessageDao.queryMaintenanceById(maintenanceId);
    }

    public List<maintenanceRecord> queryMaintenanceByLid(String Lid) {

        return carMessageDao.queryMaintenanceByLid(Lid);
    }

    public List<maintenanceRecord> queryMaintenance() {

        return carMessageDao.queryMaintenance();
    }

    public void deleteMaintenance(String maintenanceId) {
                carMessageDao.deleteMaintenance(maintenanceId);
    }

    public void addMaintenance(maintenanceRecord maintenanceRecord) {
        carMessageDao.addMaintenance(maintenanceRecord);

    }
}
