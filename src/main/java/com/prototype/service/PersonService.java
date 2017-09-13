package com.prototype.service;

import com.prototype.dto.PersonExecution;
import com.prototype.entity.Person;
import org.apache.ibatis.annotations.Param;

/**
 * Person服务
 */
public interface PersonService {

    /**
     * 登录
     * @param loginName
     * @param password
     * @return
     */
    PersonExecution personExecution(String loginName, String password);

    /**
     * 修改密码
     * @param loginName
     * @param oldPassword
     * @param newPassword
     * @return
     */
    PersonExecution personUpdatePassword(String loginName, String oldPassword, String newPassword);
    PersonExecution personUpdatePassword(String loginName, String newPassword);

    /**
     * 插入人员信息
     * @param person
     * @return
     */
    PersonExecution personInsertExecution(@Param("person") Person person);

    /**
     * 修改人员信息,账号登录信息除外
     * @param person
     * @return
     */
    PersonExecution personUpdateExecution(@Param("person") Person person);

}
