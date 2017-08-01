package controller;

import dao.i.StudentDao;
import entity.Student;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

@Controller
@Scope("prototype")
public class StudentController {
    private StudentDao studentDao;

    @Resource(name = "studentDao")
    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @GetMapping(path = "/queryStudent.do")
    public String queryStudent(@RequestParam("id") int id, ModelMap map) {
        Student stu = studentDao.queryStudent(id);
        map.put("stu", stu);
        return "forward:/index.jsp";
    }
}
