package com.utkarshrathore.app.hd.dsa._003_arrays;

public class _015_Pick_From_Both_Sides {


    public static void main(String[] args) {
        int[] input1 = {5, -2, 3, 1, 2}; int b1 = 3;
        int[] input2 = {2, 3, -1, 4, 2, 1}; int b2 = 4;
        System.out.println(solution(input1, b1));
        System.out.println(solution(input2, b2));
    }

    static int solution(int[] ar, int b){
        // handling edge case: if ar.length = b, we can do early return,
        int max = 0;
        int sum = 0;
        for(int i=0; i<b; i++){ // sum of first 'b' elements
            sum += ar[i]; // 6
        }
        max = sum;
        for(int i=0;i<b;i++){
            sum = (sum - ar[b-i-1]+ar[ar.length-1-i]);
            max = Math.max(max, sum);
        }
        return max;
    }

    static int solution2(int[] ar, int b){ // using prefix-sum and suffix-sum
        // 5, -2, 3, 1, 2, 3
        // 5,  3, 6, 7, 9, 12 : PS
        // 12, 7, 9, 6, 5,  3 : SS
        return 0;
    }
}
