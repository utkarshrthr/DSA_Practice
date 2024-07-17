package com.utkarshrathore.app.hd.dsa._003_arrays;

public class _040_Max_Min_In_Array {

    public static void main(String[] args) {
        maxMin(new int[]{1, 6, 2, 8, 4, 3, 9, 0});
        maxEvenMinOdd(new int[]{1, 6, 2, 8, 4, 3, 9, 0});
    }

    static void maxMin(int[] ar){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i: ar){
            max = Math.max(i, max);
            min = Math.min(i, min);
        }
        System.out.printf("Max: %d, Min: %d\n", max, min);
    }

    static void maxEvenMinOdd(int[] ar){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i: ar){
            if(i%2==0)
                max = Math.max(i, max);
            else
                min = Math.min(i, min);
        }
        System.out.printf("Max: %d, Min: %d\n", max, min);
    }
}
