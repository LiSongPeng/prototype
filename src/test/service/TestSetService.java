package test.service;

import entity.Set;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import service.i.SetService;
import test.BaseTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * Created by luozhong on 2017/8/15.
 */
public class TestSetService extends BaseTest{
    @Autowired
    @Qualifier("setService")
    private SetService setService;
    @Test
    public void select(){
        Set set=setService.selectById(1);
        System.out.println(set);
    }
    @Test
    public void update() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date1=sdf.parse("2017-08-22");
        Date date2=sdf.parse("2017-08-17");
        Date date3=sdf.parse("2017-08-24");
        Set set=new Set(1,date1,1,date2,0,100,1,date3,1,"10分钟",1);
        System.out.println(set);
        setService.updateSet(set);
    }
}
