package com.prototype.service;

import com.prototype.dto.PersonExecution;
import com.prototype.entity.Person;
import com.prototype.utils.DateFormatUtil;
import com.prototype.utils.MDfiveUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({
        "classpath:spring/spring-dao.xml",
        "classpath:spring/spring-service.xml"
})
public class PersonServiceTest {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private PersonService personService;

    /**
     * 登录
     * @throws Exception
     */
    @Test
    public void personExecution() throws Exception {
        String loginName = "root2";
        String password = "123456";
        PersonExecution personExecution = personService.personExecution(loginName, password);
        logger.info("personExecution = {}",personExecution);
        logger.info("person = {}",personExecution.getPerson());
    }

    /**
     * 通过老密码修改密码
     * @throws Exception
     */
    @Test
    public void personUpdatePassword() throws Exception {
        String loginName = "root2";
        String oldPassword = "123456";
        String newPassword = "654321";
        PersonExecution personExecution = personService.personUpdatePassword(loginName, oldPassword, newPassword);
        logger.info("personExecution = {}",personExecution);
        logger.info("person = {}",personExecution.getPerson());
    }

    /**
     * 忘记老密码，修改密码
     * @throws Exception
     */
    @Test
    public void personUpdatePassword1() throws Exception {
        String loginName = "root2";
        String newPassword = "654321";
        PersonExecution personExecution = personService.personUpdatePassword(loginName, newPassword);
        logger.info("personExecution = {}",personExecution);
        logger.info("person = {}",personExecution.getPerson());
    }

    /**
     * 插入人员信息
     * @throws Exception
     */
    @Test
    public void personInsertExecution() throws Exception {
        String name = "张三";
        String sex = "男";
        String number = "20170915";
        String address = "天津西青区公安局交警大队";
        String loginName = "root1";
        String password = "123456";
        Person person = new Person();
        person.setName(name);
        person.setSex(sex);
        person.setNumber(number);
        person.setAddress(address);
        person.setLoginName(loginName);
        person.setPassword(MDfiveUtil.getMD5(password));
        PersonExecution personExecution = personService.personInsertExecution(person);
        logger.info("personExecution = {}",personExecution);
        logger.info("person = {}",personExecution.getPerson());
    }

    /**
     * 修改人员信息
     * @throws Exception
     */
    @Test
    public void personUpdateExecution() throws Exception {
        Person person = new Person();
        String loginName = "root2";
        String number = "20170913";
        String address = "天津西青区公安局抓狗大队";
        String phone = "13912345678";
        String date ="1984-08-04";
        Date birthday = DateFormatUtil.StringFormatDate(date);
        person.setPhone(phone);
        person.setBirthday(birthday);
        person.setNumber(number);
        person.setAddress(address);
        person.setLoginName(loginName);
        PersonExecution personExecution = personService.personUpdateExecution(person);
        logger.info("personExecution = {}",personExecution);
        logger.info("person = {}",personExecution.getPerson());
    }

    /**
     * 查询所有人员信息
     * @throws Exception
     */
    @Test
    public void queryPerson() throws Exception {
        List<Person> list = personService.queryPerson();
        for (Person person : list){
            logger.info("person = {}",person);
        }
    }

    /**
     * 删除人员信息
     * @throws Exception
     */
    @Test
    public void deletePerson() throws Exception {
        String loginName = "root1";
        PersonExecution personExecution = personService.deletePerson(loginName);
        logger.info("personExecution = {}",personExecution);
    }
}