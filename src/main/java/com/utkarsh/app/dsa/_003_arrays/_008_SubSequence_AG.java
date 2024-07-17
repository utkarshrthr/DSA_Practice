package com.utkarshrathore.app.hd.dsa._003_arrays;

public class _008_SubSequence_AG {

    public static void main(String[] args) {
        String s = "adgagagfg";
        System.out.println(numbersOfAGSubsequence(s));
        System.out.println(numbersOfAGSubsequence2(s));
    }

    static int numbersOfAGSubsequence(String s){
        int count = 0;
        char[] ar = s.toCharArray();
        for(int i=0;i<ar.length; i++){
            if(ar[i] == 'a'){
                for(int j = i+1; j<ar.length; j++){
                    if(ar[j] == 'g'){
                        count++;
                    }
                }
            }
        }
        return count;
    }

    static int numbersOfAGSubsequence2(String s){ // "adgagagfg"
        int count = 0;
        char[] ar = s.toCharArray();
        int countA = 0;
        for(int i=0; i<ar.length; i++){
            if(ar[i] == 'a'){
                countA++;
            }
            if(ar[i] == 'g'){
                count+=countA;
            }
        }
        return count;
    }
}
