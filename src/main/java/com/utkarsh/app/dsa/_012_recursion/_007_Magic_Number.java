package com.utkarshrathore.app.hd.dsa._012_recursion;

import java.util.List;

public class _007_Magic_Number {

    public static void main(String[] args) {
        List<Integer> al = List.of(83557, 1291);
        for (Integer i: al)
            System.out.println(magicNumber(i));
    }

    static Integer magicNumber(Integer i){
        int sum = 0;
        while (i>0){
            sum += i%10;
            i /= 10;
        }
        if(sum<10){
            return sum == 1 ? 1 : 0;
        }
        return magicNumber(sum);
    }
}
