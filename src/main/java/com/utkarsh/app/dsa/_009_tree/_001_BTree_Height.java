package com.utkarshrathore.app.hd.dsa._009_tree;

public class _001_BTree_Height {

    public static void main(String[] args) {
        BTreeNode root = generateTree();
        System.out.println(height(new BTreeNode(1)));
    }


    static int height(BTreeNode root){
        if(root == null)
            return 0;
        int left = 1 + height(root.left);
        int right = 1 + height(root.right);
        return Math.max(left, right);
    }

    static BTreeNode generateTree(){
        BTreeNode root = new BTreeNode(1);
        root.left = new BTreeNode(2);
        root.left.left = new BTreeNode(4);
        root.left.right = new BTreeNode(5);
        root.right = new BTreeNode(3);
        root.right.left = new BTreeNode(6);
        root.right.right = new BTreeNode(7);
        return root;
    }

    static class BTreeNode {
        int data;
        BTreeNode left;
        BTreeNode right;

        public BTreeNode(int data) {
            this.data = data;
        }
    }
}
