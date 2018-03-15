package lhl.monitor.controller;

import lhl.monitor.model.Group;
import lhl.monitor.service.IGroupService;
import lhl.monitor.service.ITeacherService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/group")
public class GroupController {
    @Resource
    private IGroupService groupService;
    @Resource
    private ITeacherService teacherService;

    @RequestMapping("/showGroups")
    public String getTeachers(HttpServletRequest request, Model model){
        List<Group> teachers = groupService.getGroups();
        model.addAttribute("groups",teachers);
        return "group";
    }
}
