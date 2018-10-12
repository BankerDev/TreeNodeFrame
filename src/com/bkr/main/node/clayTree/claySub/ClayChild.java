package com.bkr.main.node.clayTree.claySub;

import com.bkr.main.node.Node;

public class ClayChild extends Node {

    @Override
    public boolean isValid() {
        return false; // change to condition of being value (getState())
    }

    @Override
    public int execute() { // onLoop() - add code here
        return 0;
    }


}
