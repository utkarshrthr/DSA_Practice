package com.utkarshrathore.app.hd.dsa._002_maths;

public class _004_Power_Function {
    /*
      Given 3 integers, a, n, p. Calculate (a^n) % p;
    * */
    public static void main(String[] args) {
        System.out.println(powerFunction(2, 5, 7));
        System.out.println(powerFunction(10, 40, 7));
    }

    // 10%7 = 3
    // 100%7 = 2
    // 1000%7 = 1
    // 10000%7

    static long powerFunction(int a, int n, int p){
        // a^n => This can lead to integer overflow
        // (a^n)%p => (a*a*a*a...n times)%p => (a%p * a%p * a%p * a%p...n times) ==> this can also lead to overflow
        int i=0;
        long prod = 1; // taking this as long because before performing (prod*a)%p, (prod*a) this part can overflow if we take int as return type
        while (i<n){
            prod = (prod*a)%p; // (prod % p * a % p)%p
            i++;
        }
        return prod;
    }
}
