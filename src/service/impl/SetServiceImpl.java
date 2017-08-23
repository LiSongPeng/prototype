package service.impl;

import dao.i.SetDao;
import entity.Set;
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
    public void updateSet(Set set){
        setDao.updateSet(set);
    }
    public Set selectById(Integer id){
        Set set=setDao.selectById(id);
        return set;
    }
}
