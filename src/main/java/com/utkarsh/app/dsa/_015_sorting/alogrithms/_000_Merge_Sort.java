package com.utkarshrathore.app.hd.dsa._015_sorting.alogrithms;

import java.util.Arrays;

public class _000_Merge_Sort {
    /*
        Merge Sort: Sorting algorithm, with O(N) space & O(N^2) worst case complexity
    */
    public static void main(String[] args) {
        int[] ar1 = null;
        int[] ar2 = {};
        int[] ar3 = {0};
        int[] ar4 = {0, 1};
        int[] ar5 = {7, 4, 2, 9, 1, 3,7};
        int[] ar6 = {6, 5, 4, 3, 2, 1};
        margeSort(ar6);
        int[] ar7 = {1, 2, 3, 4, 5, 6, 7};
        margeSort(ar1);
        System.out.println(Arrays.toString(ar1));
        margeSort(ar2);
        System.out.println(Arrays.toString(ar2));
        margeSort(ar3);
        System.out.println(Arrays.toString(ar3));
        margeSort(ar4);
        System.out.println(Arrays.toString(ar4));
        margeSort(ar5);
        System.out.println(Arrays.toString(ar5));
        margeSort(ar6);
        System.out.println(Arrays.toString(ar6));
        margeSort(ar7);
        System.out.println(Arrays.toString(ar7));
    }

    static void margeSort(int[] ar){
        if(ar == null || ar.length < 2)
            return;
        int st = 0;
        int en = ar.length-1;
        mergeSort(ar, st, en);
    }

    static void mergeSort(int[] ar, int st, int en){
        if(st == en) // keep dividing the array into sub-array until single size sub-array is left
            return;
        int mid = st + (en-st)/2; // divide array in half
        mergeSort(ar, st, mid); // 0 to mid
        mergeSort(ar, mid+1, en); // mid+1 to end
        merge(ar, st, mid, en); // merge
    }

    static void merge(int[] ar, int st, int mid, int en){ // merging sub-array
        // create 2 sorted arrays from main arrays
        int[] left = new int[mid-st+1]; // at the very base case, we will get single elements
        int[] right = new int[en-mid];  //
        for(int i=0; i<left.length;i++){
            left[i] = ar[st+i]; //
        }
        for(int i=0; i<right.length;i++){
            right[i] = ar[mid+1+i]; //
        }
        // merge sorted arrays back to main array
        int k = st;
        int i = 0;
        int j = 0;
        while (i<left.length && j<right.length){
            if(left[i] < right[j]){
                ar[k] = left[i];
                i++;
            }
            else {
                ar[k] = right[j];
                j++;
            }
            k++;
        }
        while (i<left.length){
            ar[k] = left[i];
            i++;
            k++;
        }
        while (j<right.length){
            ar[k] = right[j];
            j++;
            k++;
        }
    }
}
