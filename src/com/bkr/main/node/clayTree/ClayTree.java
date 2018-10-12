package com.bkr.main.node.clayTree;

import com.bkr.main.api.ScriptAPI;
import com.bkr.main.node.TreeNode;

public class ClayTree extends TreeNode  {

    public ClayTree(ScriptAPI e) {
        super(e);
    }

    @Override
    public boolean isValid() {
        return false; // change to condition of being valid
    }
}
