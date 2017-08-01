package service.impl;

import main.java.dao.i.SetDao;
import main.java.entity.systemSetting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.i.SetService;

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
