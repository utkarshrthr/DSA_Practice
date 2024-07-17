package com.utkarshrathore.app.hd.dsa._007_linked_list;

import java.util.Stack;

public class _001_Reverse_Linked_List {

    public static void main(String[] args) {
        Node head = LLUtils.generateLinkedList(new int[]{3, 1, 6, 2, 9, 0, 4, 8, 5, 7});
        LLUtils.printList(head);
        /*printList(head);
        head = reverseLinkedList2(head);
        printList(head);*/
        head = reverseLinkedListRecursion(head);
        LLUtils.printList(head);
    }

    static Node reverseLinkedList2(Node head){
        Stack<Integer> stack = new Stack<>();
        Node temp = head;
        while (temp != null){
            stack.add(temp.val);
            temp = temp.next;
        }
        Node newHead = new Node(stack.pop());
        temp = newHead;
        while (!stack.empty()){
            temp.next = new Node(stack.pop());
            temp = temp.next;
        }
        return newHead;
    }

    static Node reverseLinkedList(Node head){
        // HEAD->[1]->[2]->[3]->[4]->NULL
        Node curr = head;
        head = null;
        while (curr != null){
            Node temp = curr;
            curr = curr.next;
            temp.next = head;
            head = temp;
        }
        return head;
    }

    static Node reverseLinkedListRecursion(Node head){
        Node temp = head;
        return reverseLinkedListRecursively(temp);
    }

    private static Node reverseLinkedListRecursively(Node current){
        // HEAD->[1]->[2]->[3]->[4]->NULL
        if(current.next == null){
            return current;
        }
        Node node = reverseLinkedListRecursively(current.next);
        node.next = current;
        return node.next;
    }

/*
* reverseLinkedListRecursively([4])=> [4]->NULL
* reverseLinkedListRecursively([3]) [4]->[3]
* reverseLinkedListRecursively([2])
* reverseLinkedListRecursively([1])
* */
}
