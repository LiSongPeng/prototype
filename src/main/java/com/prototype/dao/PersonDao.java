package com.prototype.dao;

import com.prototype.entity.Person;
import org.apache.ibatis.annotations.Param;

public interface PersonDao {
    /**
     * 根据LoginName查询密码
     * @param loginName
     * @return
     */
    Person queryByLoginName(String loginName);

    /**
     * 查询Person的所有信息,密码除外
     * @param loginName
     * @return
     */
    Person queryPerson(String loginName);

    /**
     * 插入人员信息
     * @param person
     * @return
     */
    int insertPerson(@Param("person") Person person);

    /**
     * 修改人员信息
     * @param person
     * @return
     */
    int updatePerson(@Param("person") Person person);

    /**
     * 修改密码
     * @param person
     * @return
     */
    int UpdatePersonPassword(@Param("person") Person person);

}
