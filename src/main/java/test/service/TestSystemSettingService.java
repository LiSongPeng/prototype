///*
//package test.service;
//import com.prototype.service.SystemSettingService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import test.BaseTest;
//
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//
//
//
//
//public class TestSystemSettingService extends BaseTest{
//    @Autowired
//    @Qualifier("setService")
//    private SystemSettingService setService;
//    @Test
//    public void select(){
//        SystemSetting SystemSetting =setService.selectById(1);
//        System.out.println(SystemSetting);
//    }
//    @Test
//    public void update() throws ParseException {
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//        Date date1=sdf.parse("2017-08-22");
//        Date date2=sdf.parse("2017-08-17");
//        Date date3=sdf.parse("2017-08-24");
//        SystemSetting SystemSetting =new SystemSetting(1,date1,1,date2,0,100,1,date3,1,"10分钟",1);
//        System.out.println(SystemSetting);
//        setService.updateSet(SystemSetting);
//    }
//}
//*/
