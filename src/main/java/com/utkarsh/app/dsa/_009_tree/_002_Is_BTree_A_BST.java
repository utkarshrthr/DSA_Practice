package com.utkarshrathore.app.hd.dsa._009_tree;

public class _002_Is_BTree_A_BST {




    static _001_BTree_Height.BTreeNode generateTree(){
        _001_BTree_Height.BTreeNode root = new _001_BTree_Height.BTreeNode(1);
        root.left = new _001_BTree_Height.BTreeNode(2);
        root.left.left = new _001_BTree_Height.BTreeNode(4);
        root.left.right = new _001_BTree_Height.BTreeNode(5);
        root.right = new _001_BTree_Height.BTreeNode(3);
        root.right.left = new _001_BTree_Height.BTreeNode(6);
        root.right.right = new _001_BTree_Height.BTreeNode(7);
        return root;
    }

    static class BTreeNode {
        int data;
        _001_BTree_Height.BTreeNode left;
        _001_BTree_Height.BTreeNode right;

        public BTreeNode(int data) {
            this.data = data;
        }
    }
}
