package com.utkarshrathore.app.hd.dsa._005_bit_manipulation;

import java.util.ArrayList;
import java.util.Collections;

public class _016_Gray_Code {

    public static void main(String[] args) {

        ArrayList<Integer> al2 = grayCode(16);
        for(int i:al2){
            System.out.print(i + ", ");
        }
        System.out.println();
        System.out.println(al2.size());
    }

    static ArrayList<Integer> grayCode(int A){
        if(A == 1){
            ArrayList<Integer> al = new ArrayList<>();
            al.add(0);
            al.add(1);
            return al;
        }
        ArrayList<Integer> prev = grayCode(A-1);
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=0; i<prev.size(); i++){
            res.add(prev.get(i)*2);
        }
        Collections.reverse(prev);
        for(int i=0; i<prev.size(); i++){
            res.add((prev.get(i)*2)+1);
        }
        return res;
    }
}
