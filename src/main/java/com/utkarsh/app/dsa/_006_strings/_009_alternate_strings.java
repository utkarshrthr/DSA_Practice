package com.utkarshrathore.app.hd.dsa._006_strings;

public class _009_alternate_strings {
    // https://www.hackerrank.com/challenges/two-characters/problem
    public static void main(String[] args) {
        alternate("asvkugfiugsalddlasguifgukvsa");
    }

    static int alternate(String s) {
        int[] map = new int[26]; // frequency of each alphabet
        char[] ar = s.toCharArray();
        for(char c: ar){
            map[c-97]++;
        }
        int max = 0;
        for(int i=0; i<ar.length;i++){
            char first = ar[i];
            int f1 = map[first-97];
            for(int j=i+1; j<ar.length; j++){
                char sec = ar[j];
                if(sec != first){
                    int f2 = map[sec-97];
                    char curr = sec;
                    if(f1 == f2 || f1-f2 == 1){
                        boolean isValid = false;
                        for(int k=j+1;k<ar.length; k++){
                            if(ar[k] == first || ar[k] == sec){
                                if(curr == sec && ar[k] != first){
                                    isValid = true;
                                    break;
                                }
                                else if(curr == first && ar[k] != sec){
                                    isValid = true;
                                    break;
                                }
                                else {
                                    curr = ar[k];
                                }
                            }
                        }
                        if(!isValid){
                            max = Math.max(max, f1+f2);
                        }
                    }
                }
            }
            map[first-97]--;
        }
        return max;
        /*int[] map = new int[26];
        char[] ar = s.toCharArray();
        for(char c: ar){
            map[c-97]++;
        }
        int max = 0;
        for(int i=0; i<ar.length;i++){
            char first = ar[i];
            int f1 = map[first-97];
            for(int j=i+1; j<ar.length; j++){
                int sec = ar[j];
                if(sec != first){
                    int f2 = map[sec-97];
                    if(f1 == f2 || f1-f2 == 1){
                        max = Math.max(max, f1+f2);
                    }
                }
            }
            map[first-97]--;
        }
        return max;*/

    }
}
