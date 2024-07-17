package com.utkarshrathore.app.hd.dsa._003_arrays;

public class _029_OR_Value {
    /*
    * Given an array of 0 and 1. Find the number of sub-arrays having OR value 0.
    * {1,0,1,0,0}
    *
    * Given an array of 0 and 1. Find the number of sub-arrays having OR value 1.
    * {1,0,1,0,0}
    *
    * Given an array of +ve integers, find number of sub-arrays OR where sub-array OR has Oth bit set. (odd)
    *
    * A sub-array OR is 0 only if all the values of the array are 0.
    * We can iterate over array, keep track of continuous zeroes, for every N zeroes,
    * we can have N(N+1)/2 sub-arrays having sum equals to zero.
    *
    * */
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,1,0,0,0,1,0,1,0,0}));
    }

    static int solution(int[] ar){ // no of sub-arrays having bitwise OR value as 0
        int subArrays = 0;
        int count = 0;
        for(int i=0; i<ar.length; i++){
            if(ar[i] == 0){
                count++;
            }
            else {
                subArrays += (count * (count+1)/2);
                count = 0;
            }
        }
        // for zeroes which are at the end of the array
        subArrays += (count * (count+1)/2);
        return subArrays;
    }
}
