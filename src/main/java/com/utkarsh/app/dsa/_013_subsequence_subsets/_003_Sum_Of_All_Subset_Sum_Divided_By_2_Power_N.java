package com.utkarshrathore.app.hd.dsa._013_subsequence_subsets;

public class _003_Sum_Of_All_Subset_Sum_Divided_By_2_Power_N {

    /* Given an array
    * */
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
        System.out.println(solution2(ar));;
    }

    static int solution2(int[] ar){ //  T.C. => O(n), Contribution technique, may need to handle integer overflow
        int totalSum = 0;
        for(int i: ar){
            totalSum += i;
        }
        return totalSum/2;
    }
}
