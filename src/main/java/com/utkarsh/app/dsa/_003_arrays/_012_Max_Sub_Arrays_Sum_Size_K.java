package com.utkarshrathore.app.hd.dsa._003_arrays;

public class _012_Max_Sub_Arrays_Sum_Size_K {

    public static void main(String[] args) {
        maxSumSubArraySizeK(new int[]{-3, 4, -2, 5, 3, -2, 8, 2, -1, 4}, 5);
        maxSumSubArraySizeKPrefixSum(new int[]{-3, 4, -2, 5, 3, -2, 8, 2, -1, 4}, 5);
    }

    static void maxSumSubArraySizeK(int[] ar, int k){
        int sum = 0;
        for(int i=0; i<k;i++){
            sum+=ar[i];
        }
        int i = 0; int j = k;
        while (j < ar.length){
            int newSum = (sum-ar[i] +ar[j]);
            sum = Math.max(sum, newSum);
            i++; j++;
        }
        System.out.println(sum);
    }

    static int maxSumSubArraySizeKPrefixSum(int[] ar, int k){
        int sum = 0;
        int[] prefixSum = new int[ar.length];
        for(int i = 0; i< ar.length; i++){
            sum += ar[0];
            prefixSum[i] = sum;
        }
        int maxSum = Integer.MIN_VALUE;
        for(int i = k-1; i< ar.length; i++){
            if(i == 0){
                maxSum = Math.max(maxSum, prefixSum[i]);
            }
            else { // k = 5, i = 4, i-k+1 = 4-5+1
                maxSum = Math.max(maxSum, prefixSum[i] - prefixSum[i-k+1]);
            }
        }
        return maxSum;
    }
}
