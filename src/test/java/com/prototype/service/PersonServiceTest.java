package com.prototype.service;

import com.prototype.dto.PersonExecution;
import com.prototype.utils.MDfiveUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({
        "classpath:spring/spring-dao.xml",
        "classpath:spring/spring-service.xml"
})
public class PersonServiceTest {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private PersonService personService;

    @Test
    public void personExecution() throws Exception {
        String loginName = "root2";
        String password = "123456";
        PersonExecution personExecution = personService.personExecution(loginName, password);
        logger.info("personExecution = {}",personExecution);
        logger.info("person = {}",personExecution.getPerson());
    }

}