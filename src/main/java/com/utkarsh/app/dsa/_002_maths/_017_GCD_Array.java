package com.utkarshrathore.app.hd.dsa._002_maths;

public class _017_GCD_Array {

    public static void main(String[] args) {
        System.out.println(arrayGCD(new int[]{2}));
        System.out.println(arrayGCD(new int[]{6, 9}));
        System.out.println(arrayGCD(new int[]{3, 6, 9}));
        System.out.println(arrayGCD(new int[]{18, 6, 12, 24}));
        System.out.println(arrayGCD(new int[]{12, 15, 18}));
        System.out.println(arrayGCD(new int[]{-3, 15, 18}));
    }

    static int arrayGCD(int[] ar){
        if(ar.length == 1){
            return ar[0];
        }
        int gcd = gcd(ar[0], ar[1]);
        for(int i=2;i<ar.length;i++){
            gcd = gcd(gcd, ar[i]);
        }
        return gcd;
    }

    static int gcd(int a, int b){
        if(a==b)
            return a;
        if(b==0)
            return a;
        return gcd(b, a%b);
    }
}
