package com.utkarshrathore.app.hd.dsa._012_recursion;

import java.util.ArrayList;
import java.util.List;

public class _005_Reverse_String {

    public static void main(String[] args) {
        List<String> al = List.of("hello", "world", "yes");
        for (String s: al)
            System.out.println(reverseString(s));
    }

    static String reverseString(String s){
        StringBuilder sb = new StringBuilder();
        return reverseString(s, s.length()-1, sb);
    }

    static String reverseString(String s, int index, StringBuilder sb){
        if(index < 0){
            return sb.toString();
        }
        sb.append(s.charAt(index));
        return reverseString(s, index-1, sb);
    }
}
