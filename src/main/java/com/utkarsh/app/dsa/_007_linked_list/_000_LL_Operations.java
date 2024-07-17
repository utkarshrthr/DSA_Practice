package com.utkarshrathore.app.hd.dsa._007_linked_list;

public class _000_LL_Operations {

    public static void main(String[] args) {
        insert_node(1, 1);
        insert_node(2, 2);
        insert_node(3, 4);
        insert_node(3, 3);
        print_ll();
        delete_node(2);
        print_ll();
        delete_node(3);
        print_ll();

    }

    static class Node {
        int value;
        Node next;
        Node(int value){
            this.value = value;
            this.next = null;
        }
        Node(){}
    }

    static Node head;
    static int size;

    public static void insert_node(int position, int value) {
        if(position < 1 || position>(size+1)){
            return;
        }
        if(position == 1){
            if(head == null)
                head = new Node(value);
            else {
                Node node = new Node(value);
                node.next = head;
                head = node;
            }
        }
        else {
            int st = 1;
            Node temp = head;
            while(st < position-1){
                temp = temp.next;
                st++;
            }
            // HEAD -> [1]->NULL
            Node node = new Node(value); // [2]->NULL
            Node temp2 = temp.next;  // temp2 = [1]->NULL
            temp.next = node;
            node.next = temp2;
        }
        size++;
        // @params position, integer
        // @params value, integer
    }

    public static void delete_node(int position) {
        // @params position, integer
        if(position < 1 || position>(size+1)){
            return;
        }
        if(position == 1){
            head = head.next;
        }
        else {
            int st = 1;
            Node temp = head;
            while(st < position-1){
                temp = temp.next;
                st++;
            }
            // if temp is second last node
            Node temp2 = temp.next.next;
            temp.next = temp2;
        }
        size--;
    }

    public static void print_ll() {
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
