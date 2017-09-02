package com.prototype.dao;

import com.prototype.entity.Person;
import com.prototype.utils.MDfiveUtil;
import com.prototype.utils.UUIDUtil;
import org.apache.ibatis.annotations.Param;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.UUID;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-dao.xml")

public class PersonDaoTest {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Resource
    private PersonDao personDao;
    @Test
    public void queryByLoginName() throws Exception {
        String loginname = "root";
        Person person = personDao.queryByLoginName(loginname);
        logger.info("person = {}" + person);
    }

    @Test
    public void insertPerson() throws Exception {
        String id = UUIDUtil.getUUID();
        String loginname = "root";
        String password = MDfiveUtil.getMD5("123456");
        //logger.info("password = {}"+password);
        Person person = new Person(id,loginname,password);
        int insertCount = personDao.insertPerson(person);
        logger.info("insertCount = "+ insertCount);



    }

}