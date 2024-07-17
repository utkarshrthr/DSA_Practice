package com.utkarshrathore.app.hd.dsa._003_arrays;

public class _035_Range_Sum_Query {

    public static void main(String[] args) {
        int[] ar = {1, 2, 3, 4, 5};
        int[][] queries = {
                {0, 3}, {1, 2}
        };
        rangeSumQuery(ar, queries);
    }

    static void rangeSumQuery(int[] ar, int[][] queries){
        for(int i=1; i<ar.length; i++){
            ar[i] = ar[i]+ar[i-1];
        }
        for(int[] q: queries){
            int L = q[0];
            int R = q[1];
            if(L == 0)
                System.out.println(ar[R]);
            else {
                System.out.println(ar[R]-ar[L-1]);
            }
        }
    }
}
