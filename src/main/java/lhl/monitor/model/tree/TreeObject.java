package lhl.monitor.model.tree;

import java.util.List;

public class TreeObject {
    private List<TreeObject> children;
    private String name;
    private TreeObject parent;
    private String belongID;
    private int sorter=10;

    public List<TreeObject> getChildren() {
        return children;
    }

    public void setChildren(List<TreeObject> children) {
        this.children = children;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TreeObject getParent() {
        return parent;
    }

    public void setParent(TreeObject parent) {
        this.parent = parent;
    }

    public String getBelongID() {
        return belongID;
    }

    public void setBelongID(String belongID) {
        this.belongID = belongID;
    }

    public int getSorter() {
        return sorter;
    }

    public void setSorter(int sorter) {
        this.sorter = sorter;
    }
}
