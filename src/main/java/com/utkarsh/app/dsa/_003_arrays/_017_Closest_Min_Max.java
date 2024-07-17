package com.utkarshrathore.app.hd.dsa._003_arrays;

public class _017_Closest_Min_Max {

    public static void main(String[] args) {
        int[] input1 = {2, 6, 1, 6, 9};
        int[] input2 = {1, 3, 2};
        System.out.println(solution(input1));
        System.out.println(solution(input2));
    }

    static int solution(int[] ar){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i:ar){ // find max and min element
            max = Math.max(i,max);
            min = Math.min(i,min);
        }
        if(min == max){ // edge case all elements equal
            return 1;
        }
        int minFound = -1;
        int maxFound = -1;
        int len = Integer.MAX_VALUE;
        for(int i=0; i< ar.length;i++){ // iterate over array
            if(ar[i] == max){ // found max element
                if(minFound != -1){ // check if min is already found
                    len = Math.min(i-minFound+1, len); // find distance,
                }
                maxFound = i;

            }
            else if(ar[i] == min){
                if(maxFound != -1){
                    len = Math.min(i-maxFound+1, len);
                }
                minFound = i;
            }
        }
        return len;
    }
}
