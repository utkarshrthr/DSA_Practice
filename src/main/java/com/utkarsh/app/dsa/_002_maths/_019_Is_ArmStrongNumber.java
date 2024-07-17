package com.utkarshrathore.app.hd.dsa._002_maths;

public class _019_Is_ArmStrongNumber {

    static boolean isArmStrongNumber(int N){
        if(N < 0)
            return false;
        int sum = 0;
        int N2 = N;
        while (N2>0){
            sum += Math.pow(N2%10, 3);
            N2 /= 10;
        }
        return sum == N;
    }

}
