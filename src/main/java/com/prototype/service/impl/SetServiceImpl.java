package com.prototype.service.impl;

import com.prototype.dao.SetDao;
import com.prototype.entity.systemSetting;
import com.prototype.service.SetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by luozhong on 2017/8/8.
 */
@Service("setService")
public class SetServiceImpl implements SetService {
    @Autowired
    private SetDao setDao;
    public void updateSet(systemSetting systemSetting){
        setDao.updateSet(systemSetting);
    }
    public systemSetting selectById(Integer id){
        systemSetting systemSetting =setDao.selectById(id);
        return systemSetting;
    }
}
