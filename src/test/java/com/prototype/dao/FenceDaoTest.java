package com.prototype.dao;

import com.prototype.entity.Fence;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;


/**
 * Created by Administrator on 2017/8/1.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class FenceDaoTest {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Resource
    private FenceDao fenceDao;

    @Test
    public void queryById() throws Exception {
        String id = "1";
        Fence fence = fenceDao.queryById(id);
        logger.info("fence = {}" + fence);
    }

}