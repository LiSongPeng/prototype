package dao.i;

import entity.Set;

/**
 * Created by luozhong on 2017/8/8.
 */
public interface SetDao {
    void updateSet(Set set);
    Set selectById(Integer id);
}
