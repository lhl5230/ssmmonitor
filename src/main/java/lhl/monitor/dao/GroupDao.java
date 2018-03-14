package lhl.monitor.dao;

import lhl.monitor.model.Group;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("groupDao")
public interface GroupDao {
    List<Group> getGroups();
}
