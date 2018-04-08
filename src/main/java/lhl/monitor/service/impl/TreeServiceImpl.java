package lhl.monitor.service.impl;

import lhl.monitor.model.tree.TreeObject;
import lhl.monitor.service.ITreeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("treeService")
public class TreeServiceImpl implements ITreeService {
    @Override
    public List<TreeObject> getTreeList(TreeObject obj) {
        return null;
    }
}
