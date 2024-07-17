package com.utkarshrathore.app.hd.dsa._003_arrays;

import java.util.Arrays;

public class _006_Prefix_Product {

    public static void main(String[] args) {
        int[] input = {2, 4, 1, 3, 5};
        int[] out = solution(input);
        System.out.println(Arrays.toString(out));
    }

    private static int[] solution(int[] ar) {
        int[] pref = new int[ar.length];
        int[] suff = new int[ar.length];
        int prodPref = 1;
        int prodSuff = 1;
        for(int i=0, j = ar.length-1; i<ar.length && j>=0; i++, j--){
            pref[i] = prodPref*ar[i];
            prodPref = pref[i];
            suff[j] = prodSuff*ar[j];
            prodSuff = suff[j];
        }
        int[] out = new int[ar.length];
        for(int i=0;i< ar.length;i++){
            if(i==0){
                out[i] = suff[i+1];
            }
            else if(i == ar.length-1){
                out[i] = pref[i-1];
            }
            else {
                out[i] = pref[i-1]*suff[i+1];
            }
        }
        return out;
    }
}
