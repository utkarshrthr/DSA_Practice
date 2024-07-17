package com.utkarshrathore.app.hd.dsa._006_strings;

public class _005_Is_Palindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome("naman"));
        System.out.println(isPalindrome("namman"));
        System.out.println(isPalindrome("nammdn"));
    }

    static boolean isPalindrome(String s){
        char[] ar = s.toCharArray();
        int i = 0; int j = ar.length-1;
        while (i < j){
            if(ar[i] != ar[j])
                return false;
            i++;
            j--;
        }
        return true;
    }
}
