package com.utkarshrathore.app.hd.dsa._005_bit_manipulation;

public class _012_ith_Bit {

    /*
    * Given a positive integer N, find whether Ith Nth bit is 0 or 1.
    */
    public static void main(String[] args) {
    }

    static void ithBit(int n, int ith){
        int i = 0;
        while (n > 0){
            int bit = n%2;
            n /= 2;
            if(i == ith){
                System.out.println(bit);
                return;
            }
            System.out.println(i + ", " + bit);
            i++;
        }
    }
}
