package com.utkarshrathore.app.hd.dsa._014_searching;

import java.util.List;

public class _000_Binary_Search {

    public static void main(String[] args) {
        List<Integer> list = List.of(3, 4, 18, 19, 20, 27, 28, 31, 36, 42, 44, 71, 72, 75, 82, 86, 88, 97, 100, 103);
        for (Integer i: list){
            System.out.println(binarySearch(list, i-1));
        }
    }

    static int binarySearch(List<Integer> A, int B){
        int size = A.size();
        if(A.get(size-1) < B)
            return size;
        int st = 0; int en = size-1; int mid = 0;
        while(st<=en){
            mid = st + (en-st)/2;
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
        return mid;
    }
}
