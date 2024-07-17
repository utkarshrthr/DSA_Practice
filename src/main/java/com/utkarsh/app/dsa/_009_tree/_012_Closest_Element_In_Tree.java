package com.utkarshrathore.app.hd.dsa._009_tree;

import java.util.ArrayDeque;
import java.util.Queue;

public class _012_Closest_Element_In_Tree {

    public static void main(String[] args) {
        int[] ar = {100, 20, 200, 10, 30, 150, 300};
        Node root = generateTree(ar);
        preOrder(root);
        System.out.println();
        System.out.println(solution(root, 100));
    }

    static int solution(Node root, int val){
        // using BFS
       // iterate over tree and keep min difference,
        Queue<Node> q = new ArrayDeque<>();
        q.add(root);
        int output = 0;
        int currentDiff = Integer.MAX_VALUE;
        int lastDiff = Integer.MAX_VALUE;
        while (!q.isEmpty()){
            Node top = q.poll();
            if(top.val == val){
                return val;
            }
            currentDiff = Math.abs(val-top.val);
            if(currentDiff < lastDiff){
                lastDiff = currentDiff;
                output = top.val;
            }
            if(top.left != null)
                q.add(top.left);
            if(top.right!= null)
                q.add(top.right);
        }
        return output;
    }

    static void preOrder(Node root){
        if(root == null)
            return;
        preOrder(root.left);
        System.out.print(root.val +" -> ");
        preOrder(root.right);
    }

    static Node generateTree(int[] ar){
        Node root = null;
        for(int i:ar){
            root = generateTree(root, i);
        }
        return root;
    }

    static Node generateTree(Node node, int val){
        if(node == null){
            node = new Node(val);
        }
        else if(val < node.val){
            node.left = generateTree(node.left, val);
        }
        else {
            node.right = generateTree(node.right, val);
        }
        return node;
    }

    static class Node {
        int val;
        Node left, right;
        public Node(int val){
            this.val = val;
            this.left = this.right = null;
        }
    }
}
