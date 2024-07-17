package com.utkarshrathore.app.hd.dsa._015_sorting.alogrithms;

import java.util.Arrays;

public class _000_Insertion_Sort {
    /*
        Insertion Sort: In-place sorting algorithm, with O(N^2) worst case complexity
        Algorithm:
            1. Iterate from start of the array
            2. Find first element at incorrect place according to some order
            3. Place the element to its correct position by moving all element 1 place left/right
            4. Repeat step 1 to 3
    * */
    public static void main(String[] args) {
        int[] ar1 = null;
        int[] ar2 = {};
        int[] ar3 = {0};
        int[] ar4 = {0, 1};
        int[] ar5 = {7, 4, 2, 9, 1, 3,7};
        int[] ar6 = {6, 5, 4, 3, 2, 1};
        int[] ar7 = {1, 2, 3, 4, 5, 6, 7};
        insertionSort(ar1);
        System.out.println(Arrays.toString(ar1));
        insertionSort(ar2);
        System.out.println(Arrays.toString(ar2));
        insertionSort(ar3);
        System.out.println(Arrays.toString(ar3));
        insertionSort(ar4);
        System.out.println(Arrays.toString(ar4));
        insertionSort(ar5);
        System.out.println(Arrays.toString(ar5));
        insertionSort(ar6);
        System.out.println(Arrays.toString(ar6));
        insertionSort(ar7);
        System.out.println(Arrays.toString(ar7));
    }

    static void insertionSort(int[] ar){
        if(ar == null || ar.length < 2)
            return;
        int size = ar.length;
        for(int i=0;i<size-1;i++){
            boolean isSorted = true;
            for(int j=i+1; j<size;j++){
                if(ar[j] < ar[j-1]){
                    isSorted = false;
                    int temp = ar[j];
                    while (j>0 && ar[j] < ar[j-1]){
                        ar[j] = ar[j-1];
                        j--;
                    }
                    ar[j]=temp;
                }
            }
            if(isSorted)
                break;
        }
    }
}
