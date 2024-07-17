package com.utkarshrathore.app.hd.dsa._015_sorting;

import java.util.Arrays;

public class _002_Sort_0_1_2 {

    public static void main(String[] args) {
        int[] ar = {1, 0, 0, 2, 1, 0, 2};
        solution(ar);
        System.out.println(Arrays.toString(ar));
    }

    static void solution(int[] ar){
        // 1 0 0 2 1 0 2
        // 0 1 0 2 1 0 2
        // 0 0 1 2 1 0 2
        // 0 0 1 0 1 2 2
        int i = 0;
        // find first element which is not 0 from the left
        while (i<ar.length && ar[i]==0){
            i++;
        }
        int j = ar.length-1;
        // find first element which is not 2 from the right
        while (j>=0 && ar[j]==2){
            j--;
        }
        for(int k=i; k<=j;k++){
            if(ar[k] == 0){
                int temp = ar[i];
                ar[i] = ar[k];
                ar[k] = temp;
                i++;
            }
            else if(ar[k] == 2){
                int temp = ar[j];
                ar[j] = ar[k];
                ar[k] = temp;
                j--;
                if(ar[k] == 0){
                    temp = ar[i];
                    ar[i] = ar[k];
                    ar[k] = temp;
                    i++;
                    k++;
                }
            }
        }
    }
}
