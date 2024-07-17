package com.utkarshrathore.app.hd.dsa._007_linked_list;

import static com.utkarshrathore.app.hd.dsa._007_linked_list.LLUtils.generateLinkedList;
import static com.utkarshrathore.app.hd.dsa._007_linked_list.LLUtils.printList;

public class _002_Merge_Sorted_Linked_List {

    public static void main(String[] args) {
        Node l1 = generateLinkedList(new int[]{1, 3, 4});
        Node l2 = generateLinkedList(new int[]{2, 3});
        printList(l1);
        printList(l2);
        Node merged = mergeRecursively(l1, l2);
        printList(merged);
    }

    static Node merge(Node l1, Node l2){
        Node head;
        if(l1.val < l2.val){
            head = l1;
            l1 = l1.next;
        }
        else {
            head = l2;
            l2 = l2.next;
        }
        Node temp = head;
        Node t1 = l1;
        Node t2 = l2;
        while (t1 != null && t2 != null){
            if(t1.val < t2.val){
                temp.next = t1;
                t1 = t1.next;
            }
            else {
                temp.next = t2;
                t2 = t2.next;
            }
            temp = temp.next;
        }
        while (t1 != null){
            temp.next = t1;
            temp = temp.next;
            t1 = t1.next;
        }
        while (t2 != null){
            temp.next = t2;
            temp = temp.next;
            t2 = t2.next;
        }
        return head;
    }

    static Node mergeRecursively(Node l1, Node l2){
        if(l1 == null)
            return l2;
        if(l2 == null)
            return l1;
        if(l1.val < l2.val){
           l1.next = mergeRecursively(l1.next, l2);
            return l1;
        }
        l2.next = mergeRecursively(l1, l2.next);
        return l2;
    }
}
