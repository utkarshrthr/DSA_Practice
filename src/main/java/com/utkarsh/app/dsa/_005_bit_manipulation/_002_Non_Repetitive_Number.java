package com.utkarshrathore.app.hd.dsa._005_bit_manipulation;

public class _002_Non_Repetitive_Number {

    // Given an array of size N, every number is occurring twice except for 1, find that number.
    public static void main(String[] args) {
        int[] ip = {7, 5, 7, 2, 4, 4, 5};
        System.out.println(solution(ip));
    }

    /*Brute Force:
    * 1. Create frequency map: TC: O(N), SC: O(N)
    * 1. Check count for each element: TC: O(N^2), SC: O(1)
    * 1. Sort and iterate: TC: O(N.LogN), SC: O(N)*/

    static int solution(int[] ar){ // Using XOR, A^A=0
        int num = 0;
        for(int i: ar){
            num ^= i;
        }
        return num;
    }
}
