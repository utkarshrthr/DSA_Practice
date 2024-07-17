package com.utkarshrathore.app.hd.dsa._012_recursion;

import java.util.List;

public class _006_Sum_Of_Digits {

    public static void main(String[] args) {
        List<Integer> al = List.of(3762, 87298, 172367123);
        for (Integer i: al)
            System.out.println(sumOfDigits(i));
    }

    static Integer sumOfDigits(Integer i){
        int sum = 0;
        return sumOfDigits(i, sum);
    }

    static Integer sumOfDigits(Integer i, Integer sum){
        if(i == 0)
            return sum;
        sum += i%10;
        return sumOfDigits(i/10, sum);
    }
}
