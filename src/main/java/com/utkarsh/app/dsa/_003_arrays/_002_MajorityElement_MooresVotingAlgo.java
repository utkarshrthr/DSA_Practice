package com.utkarshrathore.app.hd.dsa._003_arrays;

/*
* Moore's Voting Algorithm: To find the majority element in the array, i.e. the element that occurs more
* tha N/2 times in the array, where N is the size of the array.
*
* Idea: In any array, if there is a majority element, i.e., its frequency is > N/2, then in every
* arrangement of that array elements, the majority element must occur at consecutive positions for at
* least 2 positions.
* */

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class _002_MajorityElement_MooresVotingAlgo {

    public static void main(String[] args) {
    }

    static int majorityElement0(int[] ar){
        // count frequency of each element using 2 nested loops
        return 0;
    }

    public static int majorityElement1(int[] ar){ // using HashMap, 1 iterations
        if(ar==null || ar.length<1)
            throw new RuntimeException("Majority Element not found");
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i:ar){
            int freq = map.getOrDefault(i, 0)+1;
            if(freq > ar.length/2)
                return i;
            map.put(i, freq);
        }
        throw new RuntimeException("Majority Element not found");
    }

    public static int majorityElement2(int[] ar){// Moore's Voting Algo
        if(ar == null || ar.length < 1)
            throw new RuntimeException("Majority Element not found");
        int maj = ar[0];
        int count = 1;
        for(int i=1; i<ar.length; i++){
            if(maj == ar[i]){
                count++;
            }
            else {
                maj = ar[i];
                count = 0;
            }
        }
        int count2 = 0;
        for(int i:ar){
            if(i == maj)
                count2++;
        }
        if(count2 > ar.length/2)
            return maj;
        throw new RuntimeException("Majority Element not found");
    }

    public static int majorityElement3(int[] ar){ // using BST, 2 iterations
        if(ar == null || ar.length < 1)
            throw new RuntimeException("Majority Element not found");
        BST bst = createBST(ar);
        Queue<BST.Node> q = new LinkedList<>();
        q.add(bst.root);
        while (!q.isEmpty()){
            BST.Node top = q.poll();
            if(top != null){
                if(top.count > ar.length/2)
                    return top.data;
                else {
                    q.add(top.left);
                    q.add(top.right);
                }
            }
        }
        throw new RuntimeException("Majority Element not found");
    }

    private static BST createBST(int[] ar){
        BST bst = new BST();
        for(int i: ar)
            bst.insert(i);
        return bst;
    }

    static final class BST {
        private Node root;

        void insert(int element){
            if(this.root == null){
                this.root = new Node(element);
            }
            else {
                insert(root, element);
            }
        }

        private void insert(Node node, int element){
            if(element < node.data){
                if(node.left == null)
                    node.left = new Node(element);
                else
                    insert(node.left,element);
            }
            else if(element > node.data){
                if(node.right == null)
                    node.right = new Node(element);
                else
                    insert(node.right, element);
            }
            else {
                node.count++;
            }
        }

        private final class Node {
            int data;
            int count;
            Node left;
            Node right;

            public Node(int data) {
                this.data = data;
                this.left = this.right = null;
                this.count = 1;
            }
        }
    }
}
