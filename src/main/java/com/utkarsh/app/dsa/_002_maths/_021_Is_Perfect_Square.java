package com.utkarshrathore.app.hd.dsa._002_maths;

public class _021_Is_Perfect_Square {

    static boolean isPerfectSquare(int N){
        for(int i = 1; i*i<=N; i++){
            if(N%i==0 && N/i == i){
                return true;
            }
        }
        return false;
    }

    static boolean isPerfectSquare2(int N){ // binary search
        if(N == 1)
            return true;
        int st = 1; int en = N/2;
        while(st <= en){
            int mid = st + (en-st)/2;
            if(mid == N/mid)
                return true;
            if(mid > N/mid){
                en = mid-1;
            }
            else if(mid < N/mid){
                st = mid+1;
            }
        }
        return false;
    }
}
