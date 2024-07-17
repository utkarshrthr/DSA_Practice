package com.utkarshrathore.app.hd.dsa._006_strings;

public class _004_Reverse_Sentence_By_Words {
    /*
    * input  => Are you as clever as I am
    * output => am I as clever as you Are
    *
    * Are you clever as I am => reverse => ma I sa revelc sa ouy erA => reverse words => am I as clever as you Are
    *
    * */
    public static void main(String[] args) {
        System.out.println(solution("Rahul is Here"));
    }

    static String solution(String input){
        char[] ar = input.toCharArray();
        int i = 0; int j = ar.length-1;
        while (i<j){
            char c = ar[i];
            ar[i] = ar[j];
            ar[j] = c;
            i++; j--;
        }
        i = 0; j = 0;
        for(;i< ar.length;i++){
            if(ar[i] == ' '){
                reverse(ar, j, i-1);
                j = i+1;
            }
        }
        // reverse last word
        reverse(ar, j, ar.length-1);
        return String.valueOf(ar);
    }

    static void reverse(char[] ar, int st, int en){
        while (st<en){
            char c = ar[st];
            ar[st] = ar[en];
            ar[en] = c;
            st++; en--;
        }
    }
}
