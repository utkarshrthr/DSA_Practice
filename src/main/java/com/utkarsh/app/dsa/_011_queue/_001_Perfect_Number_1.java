package com.utkarshrathore.app.hd.dsa._011_queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class _001_Perfect_Number_1 {

    public static void main(String[] args) {
        System.out.println(solve(50000));
        // 21111221212111122111121212211112
        // 211112212121112211121212211112
        // 2111122121211112
        // 2111121212211112
        // 211112212121112
    }
    // 1780 -> 100000
    static ArrayList<Long> solve(int A) {
        ArrayList<Long> res = new ArrayList<>();
        Queue<Long> q = new LinkedList<>();
        q.add(0l);
        int i = 0;
        int count = 0;
        while(true){
            Long top = q.poll();
            if(top != 0){
                res.add(top);
            }
            // 50000
            if(i == A){
                System.out.println(top);
                return null;
            }
            q.add(top*10+1);
            q.add(top*10+2);
            i++;
        }
    }

    static int createPalindrome(int i){
        int digits = 0;
        int rev = 0;
        int orig = i;
        while (i>0){
            rev = (rev*10)+(i%10);
            i/=10;
            digits++;
        }
        return (orig * (int)Math.pow(10, digits))+rev;
    }
}
