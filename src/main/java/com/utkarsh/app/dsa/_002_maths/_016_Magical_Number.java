package com.utkarshrathore.app.hd.dsa._002_maths;

public class _016_Magical_Number {
    /* Given a number N, return Nth magical number. A magical number is a one
        that can be expressed as the sum of power of 5. 1st magical no. is 5 */
    public static void main(String[] args) {
        System.out.println(solution(1));
        System.out.println(solution(2));
        System.out.println(solution(3));
        System.out.println(solution(4));
        System.out.println(solution(5));
        System.out.println(solution(6));
        System.out.println(solution(7));
        System.out.println(solution(8));
        System.out.println(solution(9));
        System.out.println(solution(10));
    }

    static int solution(int n){
        int num = 0;
        int pow = 1;
        while (n>0){
            int rem = n%2;
            n = n/2;
            num += (rem * Math.pow(5, pow)); // handle overflow, try this same question by checking set bit
            pow++;
        }
        return num;
        // 1st = 5  = 5^1
        // 2nd = 25 = 5^2
        // 3rd = 30 = 5^1 + 5^2
        // 4th = 125 = 5^3
        // 5th = 130 = 5^1 + 5^3
        // 6th = 150 = 5^2 + 5^3
        // 7th = 155 = 5^1 + 5^2 + 5^3
        // 7th = 155 = 5^4
        // 5th = 130 = 5^1 + 5^4
        // 6th = 150 = 5^2 + 5^4
        // 6th = 150 = 5^1 + 5^2 + 5^4
        // 6th = 150 = 5^1 + 5^3 + 5^4
        //
    }
/*
*    5                   =   5
*    5  + 25             =  30
*    5  + 125            = 130
*   25 + 125             = 150
*    5 + 25 + 125        = 155
*    5 + 25 + 125 + 625  = 780
*    5 + 625             = 630
*   25 + 625             = 650
*    125 + 625  =        = 750
* */

}
