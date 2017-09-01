package com.prototype.dao;

import com.prototype.entity.systemSetting;
import org.springframework.stereotype.Service;

/**
 * Created by luozhong on 2017/8/8.
 */
@Service("setDao")
public interface SetDao {

    void updateSet(systemSetting systemSetting);
    systemSetting selectById(Integer id);
}
