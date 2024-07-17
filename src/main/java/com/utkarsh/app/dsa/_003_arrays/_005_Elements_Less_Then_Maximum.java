package com.utkarshrathore.app.hd.dsa._003_arrays;

public class _005_Elements_Less_Then_Maximum {
    /* Given an integral array of size N, find the number of elements having at least 1 element greater than itself.  */
    // int[] ar = {3, 1, 2, 5, 4, 6, 1, 8};

    public static void main(String[] args) {
        int[] ar = {8, 8, 8, 5, 8, 8, 1, 8};
        System.out.println(solution(ar));
    }

    static int solution(int[] ar){
        // Approach 1: for each element, find how many numbers are greater than itself. O(n^2)
        // Approach 2: apart from the maximum element all the other elements will have 1 at least 1 element greater than itself, we can find
        // the maximum element and its frequency.
        int max = ar[0];
        int count = 1;
        for(int i=1; i<ar.length; i++){
            if(ar[i] > max){
                max = ar[i];
                count = 1;
            }
            else if(ar[i] == max){
                count++;
            }
        }
        return ar.length-count;
    }
}
