package com.utkarshrathore.app.hd.dsa._003_arrays;

public class _025_Rearrange {

    public static void main(String[] args) {
        int[] ar = {-1, 1};
        rearrangeArray(ar);
    }

    static int[] rearrangeArray(int[] ar) { // []
        int len = ar.length;
        int i = 0; int j = 0;
        int p = 0; int n = 1;
        while(i<len && j<len){
            while(i< len && ar[i]<0){ // i = 0; ar[i] = 3
                i++;
            }
            while(j< len && ar[j]>0){ // j = 2, ar[j] = -2
                j++;
            }
            if(p<len){
                int temp = ar[p]; //
                ar[p] = ar[i];
                ar[i] = temp;
                p+=2;
            }
            if(n < len){  // j = 2, ar[j] = -2
                int temp = ar[n]; //
                ar[n] = ar[j];
                ar[j] = temp;
                n+=2;
            }
            i++; j++;
        }
        return ar;
    }
}
