package com.prototype.dao;


import com.prototype.entity.Location;
import com.prototype.utils.DateFormatUtil;
import com.prototype.utils.UUIDUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.Date;


/**
 * Created by Administrator on 2017/8/6.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class LocationDaoTest {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

        @Resource
        private LocationDao locationDao;

        @Test
        public void queryById () throws Exception {
            String id = "1";
            Location location = locationDao.queryById(id);
            logger.info("location = {}" , location);
            System.out.println(location.getUploadTime());
            String date = DateFormatUtil.DateFormatString(location.getUploadTime(),"MEDIUM");
            logger.info(date);
        }

        @Test
        public void queryByCarId() throws Exception {
            String carId = "1";
            Location location = locationDao.queryById(carId);
            logger.info("location = {}" , location);
            /*System.out.println(location.getUploadTime());
            String date = DateFormatUtil.DateFormatString(location.getUploadTime(),"MEDIUM");
            logger.info(date);*/
        }

        @Test
        public void addLocation() throws Exception {
            Location location = new Location();
            location.setId(UUIDUtil.getUUID());
            location.setCarId("1");
            location.setLongitude(44.44);
            location.setLatitude(55.55);
          /*  String date ="1984-08-04";
            Date uploadTime = DateFormatUtil.StringFormatDate(date);*/
            int num = locationDao.addLocation(location);
            logger.info("num = {}",num);
        }

    }