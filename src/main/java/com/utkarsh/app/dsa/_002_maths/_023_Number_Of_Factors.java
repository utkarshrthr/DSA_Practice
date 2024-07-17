package com.utkarshrathore.app.hd.dsa._002_maths;

public class _023_Number_Of_Factors {

    public static void main(String[] args) {
        System.out.println(solution(2));
        System.out.println(solution(10));
        System.out.println(solution(18));
        System.out.println(solution(12));
        System.out.println(solution(21));
    }

    static int solution(int n){
        int count = 0;
        for(int i=1; i*i<=n;i++){
            if(n%i==0){
                count = (n/i == i)?(count+1):(count+2);
            }
        }
        return count;
    }
}
