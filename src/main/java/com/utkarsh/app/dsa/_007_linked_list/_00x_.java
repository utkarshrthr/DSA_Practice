package com.utkarshrathore.app.hd.dsa._007_linked_list;

import java.util.ArrayList;

public class _00x_ {

    ListNode head = null;
    ListNode tail = head;
    int size = 0;

    public ListNode solve(ArrayList<ArrayList<Integer>> A) {
        for(ArrayList<Integer> al: A){
            int x = al.get(0);
            int y = al.get(1);
            int z = al.get(2);
            if(x == 0){
                prepend(y);
            }
            else if(x == 1){
                append(y);
            }
            else if(x == 2){
                insert(y, z);
            }
            else {
                delete(y);
            }
        }
        return head;
    }

    void prepend(int val){
        ListNode n = new ListNode(val);
        if(head == null){
            head = n;
            tail = n;
        }
        else {
            n.next = head;
            head = n;
        }
        size++;
    }

    void append(int val){
        ListNode n = new ListNode(val);
        if(head == null){
            head = n;
            tail = n;
        }
        else {
            tail.next = n;
            tail = n;
        }
        size++;

        ListNode newNode = new ListNode(val);
        if (head == null) {
            head = newNode;
            tail = newNode;
            size++;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    void insert(int val, int position){
        if(position < 0|| position > (size+1))
            return;
        if(position == 0){
            prepend(val);
            return;
        }
        if(position == size){
            append(val);
            return;
        }
        ListNode temp = head;
        int count = 0;
        while (count < position - 1) {
            temp = temp.next;
            count++;
        }
        ListNode newNode = new ListNode(val);
        newNode.next = temp.next;
        temp.next = newNode;
        size++;
    }
    //[[1,13,-1],[0,12,-1],[0,11,-1],[1,14,-1],[2,2,0],[2,0,-1],[2,8,6],[2,8,7],[2,8,5],[3,0,5]]
    void delete(int position){
        if(position < 0 || position >=size || head == null) //
            return;
        if(position == 0){
            if(size == 1){
                head = null;
                tail = null;
            }
            size--;
            return;
        }
        // Head -> 1 -> 2 -> 3 -> 4 -> Null
        ListNode temp = head;
        int i = 0;
        while(i<position-1){
            i++;
            temp = temp.next;
        }
        temp.next = temp.next.next;
        if (position == size - 1) {
            tail = temp;
        }
        size--;
    }
    /*
    * if (index < 0 || index >= size)
			return;
		if (index == 0) {
			if (head == null)
				return;
			if (head == tail) {
				head = head.next;
				tail = head;
				size--;
				return;
			}
			head = head.next;
			size--;
			return;
		}
		ListNode temp = head;
		int count = 0;
		while (count < index - 1) {
			temp = temp.next;
			count++;
		}
		temp.next = temp.next.next;
		if (index == size - 1) {
			tail = temp;
		}
        size--;
    * */
    class ListNode {
      public int val;
      public ListNode next;
      ListNode(int x) { val = x; next = null; }
  }
}
