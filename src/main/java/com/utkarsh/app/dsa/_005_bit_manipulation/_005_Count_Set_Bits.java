package com.utkarshrathore.app.hd.dsa._005_bit_manipulation;

public class _005_Count_Set_Bits {
    // Write a function that takes an integer and returns the number of 1 bits present in its binary representation.
    public static void main(String[] args) {
        System.out.println(solution(0));
        System.out.println(solution(1));
        System.out.println(solution(2));
        System.out.println(solution(3));
        System.out.println(solution(7));
        System.out.println(solution(15));
        System.out.println(solution(Integer.MAX_VALUE));
    }
    static int[] ar = new int[32];

   static int solution(int n){
        int bits = 0;
        for (int i=0;i<32;i++){
            if((n & (1<<i)) > 0){
                bits++;
                ar[i]++;
            }
        }
        return bits;
    }
}
