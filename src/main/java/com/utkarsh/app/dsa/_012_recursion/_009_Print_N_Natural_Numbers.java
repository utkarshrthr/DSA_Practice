package com.utkarshrathore.app.hd.dsa._012_recursion;

public class _009_Print_N_Natural_Numbers {
    public static void main(String[] args) {
        increasingOrder(10);
        System.out.println();
        decreasingOrder(10);
    }
    static void increasingOrder(int N){
        if(N==0){
            return;
        }
        increasingOrder(N-1);
        System.out.print(N + " ");
    }
    static void decreasingOrder(int N){
        if(N==0){
            return;
        }
        System.out.print(N + " ");
        decreasingOrder(N-1);
    }
}
