package com.utkarshrathore.app.hd.dsa._005_bit_manipulation;

public class _009_Set_Ith_Bit {

    public static void main(String[] args) {
        int num = 42;
        System.out.println(unsetBit(num, 1)); // 42
        System.out.println(unsetBit(num, 2)); // 40
        System.out.println(unsetBit(num, 3)); // 42
        System.out.println(unsetBit(num, 4)); // 34
        System.out.println(unsetBit(num, 5)); // 42
        System.out.println(unsetBit(num, 6)); // 10
    }

    static int setBit(int num, int i){
        return num | (1 << i-1);
    }

    static int unsetBit(int num, int i){
        return num & ~(1 << i-1);
        // check if 'i'th bit is 1 then unset or else skip
    }
}
