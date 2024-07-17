package com.utkarshrathore.app.hd.dsa._007_linked_list;


public class _000_Linked_List {


    public static void main(String[] args) {
        Node head = LLUtils.generateLinkedList(new int[]{1, 2, 3, 4, 5, 6});
        /*Node tail = tail(head);
        System.out.println(tail.val);
        //    LLUtils.printList(head);
        System.out.println(size(head));
        Node newHead = prepend(head, 0);
        LLUtils.printList(head);
        LLUtils.printList(newHead);
        append(head, 7);
        LLUtils.printList(newHead);
        System.out.println(tail.val);*/
        insert(head, 2, 99);
        LLUtils.printList(head);
    }

    static Node tail(Node head){
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        return temp;
    }

    static Node prepend(Node head, int data){
        Node node = new Node(data);
        if(head != null){
            node.next = head;
        }
        head = node;
        return head;
    }

    static Node append(Node head, int data){
        if(head == null){
            head = new Node(data);
        }
        else {
            Node temp = head;
            while (temp.next != null){
                temp = temp.next;
            }
            temp.next = new Node(data);
        }
        return head;
    }

    static Node insert(Node head, int position, int data){ // 0 based indexing
        if(position == 0){
            return prepend(head, data);
        }
        if(position == size(head)){
            append(head, data);
        }
        else {
            Node temp = head;
            int i = 0;
            while (i<position-1){
                temp = temp.next;
                i++;
            }
            // HEAD->0->1->2->3->4->5->NULL
            // HEAD->0->1->2->99->3->4->5->NULL
            Node node = new Node(data);
            node.next = temp.next;
            temp.next = node;
        }
        return head;
    }

    /*static Node delete(Node head, int position){

    }*/

    static int size(Node head){
        Node temp = head;
        int size = 0;
        while (temp != null){
            size++;
            temp = temp.next;
        }
        return size;
    }
}
