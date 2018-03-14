package lhl.monitor.service.impl;

import lhl.monitor.dao.TeacherDao;
import lhl.monitor.model.Teacher;
import lhl.monitor.service.ITeacherService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("teacherService")
public class TeacherService implements ITeacherService {
    @Resource
    private TeacherDao teacherDao;
    public List<Teacher> getTeachers() {
        return teacherDao.getTeachers();
    }
}
