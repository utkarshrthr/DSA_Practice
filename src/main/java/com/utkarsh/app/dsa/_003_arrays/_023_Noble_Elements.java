package com.utkarshrathore.app.hd.dsa._003_arrays;

import java.util.Arrays;

public class _023_Noble_Elements {
    /*
    * Given an array of N integers, find the number of noble elements.
    * An element in the array, a[i] is said to be noble if, (no of elements less than a[i]) = a[i]
    * */
    public static void main(String[] args) {
        //int[] ar = {1, -5, 3, 5, -10, 4};
        int[] ar = {-10, 1, 1, 3, 100};
        //int[] ar = {1, -5, 3, 5, -10, 4};


        // Brute-force: for each element find the number of elements then the elements, using 2 nested loops
        // Sorting:  {-10, -5, 1, 3, 4, 5}, for negative number, we may have to consider its absolute value
        // num = 1, current = -5
        // num = 2, current = 1
        System.out.println(solution2(ar));
    }

    static int solution3(int[] ar){
        Arrays.sort(ar);
        int nobles = 0;
        if(ar[0] == 0)
            nobles++;
        return nobles;
    }

/*
    //int[] ar = {1, -5, 3, 5, -10, 4};
        int[] ar = {-10, 1, 1, 3, 100};
        //int[] ar = {1, -5, 3, 5, -10, 4};



    static int solution(int[] ar){ // where array elements are unique
        Arrays.sort(ar);
        int nobles = 0;
        for(int i=1; i<ar.length; i++){
            if(ar[i] == i){
                nobles++;
            }
        }
        return nobles;
    }
*/

    static int solution2(int[] ar){ // where array elements can repeat
        Arrays.sort(ar);
        // {-10, 1, 1, 3, 100};
        int nobles = 0;
        int count = 0;
        for(int i=1; i<ar.length; i++){
            if(ar[i] == count){
                nobles++;
            }
            if(ar[i] != ar[i-1])
                count++;
        }
        return nobles;
    }
}
