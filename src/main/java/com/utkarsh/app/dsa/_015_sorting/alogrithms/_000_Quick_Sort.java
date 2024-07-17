package com.utkarshrathore.app.hd.dsa._015_sorting.alogrithms;

import java.util.Arrays;

public class _000_Quick_Sort {
    /*
        Quick Sort: O(NLogN)
    */
    public static void main(String[] args) {
        int[] ar1 = null;
        int[] ar2 = {};
        int[] ar3 = {0};
        int[] ar4 = {0, 1};
        int[] ar5 = {7, 4, 2, 9, 1, 3,7};
        int[] ar6 = {6, 5, 4, 3, 2, 1};
        int[] ar7 = {1, 2, 3, 4, 5, 6, 7};
        quickSort(ar1);
        System.out.println(Arrays.toString(ar1));
        quickSort(ar2);
        System.out.println(Arrays.toString(ar2));
        quickSort(ar3);
        System.out.println(Arrays.toString(ar3));
        quickSort(ar4);
        System.out.println(Arrays.toString(ar4));
        quickSort(ar5);
        System.out.println(Arrays.toString(ar5));
        quickSort(ar6);
        System.out.println(Arrays.toString(ar6));
        quickSort(ar7);
        System.out.println(Arrays.toString(ar7));
    }

    static void quickSort(int[] ar){
        if(ar == null || ar.length < 2)
            return;
        sort(ar, 0, ar.length-1);
    }

    static void sort(int[] ar, int st, int en){
        int pivot = partition(ar, st, en);
        sort(ar, st, pivot-1);
        sort(ar, pivot, en);
    }

    static int partition(int[] ar, int st, int en){
        // {7, 4, 2, 9, 1, 3, 7};
        int pivot = ar[0];
        int i= st;
        return pivot;
    }
}
