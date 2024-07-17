package com.utkarshrathore.app.hd.dsa._007_linked_list;


public class _005_Rotate_Linked_List {

    public static void main(String[] args) {
        Node pal = LLUtils.generateLinkedList(new int[]{1, 2, 3, 4, 4, 3, 2, 1});
        LLUtils.printList(pal);
        int size = findSize(pal);
        int mid = size/2;
        reverseHalf(mid, pal);
    }

    static void reverseHalf(int index, Node l){
        Node temp = l;
        int i=0;
        while (i<index){
            temp = temp.next;
            i++;
        }
        Node mid = temp;
        Node rev = reverse(mid);
        LLUtils.printList(l);
    }

    static int findSize(Node head){
        int size = 0;
        while (head!=null){
            size++;
            head = head.next;
        }
        return size;
    }

    static Node reverse(Node head){
        Node curr = head;
        Node prev = null;
        while (curr != null){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
