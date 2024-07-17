package com.utkarshrathore.app.hd.dsa._013_subsequence_subsets;

import java.util.ArrayList;
import java.util.concurrent.Executors;

public class _001_Subset_With_Sum_K {
    /*
    * Given an integer array of size N. Check if a subset exists with sum K.
    *   {3, -1, 0, 6, 2, -3, 5}, K = 10
    *   {3, -1, 6, 2}, {6, 2, -3, 5}, {-1, 6, 5}, {3, 2, 5}, {3, -1, 0, 6, -3, 5}
    * */
    public static void main(String[] args) {
        int[] ar = {3, -1, 0, 6, 2, -3, 5};
        solution(ar, 10);
    }

    /*
    *  1 => 2^N 1, N = 1
    *   N = 100
    * */

    static boolean solution(int[] ar, int k){ // T.C. => O(2^N * N)

        int len = ar.length;
        int allSubSets = 1<<len; // no of subsets => 2^n
        for(int i=0;i<allSubSets;i++){ // 0,1,2,3,4,5,6,7
            ArrayList<Integer> subset = new ArrayList<>(); //
            int sum = 0;
            for(int j=0; j<len; j++){ // 0, 1, 2
                if(checkSetBit(i, j)){ // check if jth bit of i is set,
                    subset.add(ar[j]);
                    // instead of creating subset, we can get the sum of subset elements and check with K
                    sum += ar[j];
                }
            }
            if(sum == k){
                System.out.println(subset);
            }
        }
        return false;
    }

    static boolean checkSetBit(int i, int j){ // ith bit of j
        return (i & (1<<j)) > 0;
    }
}
