package com.utkarshrathore.app.hd.dsa._014_searching;

import java.util.List;

public class _001_Rotated_Array_Binary_Search {

    public static void main(String[] args) {
        // List<Integer> list = List.of(101, 103, 106, 109, 158, 164, 182, 187, 202, 205, 2, 3, 32, 57, 69, 74, 81, 99, 100);
        // List<Integer> list = List.of(4, 5, 6, 7, 0, 1, 2, 3);
        /*List<Integer> list = List.of(9, 10, 3, 5, 6, 8);
        for(int i: list){
            search(list, i);
        }
        search(list, 7);*/
        search(new int[]{5,1,3},3);
    }

    static int search(int[] nums, int target) {
        if(nums.length < 2){
            return nums[0] == target ? 0 : -1;
        }
        int n = nums.length-1;
        if(nums[0] <= nums[n]){
            return binarySearch(nums, target, 0, n);
        }
        // 4,5,6,7,0,1,2
        int st = 0; int en = n;
        while(st <= en){ // find pivot
            int mid = st + (en-st)/2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[0] > nums[mid]){
                en = mid-1;
            }
            else if(nums[n] < nums[mid]){
                st = mid+1;
            }
        }
        int pivot = en;
        if(nums[0] <= target && target <= nums[pivot]){
            return binarySearch(nums, target, 0, pivot);
        }
        else if(nums[pivot+1] <= target && target <= nums[n]){
            return binarySearch(nums, target, pivot+1, n);
        }
        return -1;
    }

    static int binarySearch(int ar[], int n, int st, int en){
        while(st<=en){
            int mid = st + (en-st)/2;
            if(ar[mid] == n){
                return mid;
            }
            else if(ar[mid] < n){
                st = mid+1;
            }
            else en = mid-1;
        }
        return -1;
    }

    static int search(final List<Integer> A, int B) {
        // 9 10 3 5 6 8, b = 5
        int n = A.size()-1;
        int st = 0; int en = n;
        while(st<en){ // 0, 5,||0, 1
            int pivot = st + (en-st)/2; // 2, 0
            if(A.get(st) < A.get(pivot)){
                st = pivot; // 1
            }
            else {
                en = pivot;
            }
        }
        int pivot = en;
        if(A.get(pivot) == B)
            return pivot; // max element index
        // order => 0, pivot //
        // pivot+1, size-1

        if(A.get(0) <= B && B <= A.get(pivot)){
            st = 0;
            en = pivot;
        }
        else if(A.get(pivot+1) <= B && B <= A.get(en)){
            st = pivot+1;
            en = n;
        }
        while(st<=en){
            int mid = st + (en-st)/2;
            if(A.get(mid) == B){
                return mid;
            }
            else if(A.get(mid) < B){
                st = mid+1;
            }
            else {
                en = mid-1;
            }
        }
        return -1;
    }
}
