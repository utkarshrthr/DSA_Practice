package com.utkarshrathore.app.hd.dsa._003_arrays;

import java.util.List;

public class _038_abs_diff {

    public static void main(String[] args) {
        solution(List.of(4, 6, 5, 3, 3, 1));
    }

    static int solution(List<Integer> a){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<a.size();i++){ // 4 6 5 3 3 1
            int len = 0;
            for(int j=i+1;j<a.size();j++){
                if(Math.abs(a.get(j)-a.get(j-1))>1){
                    break;
                }
                len++;
            }
            max = Math.max(max, len);
        }
        return max;
    }
}
