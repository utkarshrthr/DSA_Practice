package com.utkarshrathore.app.hd.dsa._003_arrays;

import java.util.HashMap;

public class _003_2_Sum {
    // Given an array A and an integer B. A pair(i, j) in the array is a good pair if i != j
    // and (A[i] + A[j] == B). Check if any good pair exist or not.

    private boolean solution(int[] ar, int b){
        var map = new HashMap<Integer, Integer>();
        for(int i=0; i< ar.length;i++){
            if(map.containsKey(b-ar[i]) && map.get(b-ar[i]) != i){
                return true;
            }
            else {
                map.put(ar[i], i);
            }
        }
        return false;
    }
}
