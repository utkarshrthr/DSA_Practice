package com.utkarshrathore.app.hd.dsa._003_arrays;

public class _013_Print_All_Sub_Array_Sum {

    public static void main(String[] args) {
        printAllSubArraysSum(new int[]{3, -1, 0, 2});
    }

    static void printAllSubArraysSum(int[] ar){
        int allSum = 0;
        for(int i=0;i<ar.length;i++){
            int sum = 0;
            for(int j = i;j<ar.length;j++){
                sum+=ar[j];
                System.out.println(sum);
                allSum += sum;
            }
        }
        System.out.println(allSum);
    }

    static void printAllSubArraysSum2(int[] ar){
        // 3, 1, 0, 2, N = 4
        // 3
        // 3 1
        // 3 1 0
        // 3 1 0 2
        //   1
        //   1 0
        //   1 0 2
        //     0
        //     0 2
        //       2
        // 3=(0+ + 1=( + 0*6 + 2*4
    }
}
