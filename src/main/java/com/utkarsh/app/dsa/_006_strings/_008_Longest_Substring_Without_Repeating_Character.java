package com.utkarshrathore.app.hd.dsa._006_strings;

import java.util.HashMap;

public class _008_Longest_Substring_Without_Repeating_Character {

    public static void main(String[] args) {
        /*System.out.println(solution("ABCDEFGABEF"));
        System.out.println(solution("GEEKSFORGEEKS"));
        System.out.println(solution("bbbbb"));*/
        System.out.println(solution("dvdf"));
    }

    static int solution(String s){
        int maxLen = Integer.MIN_VALUE;
        HashMap<Character, Integer> index = new HashMap<>();
        int len = s.length();
        int i = 0;
        int count = 0;
        while (i<len){
            char c = s.charAt(i);
            if(index.containsKey(c)){
                i = index.get(c)+1;
                index.remove(c);
                maxLen = Math.max(count, maxLen);
                count = 0;
            }
            else {
                index.put(c, i);
                i++;
                count++;
            }
        }
        return maxLen;
    }
}
