package com.prototype.service;


import com.prototype.dao.SystemSettingDao;
import com.prototype.entity.SystemSetting;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by luozhong on 2017/8/8.
 */
@Resource
public interface SystemSettingService {
    void updateSet(SystemSetting systemSetting);
    SystemSetting selectById(Integer id);
    void insertSet(SystemSetting systemSetting);
    List<SystemSetting> selectAll();
}
