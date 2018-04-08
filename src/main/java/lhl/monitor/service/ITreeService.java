package lhl.monitor.service;

import lhl.monitor.model.tree.TreeObject;

import java.util.List;

public interface ITreeService {
    List<TreeObject> getTreeList(TreeObject obj);
}
