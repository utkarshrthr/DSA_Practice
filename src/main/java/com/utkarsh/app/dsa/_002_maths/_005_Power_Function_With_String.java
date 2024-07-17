package com.utkarshrathore.app.hd.dsa._002_maths;

public class _005_Power_Function_With_String {
    /*
      Given 3 integers, a, n, p. Calculate (a^n) % p;
    * */
    public static void main(String[] args) {
        // 3 4 8 3 6 8 9
        //
    }

    // 10%7 = 3
    // 100%7 = 2
    // 1000%7 = 1
    // 10000%7

    static long powerFunction(String n, int p){
        int ten = 1;
        int pow = 1;
        long val = 1;
        char[] ar = n.toCharArray();
        for(int i = ar.length-1; i>=0; i++){
//            val = val*((c-48)*ten)%p;
            val = val*(((ar[i]-48)%p*(ten%p))%p); // ten%p can again overflow
//            val = val * (((ar[i]-48)%p*powerFunction(10, pow, p))%p);
            ten *= 10; // this can overflow
            ten %= p;
            pow++;
        }
        return val;
    }

    static long powerFunction(int a, int n, int p){
        int i=0;
        long prod = 1; // taking this as long because before performing (prod*a)%p, (prod*a) this part can overflow if we take int as return type
        while (i<n){
            prod = (prod*a)%p; // (prod % p * a % p)%p
            i++;
        }
        return prod;
    }
}
