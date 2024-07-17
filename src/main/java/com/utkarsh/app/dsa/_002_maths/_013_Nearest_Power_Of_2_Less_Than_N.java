package com.utkarshrathore.app.hd.dsa._002_maths;

public class _013_Nearest_Power_Of_2_Less_Than_N {
    public static void main(String[] args) {
        System.out.println(solution(2));
        System.out.println(solution(31));
        System.out.println(solution(100));
        System.out.println(solution(13));
        System.out.println(solution(32));
    }

    static int solution(int n){
        int i = 1;
        while ((i*2)<=n){
            i *= 2;
        }
        return i;
    }
}
