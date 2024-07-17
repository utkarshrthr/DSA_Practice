package com.utkarshrathore.app.hd.dsa._002_maths;

public class _022_ToBecomeOne {

    static int toBecomeOne(int X, int y){ // This is the way to calculate the integral part of Log X Base y.
        if(X < y)
            return -1;
        if(X == y)
            return 0;
        int count = 0;
        while (X>1){
            X /= y;
            count++;
        }
        return count;
    }

    static int toBecomeOneUsingLog(int X, int y){
        return (int) (Math.log(X)/Math.log(y));
    }
}
