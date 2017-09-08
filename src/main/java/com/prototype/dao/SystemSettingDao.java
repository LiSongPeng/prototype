package com.prototype.dao;

import com.prototype.entity.SystemSetting;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by luozhong on 2017/8/8.
 */
@Repository("systemSettingDao")
public interface SystemSettingDao {

    void updateSet(SystemSetting systemSetting);
    SystemSetting selectById(Integer id);
    void insertSet(SystemSetting systemSetting);
    List<SystemSetting> queryAll();
}
