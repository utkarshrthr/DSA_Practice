package com.utkarshrathore.app.hd.dsa._012_recursion;

public class _003_Factorial {

    public static void main(String[] args) {
        for (int i=1; i<10;i++)
            System.out.println(factorial(i));
    }

    static int factorial(int A){
        if(A == 1)
            return A;
        return A * factorial(A-1);
    }
}
