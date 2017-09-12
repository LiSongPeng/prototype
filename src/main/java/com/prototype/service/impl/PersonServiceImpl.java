package com.prototype.service.impl;

import com.prototype.dao.PersonDao;
import com.prototype.dto.PersonExecution;
import com.prototype.entity.Person;
import com.prototype.enums.PersonStateEnum;
import com.prototype.exception.PersonException;
import com.prototype.service.PersonService;
import com.prototype.utils.MDfiveUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private PersonDao personDao;

    public PersonExecution personExecution(String loginName, String password) {
        try {
            Person person = personDao.queryByLoginName(loginName);
            String md5 = MDfiveUtil.getMD5(password);
            boolean flag = md5.equals(person.getPassword());
            if (person == null){
                return new PersonExecution(PersonStateEnum.PERSON_FAIL_0);
            }else if(flag){
                return new PersonExecution(PersonStateEnum.PERSON_SUCCESS);
            }else if (!flag){
                return new PersonExecution(PersonStateEnum.PERSON_FIAL_1);
            }else {
                return new PersonExecution(PersonStateEnum.INNER_PERSON);
            }
        }catch (Exception e){
            logger.error(e.getMessage());
            throw new PersonException("运行时的内部错误:"+e.getMessage());
        }
    }
}
