package com.utkarshrathore.app.hd.dsa._007_linked_list;

public class LLUtils {

    static Node generateLinkedList(int[] elements){
        Node first = new Node(elements[0]);
        Node head = first;
        for(int i=1; i< elements.length;i++){
            first.next = new Node(elements[i]);
            first = first.next;
        }
        return head;
    }

    static void printList(Node head){
        Node temp = head;
        System.out.print("HEAD -> ");
        while (temp != null){
            System.out.print(temp.val+" -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
}
