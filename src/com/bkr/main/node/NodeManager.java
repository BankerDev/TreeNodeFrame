package com.bkr.main.node;

import java.util.ArrayList;
import java.util.List;

public class NodeManager {

    private List<Node> nodeList;
    private Node activeNode;

    public NodeManager() {
        nodeList = new ArrayList<>();
    }

    public void addNodes(Node... nodes) {
        for(Node node : nodes) {
            this.nodeList.add(node);
        }
    }

    public Node getActiveNode() {
        return activeNode;
    }

    public int pulse() {
        for(Node node : nodeList) {
            if(node.isValid()) {
                return node.exectute();
            }
        }
        return 666;
    }

}
