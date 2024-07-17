package com.utkarshrathore.app.hd.dsa._002_maths;

public class _020_IsPrime {

    public static boolean isPrime1(int N){
        if(N<2)
            return false;
        for(int i=3;i<N;i++){
            if(N%i==0)
                return false;
        }
        return true;
    }

    public static boolean isPrime2(int N){
        if(N<2)
            return false;
        for(int i=3;i*i<=N;i++){
            if(N%i==0)
                return false;
        }
        return true;
    }

    static boolean isPrime3(int N){
        if(N <2)
            return false;
        if(N==3 || N == 2)
            return true;
        if((N-1)%6==0 || (N+1)%6==0)
            return true;
        return false;
    }

    public static boolean isPrime4(int N){ // recursive
        if(N <2)
            return false;
        return isPrime4(N, 2);
    }

    static boolean isPrime4(int N, int i){
        if(N==i)
            return true;
        if(N%i==0)
            return false;
        return isPrime4(N, ++i);
    }
}
