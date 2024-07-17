package com.utkarshrathore.app.hd.dsa._002_maths;

public class _006_ {
    /* Given two integers A and B, find the greatest possible positive integer M, such that A % M = B % M.*/

    public static void main(String[] args) {
     int A = 5;
     int B = 11;

     // possible values lie between 2 to max(A,B)
     /*
     * A%M - B%M = 0;
     * 5%2-11%2 = 1 - 1
     * 5%3-11%3 = 2 - 2
     * 5%4-11%4 = 1 - 2
     * 5%5-11%5 = 0 - 1
     *  5%6-11%6 = 5 - 5
     * 5%7-11%7 = 5 - 4
     * 5%8-11%8 = 5 - 3
     * 5%9-11%9 = 5 - 2
     * 5%10-11%10 = 5 - 1
     * 5%12-11%12 = 5 - 1// after this there is no poss
     * */
    }
}
