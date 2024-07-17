package com.utkarshrathore.app.hd.dsa._003_arrays;

public class _009_Leaders_In_An_Array {

    public static void main(String[] args) {
        int[] ar = {9, -1, 7, 2, 5, 4, 2, 3};
        findLeaders(ar);
    }

    static void findLeaders(int[] ar){
        int N = ar.length;
        int max = ar[N-1];
        System.out.println(max);
        for(int i = N-2; i >= 0; i--){
            if(ar[i] > max){
                max = ar[i];
                System.out.println(max);
            }
        }
    }
}
