package com.bkr.main.node;

import com.bkr.main.api.ScriptAPI;

public class BaseNode extends TreeNode {

    public BaseNode(ScriptAPI e) {
        super(e);
    }

    @Override
    public boolean isValid() {
        return true;
    }

}
