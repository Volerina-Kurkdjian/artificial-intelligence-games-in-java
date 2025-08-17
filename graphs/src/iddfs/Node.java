package iddfs;

import java.util.ArrayList;
import java.util.List;

public class Node {

    private String name;
    private int depthLevel;
    private List<Node> adjancecyList;

    public Node(String name) {
        this.name = name;
        this.adjancecyList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getDepthLevel() {
        return depthLevel;
    }

    public List<Node> getAdjancecyList() {
        return adjancecyList;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepthLevel(int depthLevel) {
        this.depthLevel = depthLevel;
    }

    public void addNeighbor(Node neighbor) {
        this.adjancecyList.add(neighbor);
    }

    @Override
    public String toString() {
        return "Node{" +
                "name='" + name + '\'' +
                ", depthLevel=" + depthLevel +
                ", adjancecyList=" + adjancecyList +
                '}';
    }
}
