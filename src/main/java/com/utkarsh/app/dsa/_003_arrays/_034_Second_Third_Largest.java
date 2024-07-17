package com.utkarshrathore.app.hd.dsa._003_arrays;

public class _034_Second_Third_Largest {

    static int secondLargestElement(int[] ar){
        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;
        for(int i=0; i < ar.length; i++){
            if(ar[i] > max){ //
                secMax = max;
                max = ar[i];
            }
            else if(ar[i]> secMax){
                secMax = ar[i];
            }
        }
        return secMax;
    }
}
