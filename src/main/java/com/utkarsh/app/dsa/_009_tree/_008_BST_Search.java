package com.utkarshrathore.app.hd.dsa._009_tree;

public class _008_BST_Search {
/*
    Binary Search Tree: Left < Root < Right
    Insertion & Searching: O(log N)
    The structure of BST is not fixed and depends on the order of insertion of elements.
    The in-order traversal of BST gives non-decreasing order of nodes.
*/

    public static void main(String[] args) {
        BSTNode root = generateBST();
        bstInOrder(root);
    }

    static void bstInOrder(BSTNode root){
        if(root == null)
            return;
        bstInOrder(root.left);
        System.out.print(root.data + ", ");
        bstInOrder(root.right);
    }

    static BSTNode generateBST(){
        int[] ar = {1, 2, 3, 4, 5, 6, 7};
        BSTNode root = new BSTNode();
        for(int e: ar){
            insert(root, e);
        }
        return root;
    }

    static void insert(BSTNode root, int data){
        if(root == null){
            root = new BSTNode(data);
        }
        else if(data < root.data){
            if(root.left == null)
                root.left = new BSTNode(root.data);
            else
                insert(root.left, data);
        }
        else {
            if(root.right == null)
                root.right = new BSTNode(root.data);
            else
                insert(root.right, data);
        }
    }

    static class BSTNode {
        int data;
        BSTNode left;
        BSTNode right;

        public BSTNode(int data) {
            this.data = data;
        }

        public BSTNode() {
        }
    }
}
