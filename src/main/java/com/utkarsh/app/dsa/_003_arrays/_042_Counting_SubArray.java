package com.utkarshrathore.app.hd.dsa._003_arrays;

public class _042_Counting_SubArray {

    /*
    * Given an array A of N non-negative numbers and a non-negative number B,
    * find the number of sub-arrays in A with a sum less than B.
    * */

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 11, 2, 3, 15}, 10));
        System.out.println(solution(new int[]{2, 5, 6}, 10));;
    }

    static int solution(int[] ar, int b){ // 10
        int count = 0;
        int[] pref = new int[ar.length];
        int sum = 0;
        for(int i=0; i< ar.length; i++){
            pref[i] = (sum += ar[i]);
        }
        int i = -1;
        int j = 0;
        while (i<ar.length){
            if(i >= 0){
                j = i+1;
            }
            while (j< ar.length){
                if(i < 0){
                    if(pref[j] < b){
                        count++;
                    }
                }
                else {
                    if(pref[j]-pref[i] < b){
                        count++;
                    }
                }
                j++;
            }
            i++;
        }
        return count;
    }
}
