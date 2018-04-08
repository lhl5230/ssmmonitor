package lhl.monitor.dao;

import lhl.monitor.model.tree.TreeObject;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("treeDao")
public interface TreeDao {
    List<TreeObject> getTreeList(TreeObject obj);
}
