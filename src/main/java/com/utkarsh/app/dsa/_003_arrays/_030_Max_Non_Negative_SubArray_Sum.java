package com.utkarshrathore.app.hd.dsa._003_arrays;

import java.util.ArrayList;
import java.util.List;

public class _030_Max_Non_Negative_SubArray_Sum {
    /*
    * Given an array of integers, A of length N, find out the maximum sum sub-array of non-negative numbers
    * from A. The sub-array should be contiguous i.e., a sub-array created by choosing the second and fourth
    * element and skipping the third element is invalid. Maximum sub-array is defined in terms of the sum of
    * the elements in the sub-array. Find and return the required subarray.
    * */

    public static void main(String[] args) {
        List<Integer> ar = List.of(1, 2, 5, -7, 2, 3);
        List<Integer> ar2 = List.of(10, -1, 2, 3, -4, 100);
        List<Integer> ar3 = List.of(10, -1, 2, 3, -4, 100);
        List<Integer> ar4 = List.of(10);
        List<Integer> ar5 = List.of(-10);
        List<Integer> ar6 = List.of(-10,1,2,-11);
        List<Integer> ar7 = List.of(1,2,-10,3,4);
        List<Integer> ar8 = List.of(1967513926,1540383426,-1303455736,-521595368);
        System.out.println(maxSubArray(ar8));
        System.out.println(maxSubArray(ar));
        System.out.println(maxSubArray(ar2));
        System.out.println(maxSubArray(ar3));
        System.out.println(maxSubArray(ar4));
        System.out.println(maxSubArray(ar5));
        System.out.println(maxSubArray(ar7));
    }

    /*
    *   1. If the logic involves intermediate sum, that sum may overflow,
    *   2. To handle overflow, check for constraints, E.g. 1 <= N <= 1e5 & -INT_MAX < A[i] <= INT_MAX,
    *   intermediate sum should be long instead of int
    *   3. Read question carefully, specially in case of negative, non-negative. When to include/exclude 0.
    *   4. Carefully dry-run for edge-cases and what would be output in such cases.
    * */


    static ArrayList<Integer> maxSubArray(List<Integer> A) {
        long currSum = 0; long maxSum = Long.MIN_VALUE; // -10,1,2,-11
        int st = 0; int en=0; // 0, 0, -1, 0
        int maxI = st; int maxJ = 0;
        for(int i=0; i<A.size(); i++){
            if(A.get(i) >= 0){
                currSum += A.get(i);
                en++;
            }
            else {
                if(currSum > maxSum){
                    maxSum = currSum;
                    maxI = st;
                    maxJ = en;
                }
                st = i+1;
                en = i+1;
                currSum = 0;
            }
        }
        if(currSum > maxSum){
            maxI = st;
            maxJ = A.size();
        }
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=maxI; i<maxJ;i++){
            al.add(A.get(i));
        }
        return al;
    }
}
