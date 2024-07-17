package com.utkarshrathore.app.hd.dsa._003_arrays;

import java.util.Arrays;

public class _046_Prefix_Sum_Even_Odd {

    public static void main(String[] args) {
        prefixSum(new int[]{3, 4, -2, 8, 6, 2, 1, 3});
    }

    static void prefixSum(int[] ar){
        int N = ar.length;
        int[] pfEven = new int[N];
        int[] pfOdd = new int[N];
        int evenSum = 0;
        int oddSum = 0;
        for(int i=0; i< ar.length;i++){
            if(i%2==0){
               evenSum+=ar[i];
               pfEven[i]= evenSum;
               if(i+1<pfEven.length)
                 pfEven[i+1] = evenSum;
            }
            else {
                oddSum+=ar[i];
                pfOdd[i]= oddSum;
                if(i+1<pfOdd.length)
                    pfOdd[i+1] = oddSum;
            }
        }
        System.out.println(Arrays.toString(pfEven));
        System.out.println(Arrays.toString(pfOdd));
    }
}
