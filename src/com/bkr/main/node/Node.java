package com.bkr.main.node;

import com.bkr.main.api.ScriptAPI;
import org.dreambot.api.methods.MethodContext;

public abstract class Node {

    private ScriptAPI a;
    private MethodContext db;

    public Node(ScriptAPI e) {
        this.a = e;
        this.db = e.getDreambot();
    }

    public MethodContext getDB() {
        return db;
    }

    public ScriptAPI getEnvironment() {
        return a;
    }

    public abstract boolean isValid();
    public abstract int execute();


}
