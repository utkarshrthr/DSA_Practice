package com.utkarshrathore.app.hd.dsa._015_sorting;

import java.util.ArrayList;
import java.util.List;

public class _000_Kth_Smallest {

    public static void main(String[] args) {
        System.out.println(kthSmallest(new ArrayList<>(List.of(2, 1, 4, 3, 2)), 3));
        System.out.println(kthSmallest(new ArrayList<>(List.of(1)), 1));
        System.out.println(kthSmallest(new ArrayList<>(List.of(1, 2)), 2));
        System.out.println(kthSmallest(new ArrayList<>(List.of(47, 7)), 2));
    }

    static int kthSmallest(final List<Integer> A, int B) {
        if(A.size() == 1){
            return A.get(0);
        }
        int n = A.size(); // 1
        int swaps = 0;
        while(n>0){
            int min = Integer.MAX_VALUE; int mi = 0;
            for(int i=0; i<n;i++){
                if(A.get(i) < min){
                    min = A.get(i);
                    mi = i;
                }
            }
            int temp = A.get(n-1); // mi = 1
            A.set(n-1, A.get(mi)); //  [1,2,2,3,4] // 5 -3 - 1
            A.set(mi, temp);
            swaps++;
            if(swaps == B){
                break;
            }
            n--;
        }
        return A.get(A.size()-B);
    }
}
