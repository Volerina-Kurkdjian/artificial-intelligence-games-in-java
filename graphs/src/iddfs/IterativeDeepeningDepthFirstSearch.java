package iddfs;

import java.util.Stack;

public class IterativeDeepeningDepthFirstSearch {

    //the Node we are looking for
    private Node targetNode;
    //track if still looking for the item or not
    private boolean isTargetFound;

    public IterativeDeepeningDepthFirstSearch(Node targetNode){
        this.targetNode=targetNode;
    }

    public void run(Node root){

        int depth=0;

        while(!isTargetFound){
            System.out.println();
            dfs(root,depth);
            depth++;
        }

    }

    private void dfs(Node root, int depth){
        Stack<Node> stack=new Stack<>();
        stack.push(root);

        while(!stack.isEmpty()){

            Node actualNode=stack.pop();
            System.out.println(actualNode.getName());
            //check if we found the actual node
            if(actualNode.getName().equalsIgnoreCase(targetNode.getName())){
                System.out.println(targetNode.getName());
                System.out.println("The node has been found");
                isTargetFound=true;
                return;
            }

            //this is the actual Iterative Deepening depth first search
            if(actualNode.getDepthLevel()>=depth) continue;

                //standard DFS
            for(Node node : actualNode.getAdjancecyList()){
                node.setDepthLevel(actualNode.getDepthLevel()+1);
                stack.push(node);
            }

        }
    }

}
