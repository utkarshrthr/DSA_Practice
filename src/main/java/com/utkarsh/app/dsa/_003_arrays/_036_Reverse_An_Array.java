package com.utkarshrathore.app.hd.dsa._003_arrays;

import java.util.Arrays;

public class _036_Reverse_An_Array {

    public static void main(String[] args) {
        int[] ip1 = {1, 2, 3, 4, 5};
        int[] ip2 = {1, 2, 3, 4, 5, 6};
        reverse(ip1);
        reverse(ip2);
        System.out.println(Arrays.toString(ip1));
        System.out.println(Arrays.toString(ip2));
    }

    static void reverse(int[] ar){
        int st = 0; int en = ar.length-1;
        while (st<en){
            int temp = ar[st];
            ar[st] = ar[en];
            ar[en] = temp;
            st++;
            en--;
        }
    }
}
