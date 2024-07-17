package com.utkarshrathore.app.hd.dsa._005_bit_manipulation;

public class _011_Only_1_Bit_Set {

    // If only one bit is set in a binary representation of an integer,
    // then that integer will always be power of 2.

    /*
    * a  = 21 = 10101
    * a-1= 20 = 10100
    * a&(a-1) = 10100
    *
    * a  = 16 = 10000
    * a-1= 15 = 01111
    * a&(a-1) = 00000
    *
    *
    * */

    public static void main(String[] args) {
        System.out.println(solution(1));
        System.out.println(solution(2));
        System.out.println(solution(3));
        System.out.println(solution(4));
        System.out.println(solution(5));
        System.out.println(solution(8));
        System.out.println(solution(16));
    }

    static boolean solution(int num){
        int bitCount = 0;
        while (num > 0){
            if(num % 2 == 1)
                bitCount++;
            if(bitCount>1)
                return false;
            num /= 2;
        }
        return bitCount == 1;
        /*
            int bits = 0;
            for(int i=0; i<32; i++){
                if(num&(1<<i) == 1){
                    bits++;
                }
                if(bits>1){
                    return false;
                }
            }
            return bits == 1;
        * */

        /*
        * return num & (num-1) == 0;
        * */
    }

    static boolean logBasedSolution(int n){
        // Math.log(n)/Math.log(2) => if an integer only, then it has only 1 bit set
        return false;
    }
}
