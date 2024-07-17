package com.utkarshrathore.app.hd.dsa._002_maths;

public class _001_GCD {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        System.out.println(gcd2(25, 15));
    }

    static int gcd(int a, int b){
        if (a == 0)
            return b;
        if (b == 0)
            return a;
        if (a == b) // edge case
            return a;
        if (a > b){
            return gcd(a - b, b);
        }
        return gcd(a, b - a);
    }

    static int gcd2(int a, int b){
        if(b==0)
            return a;
        return gcd2(b, a%b);
    }
}
