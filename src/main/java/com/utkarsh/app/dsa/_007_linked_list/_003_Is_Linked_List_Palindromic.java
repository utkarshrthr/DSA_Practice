package com.utkarshrathore.app.hd.dsa._007_linked_list;

import java.util.Stack;

public class _003_Is_Linked_List_Palindromic {

    // [1, 2, 3, 4, 3, 2, 1] N = 7

    public static void main(String[] args) {
        Node list = LLUtils.generateLinkedList(new int[]{1, 2, 3, 4, 3, 2, 1});
        System.out.println(palindromeUsingString(list));
        System.out.println(palindromeUsingNumber(list));
        System.out.println(palindromeUsingStack(list));
    }

    // using string/number
    static boolean palindromeUsingString(Node head){
        Node temp = head;
        StringBuilder original = new StringBuilder();
        StringBuilder reverse = new StringBuilder();
        while (temp != null){
            original.append(temp.val);
            reverse.append(temp.val);
            temp = temp.next;
        }

        return reverse.toString().equals(original.reverse().toString());
    }

    static boolean palindromeUsingNumber(Node head){
        Node temp = head;
        int num = 0;
        while (temp != null){
            num*=10;
            num += temp.val;
            temp = temp.next;
        }
        int rev = num;
        int reverse = 0;
        while (rev != 0){
            reverse *= 10;
            reverse += rev%10;
            rev /= 10;
        }
        return num == reverse;
    }

    static boolean palindromeUsingStack(Node head){
        Stack<Integer> stack = new Stack<>();
        Node temp = head;
        while (temp != null){
            stack.push(temp.val);
            temp = temp.next;
        }
        temp = head;
        while (!stack.isEmpty()){
            if(stack.pop() != temp.val){
                return false;
            }
            temp = temp.next;
        }
        return true;
    }
}
