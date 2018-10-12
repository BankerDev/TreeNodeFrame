package com.bkr.main.api;

import com.bkr.main.node.Node;
import org.dreambot.api.methods.MethodContext;

public class ScriptAPI {
    private MethodContext e;

    private Node activeNode;

    public ScriptAPI(MethodContext e) {
        this.e = e;
    }

    public MethodContext getDreambot() {
        return e;
    }

    public void setActiveNode(Node n) {
        this.activeNode = n;
    }

    public Node getActiveNode() {
        return activeNode;
    }


}
