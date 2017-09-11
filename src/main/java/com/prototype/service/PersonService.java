package com.prototype.service;

import com.prototype.dto.PersonExecution;

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

}
