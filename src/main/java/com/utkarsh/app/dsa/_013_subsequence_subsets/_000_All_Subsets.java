package com.utkarshrathore.app.hd.dsa._013_subsequence_subsets;

import java.util.ArrayList;

public class _000_All_Subsets {
    /*
    *   {2, 4, 6} ->
    *   {}        -> {0, 0, 0}
     *  {6}       -> {0, 0, 1}
     *  {4}       -> {0, 1, 0}
     *  {4,6}     -> {0, 1, 1}
     *  {2}       -> {1, 0, 0}
     *  {2,6}     -> {1, 0, 1}
     *  {2,4}     -> {1, 1, 0}
    *   {2,4,6}   -> {1, 1, 1}
    * */

    public static void main(String[] args) {
        int[] ar = {2, 4, 6};
        int len = ar.length;
        int allSubSets = 1<<len; // no of subsets => 2^n
        for(int i=0;i<allSubSets;i++){ // 0,1,2,3,4,5,6,7
            ArrayList<Integer> subset = new ArrayList<>(); //
            for(int j=0; j<len; j++){ // 0, 1, 2
                if(checkSetBit(i, j)){ // check if jth bit of i is set,
                    subset.add(ar[j]);
                }
            }
           System.out.println(subset);
        }
    }

    static boolean checkSetBit(int i, int j){ // ith bit of j
        return (i & (1<<j)) > 0;
    }
}
