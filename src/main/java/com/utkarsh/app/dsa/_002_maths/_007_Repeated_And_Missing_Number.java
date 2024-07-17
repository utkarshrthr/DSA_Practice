package com.utkarshrathore.app.hd.dsa._002_maths;

import java.util.Arrays;

public class _007_Repeated_And_Missing_Number {
    /*
    * You are given a read only array of n integers from 1 to n. Each integer appears exactly once except A which appears twice and B which
    * is missing. Return A and B.
    * */
    public static void main(String[] args) {
        int[] input = {3, 1, 2, 5, 3};
        int[] output = solution(input);
        solution2(input);
        System.out.println(Arrays.toString(output));
    }

    static int[] solution(int[] ar){ // ar contains elements from 1 to N, O(N) 2 iteration, O(N) space
       int[] temp = new int[ar.length];
       for(int i: ar){
           temp[i-1]++;
       }
       int num1 = 0; int num2 = 0;
       for(int i=0; i<temp.length; i++){
            if(temp[i] != 1){
                if(num1 == 0)
                    num1 = i+1;
                else {
                    num2 = i+1;
                }
                if(num1 != 0 && num2 != 0){
                    return new int[]{num1, num2};
                }
            }
       }
       return new int[]{num1, num2};
    }

    static int[] solution2(int[] ar){
        for(int i=0; i< ar.length; i++){}

        return null;
    }
}
