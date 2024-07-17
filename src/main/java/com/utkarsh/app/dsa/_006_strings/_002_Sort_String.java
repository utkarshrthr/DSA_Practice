package com.utkarshrathore.app.hd.dsa._006_strings;

public class _002_Sort_String {
    /*
    * Given a string containing lower case characters only. Sort the string.
    * */
    public static void main(String[] args) {
        System.out.println(solution("deacbsf"));
    }

    static String solution(String s){ // O(1) space, O(n)
        int[] ar = new int[26];
        for(char c: s.toCharArray()){
            ar[c-97]++;
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0; i< ar.length;i++){
            if(ar[i] != 0){
                int j = 0;
                while (j < ar[i]){
                    sb.append((char)(i+97));
                    j++;
                }
            }
        }
        return sb.toString();
    }
}
