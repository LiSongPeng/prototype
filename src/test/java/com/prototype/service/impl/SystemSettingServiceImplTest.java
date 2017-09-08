package com.prototype.service.impl;
import com.prototype.entity.Person;
import com.prototype.entity.SystemSetting;
import com.prototype.service.SystemSettingService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.*;

/**
 * Created by WFY on 2017/9/1.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({
        "classpath:spring/spring-service.xml",
        "classpath:spring/spring-dao.xml"
})
public class SystemSettingServiceImplTest {
    @Autowired
    private SystemSettingService systemSettingService;

    @Test
    public void selectById() throws Exception {
        SystemSetting SystemSetting =systemSettingService.selectById(1);
        System.out.println(SystemSetting);
    }
    @Test
    public void updateSet() throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date1=sdf.parse("2017-09-1");
        SystemSetting systemSetting =new SystemSetting(1,"月审时间3","1","4","hotDog",date1,"NO","大家注意");
        System.out.println(systemSetting);
        systemSettingService.updateSet(systemSetting);

    }
    @Test
    public void insertSet() throws Exception{
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date3=sdf.parse("2017-09-4");
        SystemSetting systemSetting=new SystemSetting(3,"时审时间","3","2","wfy",date3,"YES","据下次时审时间");
        System.out.println(systemSetting);
        systemSettingService.insertSet(systemSetting);
    }



}
