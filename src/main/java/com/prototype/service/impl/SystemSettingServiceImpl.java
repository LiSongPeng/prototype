package com.prototype.service.impl;

import com.prototype.dao.SystemSettingDao;
import com.prototype.entity.SystemSetting;
import com.prototype.service.SystemSettingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by luozhong on 2017/8/8.
 */
@Service("SystemSettingService")
public class SystemSettingServiceImpl implements SystemSettingService {
    @Resource(name = "systemSettingDao")
    private SystemSettingDao systemSettingDao;
    public void updateSet(SystemSetting systemSetting){
        systemSettingDao.updateSet(systemSetting);
    }
    public SystemSetting selectById(Integer id){
        SystemSetting SystemSetting = systemSettingDao.selectById(id);
        return SystemSetting;
    }
    public void insertSet(SystemSetting systemSetting){
        systemSettingDao.insertSet(systemSetting);
    }

    public List<SystemSetting> selectAll() {
        return systemSettingDao.queryAll();
    }
}
