package com.utkarshrathore.app.hd.dsa._015_sorting.alogrithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class _000_Count_Sort {

    public static void main(String[] args) {

        int[] ar = {437, 4, 2, 729, 1111, 23, 17};
        System.out.println(findMaxDigitCount(ar));
        countSort(ar);
    }

    static void countSort(int[] ar){
        int div = 1;
        while (div < 1000000000){
            HashMap<Integer, ArrayList<Integer>> hm = new HashMap<>();
            for(int i=0; i< ar.length; i++){
                int num = ar[i]/div;
                int key = num%10;
                if(hm.containsKey(key)){
                    hm.get(key).add(ar[i]);
                }
                else {
                    ArrayList<Integer> al = new ArrayList<>();
                    al.add(ar[i]);
                    hm.put(key, al);
                }
            }
            int k = 0; int i = 0;
            while (k<ar.length && i < 10){
                if(hm.containsKey(i)){
                    ArrayList<Integer> al = hm.get(i);
                    for (int a: al){
                        ar[k] = a;
                        k++;
                    }
                }
                i++;
            }
            div *= 10;
        }
        System.out.println(Arrays.toString(ar));
    }

    static int findMaxDigitCount(int[] ar){
        int max = Integer.MIN_VALUE;
        for(int i: ar){
            max = Math.max(i, max);
        }
        int count = 0;
        while (max>0){
            max/=10;
            count++;
        }
        return count == 0 ? 1 : count;
    }
}
