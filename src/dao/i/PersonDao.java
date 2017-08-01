package dao.i;

import entity.Person;
import org.apache.ibatis.annotations.Param;

public interface PersonDao {
    /**
     * 根据LoginName查询密码
     * @param loginName
     * @return
     */
    Person queryByLoginName(String loginName);

    /**
     * 插入人员信息
     * @param person
     * @return
     */
    int insertPerson(@Param("person") Person person);

}
