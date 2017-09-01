package com.prototype.dao;

import com.prototype.entity.SystemSetting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by luozhong on 2017/8/8.
 */
@Repository
public interface SystemSettingDao {

    void updateSet(SystemSetting SystemSetting);
    SystemSetting selectById(Integer id);
}
