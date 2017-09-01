package com.prototype.dao;

import com.prototype.entity.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-dao.xml")

public class PersonDaoTest {
    @Resource
    private PersonDao personDao;
    @Test
    public void queryByLoginName() throws Exception {
        String loginname = "root";
        Person person = personDao.queryByLoginName(loginname);
        System.out.println("person" + person);
    }

    @Test
    public void insertPerson() throws Exception {
    }

}