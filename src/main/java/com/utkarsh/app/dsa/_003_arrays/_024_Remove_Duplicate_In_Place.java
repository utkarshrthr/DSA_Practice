package com.utkarshrathore.app.hd.dsa._003_arrays;

import java.util.Arrays;

public class _024_Remove_Duplicate_In_Place {

    public static void main(String[] args) {
    //    System.out.println(removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));
        int[] ar = {0,0,1,1,1,2,2,3,3,4};
        int[] ar2 = {1,2};
        arrange(ar);
        arrange(ar2);
    }

   static void arrange(int[] ar){
       int l = 0;
       for(int i=0; i<ar.length-1;i++){
           if(ar[i] == ar[i+1]){
               ar[i] = 200;
               l++;
           }
       }
        int i = 0; int j = 0;
        while(i<ar.length && j < ar.length){
            while(ar[i]!=200){
                i++;
            }
            while(ar[j]==200){
                j++;
            }
            int temp = ar[i];
            ar[i] = ar[j];
            ar[j] = temp;
            i+=1;
            j +=1;
        }
       System.out.println(Arrays.toString(ar));
    }

    static int removeDuplicates(int[] nums) {
        for(int i=0; i<nums.length-1;i++){
            if(nums[i] == nums[i+1]){
                nums[i] = 200;
            }
        }// [200, 0, 200, 200, 1, 200, 2, 200, 3, 4]
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 200){
                for(int j=i;j<nums.length-1;j++){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        int val = 0;
        for(int i=0; i<nums.length;i++){
            if(nums[i]==200){
                val = i;
                break;
            }
        }
        return val;
    }
}
