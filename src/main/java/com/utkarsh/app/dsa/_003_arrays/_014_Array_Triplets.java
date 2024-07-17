package com.utkarshrathore.app.hd.dsa._003_arrays;

public class _014_Array_Triplets {

    /* In a given array of size N, find no. of triplets, such that i < j < k && ar[i] < ar[j] < ar[k]
    * */


    public static void main(String[] args) {
        int triplets = findTriplets(new int[]{3, 6, 9, 12, 5, 16, 8, 7, 11});
        int triplets2 = findTriplets(new int[]{3, 4, 6, 9, 2});
        int triplets3 = findTriplets(new int[]{2, 6, 9, 4, 10,});
        System.out.println(triplets);
        System.out.println(triplets2);
        System.out.println(triplets3);
    }

    static int findTriplets(int[] ar){ // for each element that can be middle element, count all elements less than the
        // fixed element on let part and elements greater than on right side
        int triplets = 0; //2, 6, 9, 4, 10,

        for(int i = 1; i< ar.length-1; i++){
            int mid = ar[i]; // 6, 6
            int left = 0;
            for(int j=0; j<i; j++){ // left
                if(ar[j] < mid){
                    left++; // 1
                }
            }
            int right = 0;
            for(int j=i+1; j<ar.length; j++){
                if(mid < ar[j]){
                    right++; //2, 3
                }
            }
            triplets += (left*right);
        }
        return triplets;
    }
}
