package dev.ea3;

public class Tree {

    private TreeNode root;

    public void insert(int value){
        if(root == null){
            this.root = new TreeNode(value);
        }else{
            root.insert(value);
        }

    }


}
