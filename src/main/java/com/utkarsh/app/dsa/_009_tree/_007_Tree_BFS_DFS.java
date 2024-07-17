package com.utkarshrathore.app.hd.dsa._009_tree;

import java.util.ArrayDeque;
import java.util.Queue;

public class _007_Tree_BFS_DFS {

    public static void main(String[] args) {
        BTNode root = generateTree();
        bfs(root);
        dfsPreOrder(root);
        System.out.println();
        dfsInOrder(root);
        System.out.println();
        dfsPostOrder(root);
    }

    static void dfsPreOrder(BTNode node){
        if(node == null)
            return;
        System.out.print(node.data + ", ");
        dfsPreOrder(node.left);
        dfsPreOrder(node.right);
    }

    static void dfsInOrder(BTNode node){
        if(node == null)
            return;
        dfsInOrder(node.left);
        System.out.print(node.data + ", ");
        dfsInOrder(node.right);
    }

    static void dfsPostOrder(BTNode node){
        if(node == null)
            return;
        dfsPostOrder(node.left);
        dfsPostOrder(node.right);
        System.out.print(node.data + ", ");
    }

    static void bfs(BTNode node){
        Queue<BTNode> nodes = new ArrayDeque<>();
        nodes.add(node);
        while (!nodes.isEmpty()){
            BTNode top = nodes.poll();
            System.out.print(top.data + ", ");
            if(top.left != null)
                nodes.add(top.left);
            if(top.right != null)
                nodes.add(top.right);
        }
        System.out.println();
    }

    static BTNode generateTree(){
        BTNode root = new BTNode(1);
        root.left = new BTNode(2);
        root.left.left = new BTNode(4);
        root.left.right = new BTNode(5);
        root.right = new BTNode(3);
        root.right.left = new BTNode(6);
        root.right.right = new BTNode(7);
        return root;
    }

    static class BTNode {
        int data;
        BTNode left;
        BTNode right;

        public BTNode(int data) {
            this.data = data;
        }
    }
}
