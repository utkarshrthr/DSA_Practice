package com.utkarshrathore.app.hd.dsa._003_arrays;

public class _033_Start_End_Of_Sub_Arrays_Size_K {

    public static void main(String[] args) {
        printAllSubArrays(new int[]{1, 2, 3, 4, 5}, 3);
        printAllSubArrays(new int[]{1, 2, 3, 4, 5}, 1);
        printAllSubArrays(new int[]{1, 2, 3, 4, 5}, 5);
    }

    static void printAllSubArrays(int[] ar, int k){
        int i = 0;
        int j = k-1;
        while (j<ar.length){
            System.out.println("start: "+ ar[i] + ", end: "+ ar[j]);
            i++; j++;
        }
    }
    //System.out.print(ar[j] + " ");
}
