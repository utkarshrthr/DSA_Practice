package com.utkarshrathore.app.hd.dsa._015_sorting.alogrithms;

import java.util.Arrays;

public class _000_Bubble_Sort {
    /*
        Bubble Sort: In-place stable sorting algorithm, with O(N^2) worst case complexity
        Algorithm:
            1. Iterate from start to end of the array
            2. Compare adjacent elements and swap according to some order
            3. Repeat step 1 and 2 until array is sorted
            4. Update new end by -1
    * */
    public static void main(String[] args) {
        int[] ar1 = null;
        int[] ar2 = {};
        int[] ar3 = {0};
        int[] ar4 = {0, 1};
        int[] ar5 = {7, 4, 2, 9, 1, 3,7};
        int[] ar6 = {6, 5, 4, 3, 2, 1};
        int[] ar7 = {1, 2, 3, 4, 5, 6, 7};
        bubbleSort(ar1);
        System.out.println(Arrays.toString(ar1));
        bubbleSort(ar2);
        System.out.println(Arrays.toString(ar2));
        bubbleSort(ar3);
        System.out.println(Arrays.toString(ar3));
        bubbleSort(ar4);
        System.out.println(Arrays.toString(ar4));
        bubbleSort(ar5);
        System.out.println(Arrays.toString(ar5));
        bubbleSort(ar6);
        System.out.println(Arrays.toString(ar6));
        bubbleSort(ar7);
        System.out.println(Arrays.toString(ar7));
    }

    static void bubbleSort(int[] ar){
        if(ar == null || ar.length < 2)
            return;
        for(int i=0;i<ar.length; i++) {
            int swaps = 0;
            for (int j = 1; j < ar.length; j++) {
                if(ar[j]<ar[j-1]){
                    int temp = ar[j];
                    ar[j] = ar[j-1];
                    ar[j-1] = temp;
                    swaps++;
                }
            }
            if (swaps == 0) // already sorted
                break;
        }
    }
}
