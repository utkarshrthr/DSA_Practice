package com.utkarshrathore.app.hd.dsa._014_searching;

public class _002_Square_Root {
    // https://leetcode.com/problems/sqrtx/description/
    public static void main(String[] args) {
        System.out.println(sqrt(1));
        System.out.println(sqrt(2));
        System.out.println(sqrt(4));
        System.out.println(sqrt(8));
        System.out.println(sqrt(25));
        System.out.println(sqrt(10000000));
    }

    static int sqrt(int n){ // return floor;  1-> 1, 2 -> 1,  3 -> 1, 4 -> 2
        int st = 1; int en = n;
        while (st<=en){
            int mid = st + (en-st)/2;
            if(mid == n/mid) // n/mid == mid
                return mid;
            else if(mid < n/mid){
                st = mid+1;
            }
            else {
                en = mid-1;
            }
        }
        return en;
    }
}
