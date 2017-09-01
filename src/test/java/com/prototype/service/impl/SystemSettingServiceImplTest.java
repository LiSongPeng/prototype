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

    }



}
