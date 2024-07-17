package com.utkarshrathore.app.hd.dsa._007_linked_list;


public class _005_Find_Loop_Start_In_Linked_List {

    public static void main(String[] args) {

    }

    static Node addLinkedLists(Node l1, Node l2){
        l1  = reverse(l1);
        l2  = reverse(l2);
        int carry = 0;
        Node head = null;
        Node curr = null;
        for( ;l1!=null && l2!=null; ){
            int sum = l1.val+l2.val+carry;
            if(sum > 9){
                carry = 1;
                sum -= 10;
            }
            else carry = 0;
            if(curr == null){
                curr = new Node(sum);
                head = curr;
            }
            else {
                curr.next = new Node(sum);
                curr = curr.next;
            }
            l1 = l1.next;
            l2 = l2.next;
        }
        while (l1 != null){
            int sum = l1.val+carry;
            if(sum > 9){
                carry = 1;
                sum -= 10;
            }
            else carry = 0;
            curr.next = new Node(sum);
            l1 = l1.next;
        }
        while (l2 != null){
            int sum = l2.val+carry;
            if(sum > 9){
                carry = 1;
                sum -= 10;
            }
            else carry = 0;
            curr.next = new Node(sum);
            l2 = l2.next;
        }
        if(carry == 1){
            curr.next = new Node(carry);
        }
        head = reverse(head);
        return head;
    }

    static Node reverse(Node head){
        // HEAD -> [1] -> [2] -> [3] -> [4] -> NULL
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
