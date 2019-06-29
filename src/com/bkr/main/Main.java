package com.bkr.main;

import com.bkr.main.api.ScriptAPI;
import com.bkr.main.node.BaseNode;
import com.bkr.main.node.NodeManager;
import com.bkr.main.node.TreeNode;
import com.bkr.main.node.clayTree.ClayTree;
import com.bkr.main.node.clayTree.claySub.ClayChild;
import org.dreambot.api.script.AbstractScript;

public class Main extends AbstractScript {

    private ScriptAPI env;
    private NodeManager manager;

    public void onStart() {
        env = new ScriptAPI(this);
        manager = new NodeManager();

        TreeNode baseNode = new BaseNode(env);

        baseNode.addChild(

                new ClayTree(env).addChild(new ClayChild())

                // , new XXTree(env).addChild(xx)

        );
        
        manager.addNodes(baseNode);

    }

    @Override
    public int onLoop() {
        return manager.pulse();
    }
}
