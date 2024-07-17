package com.utkarshrathore.app.hd.dsa._005_bit_manipulation;

public class _000_Strange_Equality {

    public static void main(String[] args) {
        System.out.println(solve(3));
        System.out.println(solve(4));
        System.out.println(solve(5));
    }

    static int solve(int A) {
        // find first and last unset bit
        int lastUnsetBit = 0;
        for(int i=30;i>=0;i--){
            if((A&(1<<i))>0){
                lastUnsetBit = i+1;
                break;
            }
        };
        int X = 1<<lastUnsetBit;
        int Y = (1<<(lastUnsetBit-2));
        return X^Y;
    }
}
