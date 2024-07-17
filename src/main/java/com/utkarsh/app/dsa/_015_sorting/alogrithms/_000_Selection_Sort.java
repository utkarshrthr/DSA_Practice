package com.utkarshrathore.app.hd.dsa._015_sorting.alogrithms;

import java.util.Arrays;

public class _000_Selection_Sort {
    /*
        Selection Sort: In-place sorting algorithm, with O(N^2) worst case complexity
    *
        Algorithm:
            1. Iterate from start to end of the array
            2. Find max element
            3. Move the max element to the end of the array
            4. Update new end by -1
    * */
    public static void main(String[] args) {
        int[] ar1 = null;
        int[] ar2 = {};
        int[] ar3 = {0};
        int[] ar4 = {0, 1};
        int[] ar5 = {7, 4, 2, 9, 1, 3, 7};
//        int[] ar5 = {7, 4, 2, 7, 1, 3, 9};
        int[] ar6 = {6, 5, 4, 3, 2, 1};
        int[] ar7 = {1, 2, 3, 4, 5, 6, 7};
        selectionSort(ar1);
        System.out.println(Arrays.toString(ar1));
        selectionSort(ar2);
        System.out.println(Arrays.toString(ar2));
        selectionSort(ar3);
        System.out.println(Arrays.toString(ar3));
        selectionSort(ar4);
        System.out.println(Arrays.toString(ar4));
        selectionSort(ar5);
        System.out.println(Arrays.toString(ar5));
        selectionSort(ar6);
        System.out.println(Arrays.toString(ar6));
        selectionSort(ar7);
        System.out.println(Arrays.toString(ar7));
    }

    static void selectionSort(int[] ar){
        if(ar == null || ar.length < 2)
            return;
        int size = ar.length;
        while (size>0){
            int max = Integer.MIN_VALUE;
            int index = -1;
            for(int i=0;i<size;i++){
                if(max < ar[i]){
                    max = ar[i];
                    index = i;
                }
            }
            int temp = ar[size-1];
            ar[size-1] = ar[index];
            ar[index] = temp;
            size--;
        }
    }
}
