package com.utkarshrathore.app.hd.dsa._003_arrays;

import java.util.Arrays;

public class _043_Equilibrium_Index {

    public static void main(String[] args) {
        int[] ar = {1, 2, 3};
        int sol = solution(ar);
        System.out.println(sol);
    }

    static int solution(int[] ar){
        int[] pref = new int[ar.length];
        int[] suff = new int[ar.length];
        int sum = 0;
        for(int i=0; i< ar.length;i++){
            sum += ar[i];
            pref[i] = sum;
        }
        sum = 0;
        for(int i= ar.length-1; i>=0;i--){
            sum += ar[i];
            suff[i] = sum;
        }
        for(int i=0; i< ar.length; i++){
            if(i==0){
                int leftSum = 0;
                int rightSum = suff[i+1];
                if(leftSum == rightSum)
                    return i;
            }
            else if(i == ar.length-1){
                int leftSum = pref[i-1];
                int rightSum = 0;
                if(leftSum == rightSum)
                    return i;
            }
            else {
                int leftSum = pref[i-1];
                int rightSum = suff[i+1];
                if(leftSum == rightSum)
                    return i;
            }
        }
        return -1;
    }

    static int equilibriumIndex(int[] ar){
        //ar = {-7, 1, 5, 2, -4, 3, 0};
        int[] prefixSum = new int[ar.length];
        prefixSum[0] = ar[0];
        int sum = ar[0];
        for(int i=1;i< ar.length;i++){
            sum+=ar[i];
            prefixSum[i] = sum;
        }
        System.out.println(Arrays.toString(prefixSum));
        for(int i=0;i< ar.length;i++){
            if(i==0){
                if(prefixSum[ar.length-1]-prefixSum[0] == 0)
                    return i;
                //System.out.println("index: "+i+", left-sum: "+ 0 + ", right-sum: "+ (prefixSum[ar.length-1]-prefixSum[0]));
            }
            else if(i== ar.length-1){
                if(prefixSum[i-1] == 0){
                    return i;
                }
            }
            else if(prefixSum[i-1] == (prefixSum[ar.length-1]-prefixSum[i])){
                return i;
            }
                //System.out.println("index: "+i+", left-sum: "+ prefixSum[i-1] + ", right-sum: "+ (prefixSum[ar.length-1]-prefixSum[i]));
        }
        return 0;
    }
}
