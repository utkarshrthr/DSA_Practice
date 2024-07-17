package com.utkarshrathore.app.hd.dsa._009_tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class _013_N_Ary_Tree_Siblings {

    public static void main(String[] args) {
        Node root = generateNAryTree();
        //nAryTreeBFS(root);
        nAryTreeSiblings(root, 14);
        nAryTreeSiblings(root, 6);
        nAryTreeSiblings(root, 70);
        nAryTreeSiblings(root, 99);
        nAryTreeSiblings(root, 2);
        nAryTreeSiblings(root, 50);
    }

    static Node generateNAryTree(){
        Node root = new Node(50);
        root.children = List.of(new Node(2), new Node(30), new Node(14), new Node(60));
        root.children.get(0).children = List.of(new Node(15), new Node(25));
        root.children.get(0).children.get(1).children = List.of(new Node(70), new Node(100));
        root.children.get(1).children = List.of(new Node(6), new Node(1));
        root.children.get(2).children = List.of(new Node(7));
        root.children.get(2).children.get(0).children = List.of(new Node(17), new Node(99),new Node(27));
        root.children.get(3).children = List.of(new Node(16));
        return root;
    }

    /*
    *   50,
    *    2,  30, 14, 60,
    *   15,  25,  6,  1,  7, 10
    *   70, 100, 17, 99, 27
    * */

    static void nAryTreeSiblings(Node root, int val){
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (true){
            int count = q.size();
            if(count == 0)
                break;
            List<Integer> siblings = new ArrayList<>();
            boolean siblingFound = false;
            while (count != 0){
                Node top = q.poll();
                count--;
                if(top.val == val){
                    siblingFound = true;
                }
                else {
                    siblings.add(top.val);
                }
                List<Node> children = top.children;
                for(Node child: children){
                    q.add(child);
                }
            }
            if(siblingFound){
                System.out.println(siblings);
                return;
            }
        }
    }

    static void nAryTreeBFS(Node root){
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int level = 0;
        while (true){
            int count = q.size();
            if(count == 0)
                break;
            System.out.println("Level: "+level);
            while (count != 0){
                Node top = q.poll();
                System.out.print(top.val +" -> ");
                count--;
                List<Node> children = top.children;
                for(Node child: children){
                    q.add(child);
                }
            }
            System.out.println();
            level++;
        }
    }

    static class Node {
        int val;
        List<Node> children;
        public Node(int val) {
            this.val = val;
            this.children = new ArrayList<>();
        }
    }
}
