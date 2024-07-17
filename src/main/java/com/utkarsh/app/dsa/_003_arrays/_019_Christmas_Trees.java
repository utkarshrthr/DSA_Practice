package com.utkarshrathore.app.hd.dsa._003_arrays;

public class _019_Christmas_Trees {
    /*
    * You are given an array A consisting of heights of Christmas trees and an array B of the same size consisting of the cost of each of the
    * trees (Bi is the cost of tree Ai, where 1 ≤ i ≤ size(A)), and you are supposed to choose 3 trees (let's say, indices p, q, and r), such that Ap < Aq < Ar,
    * where p < q < r. The cost of these trees is Bp + Bq + Br. You are to choose 3 trees such that their total cost is minimum. Return that cost.
    * If it is not possible to choose 3 such trees return -1.
    * */

    public static void main(String[] args) {
        /*int[] heights = {1, 6, 4, 2, 6, 9};
        int[] costs =   {2, 5, 7, 3, 2, 7};*/
        int[] heights = {3, 3, 3};
        int[] costs =   {1, 2, 3};

        System.out.println(solution(heights, costs));
    }

    static int solution(int[] heights, int[] costs){ // 1 6 9, 2+5+7=>14, 1, 4, 6=>2+7+2=>11, 1 2,6=>2+3+2=>
        int minCost = Integer.MAX_VALUE;
        int len = heights.length;
        for(int i=1; i<len-1; i++){
            int midHeight = heights[i]; // 6
            int midCost = costs[i]; // 5
            // find minimum height in left part (lesser than middle element)
            int minLeftCost = Integer.MAX_VALUE; //
            for(int j=0;j<i; j++){ // p < q
                if(heights[j] < midHeight){ // Ap < Aq
                    minLeftCost = Math.min(minLeftCost, costs[j]); // 2
                }
            }
            if(minLeftCost == Integer.MAX_VALUE){
                continue;
            }
            int minRightCost = Integer.MAX_VALUE;
            // find minimum height in right part (greater than middle element)
            for(int j=i+1;j<len; j++){ // q < r
                if(midHeight < heights[j] ){ // Aq < Ar  // 9
                    minRightCost = Math.min(minRightCost, costs[j]);
                }
            }
            if(minRightCost == Integer.MAX_VALUE){
                continue;
            }
        }
        return minCost == Integer.MAX_VALUE ? -1 : minCost;
    }
}
