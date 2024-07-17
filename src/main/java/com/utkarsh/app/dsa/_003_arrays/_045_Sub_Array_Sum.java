package com.utkarshrathore.app.hd.dsa._003_arrays;

import java.util.List;

public class _045_Sub_Array_Sum {

    public static void main(String[] args) {

        solve(List.of(3, 2, 5, 4, 6, 3, 7, 2), 20);
    }

    static int solve(List<Integer> A, int B) {
        int i = 0; int j = 0;
        int sum = 0; int len = 0;
        int max = Integer.MIN_VALUE;
        while(j<A.size() && i<A.size()){ // 1,2,3,4,5
            if(sum == B){
                len = j-i;
                max = Math.max(len, max);
            }
            if(sum<B && j<A.size()){
                sum+=A.get(j); // 15
                j++;
                if(sum == B){
                    len = j-i;
                    max = Math.max(len, max);
                }// 5
            }
            if(sum > B && i<A.size()){
                sum-=A.get(i);
                i++;
                if(sum == B){
                    len = j-i;
                    max = Math.max(len, max);
                }
            }
        }
        return max;
    }
}
