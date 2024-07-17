package com.utkarshrathore.app.hd.dsa._005_bit_manipulation;

public class _008_iTh_Bit {
    // Given 2 numbers A and i, check if ith bit of number A is set or not.

    // A -> 18 -> 10010, i -> 1, 2, 3, 4
    // Brute Force: Convert to binary string check ith bit, Log N
    public static void main(String[] args) {
        int n = 18;
        System.out.println(solution2(n, 1));
        System.out.println(solution2(n, 2));
        System.out.println(solution2(n, 3));
        System.out.println(solution2(n, 4));
        System.out.println(solution2(n, 5));
    }

    static boolean solution(int n, int position){
        if(position < 1 || position > 32){
            return false;
        }
        int i = 1;
        while(n>0){
            int bit = n%2;
            if(i==position && bit == 1)
                return true;
            i++;
            n /= 2;
        }
        return false;
    }
    // A -> 18 -> 10010, i -> 1, 2, 3, 4
    // use right shift operator such that the required bit becomes LSB, then perform & operation with 1
    static boolean solution2(int n, int position) {
        if(position < 1 || position > 32) {
            return false;
        }
        n = n >> position-1;
        return (n & 1) == 1;
        // instead using "n & 1" we can also check if n is odd, since if the last(right-most) bit is 1,
        // the number will always be odd, but using bitwise operation is much faster.

        // a & (1<<i) // with each increment in i, 1<<i will become Math.pow(2, i)
    }
}
