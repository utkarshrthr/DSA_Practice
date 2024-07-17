package com.utkarshrathore.app.hd.dsa._003_arrays;

public class _044_Kadane_Algorithm {
    /*
    * Kadane’s Algorithm only works for arrays with at least one positive number.
    * If all numbers in the array are negative, the algorithm will return 0 as the maximum sub-array sum.
    * The algorithm may not work for arrays with very large or very small values, as it can suffer
    * from overflow or underflow issues.
    *
    *
    * Maximum sum of a sub-array:
    *   if all elements positive: sum of all elements
    *   if all elements are negative: max element
    *   if elements are both +ve & -ve:
    *
    *   -1, 2, -5, 1, 7:
    *   curr = -1, maxsum = 0
    *
    * */

    public static void main(String[] args) {
        System.out.println(maxSubArraySum(new int[]{-1, 2, -5, 1, 7}, 5));
        System.out.println(maxSubArraySum(new int[]{-1, -2, -5, -4}, 4));
        System.out.println(maxSubArraySum(new int[]{1, 2, 5, 0}, 4));
        System.out.println(maxSubArraySum(new int[]{0, 0, 0, 0}, 4));
    }

    static int maxSubArraySum(int ar[], int n) {
        int max = Integer.MIN_VALUE, curr = 0; // -1, 2, -5, 1, 7
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            curr += ar[i];
            if (curr < 0) {
                curr = 0;
            }
            if (max < curr) {
                max = curr;
            }
            min = Math.min(ar[i], min);
        }
        return max == 0 ? min : max;
    }
}