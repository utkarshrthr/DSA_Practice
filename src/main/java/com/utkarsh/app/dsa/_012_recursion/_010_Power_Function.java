package com.utkarshrathore.app.hd.dsa._012_recursion;

public class _010_Power_Function {

    /*
    * A : 71045970
    * B : 41535484 -> 41527663
    * C : 64735492
    *
    * 20805472
    * 62231352
    * */

    public static void main(String[] args) {
        //System.out.println(powerFunction(71045970, 41535484, 64735492));
        System.out.println(powerFunction(5, 12, 13));
        System.out.println(powerFunction(71045970, 41535484, 64735492));

    }
    static long powerFunction(int a, int b, int c){
        if(a==0){
            return 0;
        }
        if(b == 0 && a != 0){
            return 1;
        }
        if(b == 1){
            return a>0?a%c:(a%c)+c;
        }
        return power(a, b, c, 1);
    }

    static long power(int a, int b, int c, long val){ // try this using for loop
        if(b == 0)
            return val%c;
        long ans = power(a, b/2, c, val)%c;

        if(b%2==0){
            return ans* power(a, b/2, c, val)%c;
        }
        return a%c * power(a, b/2, c, val)%c * power(a, b/2, c, val)%c;
    }

    /*static long power(int a, int b, int c, long val){ // try this using for loop
        if(b == 0)
            return val%c;
        val = (a%c*val%c)%c;
        if(b%2==0){
            return power(a, b/2, c, val)%c * power(a, b/2, c, val)%c;
        }
        return a%c * power(a, b/2, c, val)%c * power(a, b/2, c, val)%c;
    }*/

    /*static int powerFunction(int a, int b, int c){
        if(b == 0){
            return 1;
        }
        if(b == 1){
            return a>0?a%c:(a%c)+c;
        }
        int val = a%c;
        return powerFunction(a, b-1, c, val);
    }
    static int powerFunction(int a, int b, int c, int val){
        if(b == 1){
            return val%c;
        }
        try {
            return powerFunction(a, b-1, c, val%c*a%c);
        }
        catch (StackOverflowError e){
            return 0;
        }
    }*/
}
