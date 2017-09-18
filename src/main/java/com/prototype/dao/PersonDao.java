package com.prototype.dao;

import com.prototype.entity.Person;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PersonDao {
    /**
     * 根据LoginName查询密码
     * @param loginName
     * @return
     */
    Person queryByLoginName(String loginName);

    /**
     * 通过LoginName查询Person的所有信息,密码除外
     * @param loginName
     * @return
     */
    Person queryPersonByLoginName(String loginName);

    /**
     * 查询所有人员信息
     * @return
     */
    List<Person> queryPerson();

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
     * 删除人员信息
     * @param loginName
     * @return
     */
    int deletePerson(String loginName);

    /**
     * 修改密码
     * @param person
     * @return
     */
    int UpdatePersonPassword(@Param("person") Person person);

}
