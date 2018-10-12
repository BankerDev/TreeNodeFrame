package com.bkr.main.node;

import com.bkr.main.api.ScriptAPI;

import java.util.ArrayList;
import java.util.List;

public abstract class TreeNode extends Node {

    private List<Node> childList;

    public TreeNode(ScriptAPI e) {
        super(e);
        this.childList = new ArrayList<>();
    }

    public List<Node> getChildren() {
        return childList;
    }

    public TreeNode addChild(Node... children) {
        for(Node node : children) {
            this.childList.add(node);
        }
        return this;
    }

    @Override
    public int execute() {
        for(Node node : this.childList) {
            if(node.isValid()) {
                getEnvironment().setActiveNode(node);
                return node.execute();
            }
        }
        return 600;
    }


}
