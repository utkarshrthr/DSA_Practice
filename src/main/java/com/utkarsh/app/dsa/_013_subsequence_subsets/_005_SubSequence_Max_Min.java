package com.utkarshrathore.app.hd.dsa._013_subsequence_subsets;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _005_SubSequence_Max_Min {

    public static void main(String[] args) {
        solve(new ArrayList<>(List.of(5, 4, 2)));
    }

    public static int solve(ArrayList<Integer> A) { // [5, 4, 2]
        Collections.sort(A);  // [2, 4, 5]
        int n = A.size();
        double maxSum = 0;
        double minSum = 0;
        int mod = 1000000007;
        for(int i=0; i<n; i++){
            maxSum += (A.get(i)%mod * (Math.pow(2, n-1-i))%mod)%mod;
            minSum += (A.get(i)%mod * (Math.pow(2, i))%mod)%mod;
        }
        return (int) Math.abs(maxSum-minSum);
    }
}
