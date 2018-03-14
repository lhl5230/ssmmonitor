package lhl.monitor.controller;

import lhl.monitor.model.Teacher;
import lhl.monitor.service.IGroupService;
import lhl.monitor.service.ITeacherService;
import lhl.monitor.service.impl.GroupServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/teacher")
public class GroupController {
//    @Resource
//    private IGroupService groupService;
    @Resource
    private ITeacherService teacherService;

    @RequestMapping("/showTeachers")
    public String getTeachers(HttpServletRequest request, Model model){
        List<Teacher> teachers = teacherService.getTeachers();
        model.addAttribute("teachers",teachers);
        return "teacher";
    }
}
