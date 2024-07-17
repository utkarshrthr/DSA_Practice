package com.utkarshrathore.app.hd.dsa._011_queue;

import java.util.LinkedList;
import java.util.Queue;

public class _001_Perfect_Number_2 {

    public static void main(String[] args) {

    }

    static String solution(int A){
        Queue<Long> q = new LinkedList<>();
        q.add(0l);
        int count = 0;
        while(true){
            Long top = q.poll();
            if(count == A){
                return generatePerfectNumber(top);
            }
            q.add(top*10+1);
            q.add(top*10+2);
            count++;
        }
    }

    static String generatePerfectNumber(long num){
        long orig = num;
        long rev = 0;
        while (num >0){
            rev = (rev*10 + num%10);
            num /= 10;
        }
        return orig+""+rev;
    }
}
