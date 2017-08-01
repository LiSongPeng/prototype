package service.i;

import main.java.entity.systemSetting;

/**
 * Created by luozhong on 2017/8/8.
 */
public interface SetService {
    void updateSet(systemSetting systemSetting);
    systemSetting selectById(Integer id);
}
