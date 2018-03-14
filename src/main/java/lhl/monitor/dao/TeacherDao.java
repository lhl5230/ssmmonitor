package lhl.monitor.dao;

import lhl.monitor.model.Teacher;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("teacherDao")
public interface TeacherDao {
    List<Teacher> getTeachers();
}
