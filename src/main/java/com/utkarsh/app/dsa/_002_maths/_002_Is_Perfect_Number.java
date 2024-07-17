package com.utkarshrathore.app.hd.dsa._002_maths;

public class _002_Is_Perfect_Number {
    // Perfect Number: sum of perfect positive divisors

    static int sumOfPerfectPositiveDivisors(int N){ // handle perfect squares
        int sum = 1;
        for(int i=2; i*i<=N; i++){
            if(N%i==0){
                if(N/i == i)
                    sum += i;
                else
                    sum += (i+N/i);
            }
        }
        return sum;
    }
}
