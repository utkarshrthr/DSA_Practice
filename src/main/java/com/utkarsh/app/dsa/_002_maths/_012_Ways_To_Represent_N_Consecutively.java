package com.utkarshrathore.app.hd.dsa._002_maths;

public class _012_Ways_To_Represent_N_Consecutively {
    /*
    * Given an integer N. Find the no. of ways to represent it as the sum consecutive natural numbers.
    *
    * e.g. 3 => 1+2, 5 => 2+3, 6 => 1+2+3, 7=>3+4,
    *      9 => 2+3+4, 4+5, 10 => 1+2+3+4, 11=>5+6,
    *      15=> 1+2+3+4+5, 4+5+6, 7+8,
    * */
    public static void main(String[] args) {
        solution(1);
        solution(2);
        solution(3);
        solution(4);
        solution(5);
        solution(6);
        solution(7);
        solution(8);
        solution(9);
        solution(10);
        solution(11);
        solution(12);
        solution(13);
        solution(14);
        solution(15);
        solution(16);
        solution(17);
        solution(18);
        solution(19);
        solution(20);
        solution(100);
    }

    static int solution(int n){
        if(n<3){
            return 1;
        }
        int i = 1; int j = 2;
        int ways = 0;
        int sum = 1; int en = n/2+1;
        int iterations = 0;
        while (j<=en){
            iterations++;
            if(sum==n){
                ways++;
                System.out.println("N => "+n+": From "+i+" to "+(j-1));
                sum+=j;
                j++;
            }
            if(sum > n){
                sum -= i;
                i++;
            }
            if(sum<n){
                sum += j;
                j++;
            }
        }
        System.out.println("Iterations for N:" +iterations);
        return ways;
    }

    static int solution2(int n){
       // A.P. based
       // since the numbers are consecutive and natural
       // let's say N is the given number, and n is set of consecutive numbers that adds to n
       // let the numbers start with a
       // a + a+d + a+2d + a+3d
        //d =1
        // Sum of n numbers of AP =n/2[2a + (n – 1)d]
        // N = n/2(2*a +n-1)
        // 2N = n(a + n-1)
        // 30 = n(1+n-1);
        return 0;
    }
}
