package dao.i;

import entity.Student;
import org.apache.ibatis.annotations.Select;

public interface StudentDao {
    //@Select("select * from Student s where s.id=#{id}")
    public Student queryStudent(int id);
}
