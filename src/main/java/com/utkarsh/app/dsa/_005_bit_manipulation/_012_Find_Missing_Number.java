package com.utkarshrathore.app.hd.dsa._005_bit_manipulation;

public class _012_Find_Missing_Number {
    /*
    * 1 -> 0001
    * 2 -> 0010

     * 4 -> 0100
    * 5 -> 0101
    * */

    public static void main(String[] args) {
        int[] ar =  {3, 1, 4, 5};
        int[] ar1 = {3, 1, 2, 5, 6};
        int[] ar2 = {7, 8, 11, 10, 12};
        System.out.println(solution(ar));
        System.out.println(solution(ar1));
        System.out.println(solution(ar2));
    }

    static int solution(int[] ar){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i:ar){
            min = Math.min(min, i);
            max = Math.max(max, i);
        }
        int sum = 0;
        for(int i=min; i<=max; i++){
            sum ^= i;
        }
        for(int i:ar){
            sum ^= i;
        }
        return sum;
    }
}
