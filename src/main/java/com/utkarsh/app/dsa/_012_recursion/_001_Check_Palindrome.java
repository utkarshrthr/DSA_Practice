package com.utkarshrathore.app.hd.dsa._012_recursion;

public class _001_Check_Palindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome("naman"));
        System.out.println(isPalindrome("namay"));
        System.out.println(isPalindrome("namman"));
        System.out.println(isPalindrome("namxan"));
    }

    static boolean isPalindrome(String s){
        int len = s.length();
        if(len%2==0){
            return isPalindrome(s, len/2-1, len/2);
        }
        return isPalindrome(s,len/2, len/2);
    }

    static boolean isPalindrome(String s, int left, int right){
        if(left == 0 && right == s.length()-1){
            return s.charAt(left) == s.charAt(right);
        }
        if(s.charAt(left) != s.charAt(right)){
            return false;
        }
        return isPalindrome(s, left-1, right+1);
    }
}
