package com.prototype.controller;

import com.prototype.dto.PersonExecution;
import com.prototype.exception.PersonException;
import com.prototype.service.PersonService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PersonController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private PersonService personService;

    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String login(@RequestParam("loginname") String loginname,
                        @RequestParam("password") String password){
        try {
            PersonExecution personExecution = personService.personExecution(loginname, password);
            int state = personExecution.getState();
            if (state == 1){
                /*TODO*/
                //登录成功
            }else if (state == 0){
                /*TODO*/
//                登录失败，账号不存在
            }else if (state == -1){
                /*TODO*/
//                登录失败，密码错误
            }else{
                /*TODO*/
//                系统错误
            }
        }catch (Exception e){
            logger.error(e.getMessage(),e);
            throw new PersonException("运行时的内部异常"+e.getMessage());
        }
        return null;
    }
}
