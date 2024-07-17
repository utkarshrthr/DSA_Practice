package com.utkarshrathore.app.hd.dsa._009_tree;

public class _008_BST {
/*
    Binary Search Tree: Left < Root < Right
    Insertion & Searching: O(log N)
    The structure of BST is not fixed and depends on the order of insertion of elements.
    The in-order traversal of BST gives non-decreasing order of nodes.
*/

    public static void main(String[] args) {
        BSTree tree = generateTree();
        bstInOrder(tree.root);
    }

    static void bstInOrder(BSTNode node){
        if (node == null)
            return;
        bstInOrder(node.left);
        System.out.print(node.data + ", ");
        bstInOrder(node.right);
    }

    static BSTree generateTree(){
        int[] ar = {5, 3, 2, 4, 7, 6, 8};
        BSTree root = new BSTree();
        for(int e: ar){
            root.insert(e);
        }
        return root;
    }

    static class BSTree {
        BSTNode root;

        BSTree(){
        }
        BSTree(int data){
            this.root = new BSTNode(data);
        }

        void insert(int data){
            if(root == null)
                this.root = new BSTNode(data);
            else if(data < root.data){
                root.left = insert(root.left, data);
            }
            else
                root.right = insert(root.right, data);
        }

        BSTNode insert(BSTNode root, int data){
            if(root == null){
                root = new BSTNode(data);
                return root;
            }
            else if(data < root.data){
                root.left = insert(root.left, data);
            }
            else
                root.right = insert(root.right, data);
            return root;
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
