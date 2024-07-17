package com.utkarshrathore.app.hd.dsa._010_hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class _001_Word_In_Dictionary {
    HashMap<Character, Integer> hm = new HashMap<>();

    public static void main(String[] args) {
        new _001_Word_In_Dictionary().solve(Arrays.asList("hello", "scaler", "interviewbit"),
                "adhbcfegskjlponmirqtxwuvzy");
    }
    /*
    * Case 1: If words are equal
    * Case 2: If word are of unequal length, but common part is equal, e.g. none & no
    * */

    public int solve(List<String> A, String B) {
        for(int i=0; i<B.length(); i++){
            hm.put(B.charAt(i), i+1); // dictionary
        }
        for(int i=0; i<A.size()-1; i++){
            String wordA = A.get(i); // hello
            String wordB = A.get(i+1); // scaler
            if(wordA.equals(wordB)){
                continue;
            }
            if(!areWordsInOrder(wordA, wordB)){
                return 0;
            }
        }
        return 1;
    }

    boolean areWordsInOrder(String a, String b){ // , none no
        char[] aa = a.toCharArray(); // [h, e, l, l, 0]
        char[] bb = b.toCharArray(); // [s, c, a, l, e, r]
        int i = 0; int j = 0;
        while(i < aa.length && j < bb.length){
            char A = aa[i]; // h
            char B = bb[j]; // s
            int indexA = hm.get(A);
            int indexB = hm.get(B);
            if(indexA < indexB){
                return true;
            }
            else if(indexA > indexB){
                return false;
            }
            i++;
            j++;
        }
        if(a.length() > b.length()){
            return false;
        }
        return true;
    }
}
