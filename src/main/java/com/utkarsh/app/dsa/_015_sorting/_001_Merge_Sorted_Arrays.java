package com.utkarshrathore.app.hd.dsa._015_sorting;

import java.util.Arrays;

public class _001_Merge_Sorted_Arrays {

    public static void main(String[] args) {
        int[] res = mergeSortedArrays(new int[]{2, 4, 6, 8}, new int[]{1, 3, 5, 5, 7, 8});
        System.out.println(Arrays.toString(res));
    }

    static int[] mergeSortedArrays(int[] a, int[] b){
        int[] ar = new int[a.length+b.length];
        int i = 0; int j = 0; int k = 0;
        while(i < a.length && j < b.length){
            if(a[i]<b[j]){
                ar[k] = a[i];
                i++;
            }
            else {
                ar[k] = b[j];
                j++;
            }
            k++;
        }
        while(i<a.length){
            ar[k] = a[i];
            i++;
            k++;
        }
        while(j<b.length){
            ar[k] = b[j];
            j++;
            k++;
        }
        return ar;
    }
}
