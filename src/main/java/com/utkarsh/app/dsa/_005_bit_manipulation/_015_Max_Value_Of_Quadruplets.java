package com.utkarshrathore.app.hd.dsa._005_bit_manipulation;

public class _015_Max_Value_Of_Quadruplets {
    /*
        Given an array of integers A of size N. Pick four elements a, b, c, and d such that (a & b & c & d) is maximum where '&' is bitwise AND operator.
     **/
    public static void main(String[] args) {
        int[] ip = {10, 20, 15, 4, 14};
        System.out.println(solution(ip));
    }

    static int solution(int[] ar){
        // for maximum value of [a & b & c & d], we need to find those 4 elements that has most significant bit common at same position
        /*
        * 10 -> 01010
          20 -> 10100
          15 -> 01111
           4 -> 00100
          14 -> 01110
          Here 25, 15, 4, 14 has 3rd bit as 1.
        * */
        // iterate over array find 4 elements that has ith bit as set
        int max = 0;
        int[] num = new int[32]; //
        for(int i=32;i>0;i++){
            // iterate over array find 4 elements that has ith bit as se
            int count = 0;
            for(int j=0;i< ar.length;j++){
                // check if ith bit is set for jth element
                if((ar[j]&(1<<i)) == 1){
                    count++;
                }
                else {
                    //ar[j] = 0;
                }
                if(count==4){
                    // since 4 elements are found, there are 4 elements that has ith bit set as 1
                    max += (1<<i);
                    num[i-1] = 1;
                }
            }
        }
        int ans = 0;
        for(int i=0; i< num.length;i++){
            if(num[i] == 1){
                max += (1<<(i+1));
            }
        }
        return ans;
    }
}
