package com.utkarshrathore.app.hd.dsa._003_arrays;

public class _037_Max_1s_After_Replacing_0 {

    public static void main(String[] args) {
        int[] input = {0, 1, 1, 1, 0, 1, 1, 0, 1, 1, 0};
        //int[] input = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        System.out.println(solution(input));
        System.out.println(solution2(input));
    }

    private static int solution(int[] ar){ // SC: O(1),
        // TC: O(n): if we count the operations in inner and outer loop,
        // the iterations will always be equivalent to N
        int max = 0;
        // edge case: all 0s
        int count = 0;
        for(int i:ar){
            if(i==1)
                count++;
        }
        if(count == ar.length)
            return count;
        for(int i=0; i<ar.length; i++){ // iterate over array
            if(ar[i] == 0){ // if '0' found
                // iterate right until 0 is found
                int j = i+1;
                int sum = 0;
                while (j< ar.length){
                    if(ar[j] == 1){
                        sum++;
                    }
                    else
                        break;
                    j++;
                }
                // iterate left until 0 is found
                j = i-1;
                while (j>=0){
                    if(ar[j] == 1){
                        sum++;
                    }
                    else
                        break;
                    j--;
                }
                max = Math.max(sum+1, max);
            }
        }
        return max;
    }

    private static int solution2(int[] ar){ // O(n) space,
        int l = ar.length;
        int[] pref = new int[l];
        int[] suff = new int[l];
        int count = 0;
        for(int i=0; i<l; i++){
            if(ar[i] == 1){
                count++;
            }
            else {
                count = 0;
            }
            pref[i] = count;
        }
        count = 0;
        for(int j=l-1; j>=0;j--){
            if(ar[j] == 1){
                count++;
            }
            else {
                count = 0;
            }
            suff[j] = count;
        }
        int max = 0;
        for(int i=0; i<l;i++){
            if(ar[i] == 0){
                if(i==0){
                    max = Math.max(max, suff[i+1]+1);
                }
                else if(i == l-1){
                    max = Math.max(max, pref[i-1]+1);
                }
                else {
                    max = Math.max(max, suff[i+1]+pref[i-1]+1);
                }
            }
        }
        return max;
    }
}
