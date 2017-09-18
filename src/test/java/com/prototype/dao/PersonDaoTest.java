package com.prototype.dao;

import com.prototype.entity.Person;
import com.prototype.utils.DateFormatUtil;
import com.prototype.utils.MDfiveUtil;
import com.prototype.utils.UUIDUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

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
//        --------满属性测试
//        String id = UUIDUtil.getUUID();
//        String name = "张三";
//        String sex = "男";
//        int age = 28;
//        String number = "20170905";
//        String phone = "13984214136";
//        String address = "天津西青区公安局交警大队";
//        String date ="1984-08-04";
//        Date birthday = DateFormatUtil.StringFormatDate(date);
//        String loginName = "root1";
//        String password = "123456";
//        Person person = new Person(id, name, sex, age, number, phone, address, birthday, loginName, password);
//        int insertCount = personDao.insertPerson(person);
//        logger.info("insertCount = {}",insertCount);
//        ------------
//        空属性测试
        String id = UUIDUtil.getUUID();
        String name = "王五";
        String sex = "男";
        String number = "20170911";
        String address = "天津西青区公安局交警大队";
        String loginName = "root2";
        String password = "123456";
        Person person = new Person();
        person.setId(id);
        person.setName(name);
        person.setSex(sex);
        person.setNumber(number);
        person.setAddress(address);
        person.setLoginName(loginName);
        person.setPassword(MDfiveUtil.getMD5(password));
        int insertCount = personDao.insertPerson(person);
        logger.info("insertCount = {}",insertCount);
    }

    @Test
    public void queryPersonByLoginName() throws Exception {
        String loginname = "root";
        Person person = personDao.queryPersonByLoginName(loginname);
        logger.info("person = {}",person);
    }

    @Test
    public void queryPerson() throws Exception {
        List<Person> list = personDao.queryPerson();
        for (Person person : list){
            logger.info("person = {}",person);
        }
    }
    @Test
    public void deletePerson() throws Exception {
        String loginName = "root2";
        int deleteCount = personDao.deletePerson(loginName);
        logger.info("deleteCount = {}",deleteCount);
    }

    @Test
    public void updatePerson() throws Exception {
        //        ---------满属性修改
//        String id = UUIDUtil.getUUID();
//        String name = "张三";
//        String sex = "男";
//        int age = 28;
//        String number = "20170905";
//        String phone = "13984214136";
//        String address = "天津西青区公安局刑警大队";
//        String date ="1984-08-04";
//        Date birthday = DateFormatUtil.StringFormatDate(date);
//        String loginName = "root1";
//        String password = "123456";
//        Person person = new Person(id, name, sex, age, number, phone, address, birthday, loginName, password);
//        int updateCount = personDao.updatePerson(person);
//        logger.info("updateCount = {}" , updateCount);
//        --------------
//        String number = "20180905";
//        String address = "天津西青区公安局城管大队";
        int age = 28;
        String date ="1984-08-04";
        Date birthday = DateFormatUtil.StringFormatDate(date);
        String loginName = "root";
        Person person = new Person();
//        person.setNumber(number);
//        person.setAddress(address);
        person.setAge(age);
        person.setBirthday(birthday);
        person.setLoginName(loginName);
        int updateCount = personDao.updatePerson(person);
        logger.info("updateCount = {}" , updateCount);
    }

    @Test
    public void UpdatePersonPassword() throws Exception{
        String loginName = "root2";
        String password = MDfiveUtil.getMD5("654321");
        Person person = new Person();
        person.setLoginName(loginName);
        person.setPassword(password);
        int updateCount = personDao.UpdatePersonPassword(person);
        logger.info("updateCount = {}",updateCount);
    }

}