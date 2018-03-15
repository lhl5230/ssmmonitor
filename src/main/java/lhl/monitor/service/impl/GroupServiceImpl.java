package lhl.monitor.service.impl;

import lhl.monitor.dao.IGroupDao;
import lhl.monitor.model.Group;
import lhl.monitor.service.IGroupService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("groupService")
public class GroupServiceImpl implements IGroupService {
    @Resource
    private IGroupDao groupDao;


    public List<Group> getGroups() {
        return groupDao.getGroups();
    }

}
