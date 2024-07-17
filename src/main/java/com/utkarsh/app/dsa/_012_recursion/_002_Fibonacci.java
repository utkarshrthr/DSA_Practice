package com.utkarshrathore.app.hd.dsa._012_recursion;

public class _002_Fibonacci {

    public static void main(String[] args) {
        for (int i=1; i<21;i++)
            System.out.println(nThFibonacci(i));
    }

    static int nThFibonacci(int A){
        if(A<2)
            return A;
        return nThFibonacci(A-1)+nThFibonacci(A-2);
    }
}
