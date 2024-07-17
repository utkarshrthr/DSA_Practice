package com.utkarshrathore.app.hd.dsa._013_subsequence_subsets;

public class _002_Sum_Of_All_Subset_Sum {
    /*
    *   {2, 4, 6} ->
    *   {}        -> {0, 0, 0} -> 0
     *  {6}       -> {0, 0, 1} -> 6
     *  {4}       -> {0, 1, 0} -> 4
     *  {4,6}     -> {0, 1, 1} -> 10
     *  {2}       -> {1, 0, 0} -> 2
     *  {2,6}     -> {1, 0, 1} -> 8
     *  {2,4}     -> {1, 1, 0} -> 6
    *   {2,4,6}   -> {1, 1, 1} -> 12
    *                          -> 38
    *   2 -> 4, 4 -> 4, 6 -> 4 => 4*(2+4+6) => 48
    *
    *   1 -> 1
    *
    *   {1, 2} ->
    *   {}
    *   {1}
    *   {2}
    *   {1,2}
    *
    *   {1,2,3,4} -> 1, {1,2} -> {1,3} -> {1,4} -> {1,2,3}-> {1,2,4} -> {1,2,3,4} ->
    *   {}
    *   {}
    */
    public static void main(String[] args) {
        int[] ar = {2, 4, 6};
        solution(ar);
        System.out.println(solution2(ar));;
    }

    static void solution(int[] ar){
        int len = ar.length;
        int totalSum = 0;
        int allSubSets = 1<<len; // no of subsets => 2^n
        for(int i=0;i<allSubSets;i++){ // 0,1,2,3,4,5,6,7
            int subSetSum = 0;
            for(int j=0; j<len; j++){ // 0, 1, 2
                if(checkSetBit(i, j)){ // check if jth bit of i is set,
                    subSetSum += ar[j];
                }
            }
            totalSum += subSetSum;
        }
        System.out.println(totalSum);
    }

    static boolean checkSetBit(int i, int j){ // ith bit of j
        return (i & (1<<j)) > 0;
    }

    static int solution2(int[] ar){ //  T.C. => O(n), Contribution technique, may need to handle integer overflow
        int totalSum = 0;
        int size = ar.length-1;
        for(int i: ar){
            totalSum += i * 1<<size;
        }
        return totalSum;
    }
}
