package com.utkarshrathore.app.hd.dsa._003_arrays;

public class _039_Sum_Of_Sub_Arrays {

    public static void main(String[] args) {
        int[] ar = {1, 2, 3, 4};
        /*
        * Sums:
        *   1, 2, 3, 4
        *   3, 6, 10
        *   5, 9
        *   7
        * */
        solution(ar);
    }

    static void solution(int[] ar){
        int[] pref = new int[ar.length];
        int sum = 0;
        for(int i=0; i< ar.length; i++){
            pref[i] = (sum += ar[i]);
        }
        int i = -1;
        int j = 0;
        while (i<ar.length){
             if(i >= 0){
                 j = i+1;
             }
             while (j< ar.length){
                 if(i < 0){
                     System.out.println(pref[j]);
                 }
                 else {
                     System.out.println(pref[j]-pref[i]);
                 }
                 j++;
             }
             i++;
        }
    }
}
