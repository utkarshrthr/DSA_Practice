package com.utkarshrathore.app.hd.dsa._003_arrays;

import java.util.Arrays;

public class _004_Array_Rotation {
    // Rotate an array N times
    public static void main(String[] args) {
        int[] ar = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(rotate(new int[]{1, 2, 3, 4, 5}, 0)));
        System.out.println(Arrays.toString(rotate(new int[]{1, 2, 3, 4, 5}, 1)));
        System.out.println(Arrays.toString(rotate(new int[]{1, 2, 3, 4, 5}, 2)));
        System.out.println(Arrays.toString(rotate(new int[]{1, 2, 3, 4, 5}, 3)));
        System.out.println(Arrays.toString(rotate(new int[]{1, 2, 3, 4, 5}, 4)));
        System.out.println(Arrays.toString(rotate(new int[]{1, 2, 3, 4, 5}, 5)));
        System.out.println(Arrays.toString(rotate(new int[]{1, 2, 3, 4, 5}, 6)));
        System.out.println(Arrays.toString(rotate(new int[]{1, 2, 3, 4, 5}, 7)));
    }

    static int[] rotate(int[] ar, int n){
        if(n<0){
            return ar;
        }
        // rotate given array-> ar, n times to right
        int l = ar.length-1;
        // if number of rotation is same as length of the array, then return array itself.
        //  if number of rotation is more than length of the array, after l rotation array will be in its original structure
        int r = n%ar.length;
        if(r == 0)
            return ar;
        // rotate last r elements
        int st = 0; int en = l-r;
        while (st < en){
            int temp = ar[st];
            ar[st] = ar[en];
            ar[en] = temp;
            st++;
            en--;
        }
        st = l-r+1; en = l;
        while (st < en){
            int temp = ar[st];
            ar[st] = ar[en];
            ar[en] = temp;
            st++;
            en--;
        }
        st = 0; en = l;
        while (st < en){
            int temp = ar[st];
            ar[st] = ar[en];
            ar[en] = temp;
            st++;
            en--;
        }
        return ar;
        // {1, 2, 3, 4, 5};
        // after 1 rotations: {5, 1, 2, 3, 4};
        // after 2 rotations: {4, 5, 1, 2, 3};
        // after 3 rotations: {3, 4, 5, 1, 2};

        // reverse technique:
        // {1, 2, 3, 4, 5};
        // {3, 2, 1, 4, 5} rotate l-r
        // {3, 2, 1, 5, 4}
        // {4, 5, 1, 2, 3} // rotation by 2
    }

    // https://leetcode.com/problems/rotate-array/submissions/1286489728/
}
