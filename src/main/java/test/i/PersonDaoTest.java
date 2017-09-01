//package test.i;
//
//import dao.i.PersonDao;
//import entity.Person;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
//import javax.annotation.Resource;
//
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations ={"file:E:\\study\\workspace\\prototype\\controller\\WEB-INF\\applicationContext.xml"})
//
//public class PersonDaoTest {
//
//    @Resource
//    private PersonDao personDao;
//
//    @Test
//    public void queryByLoginName() throws Exception {
//        String loginname = "root";
//        Person person = personDao.queryByLoginName(loginname);
//        System.out.println("person" + person);
//    }
//}