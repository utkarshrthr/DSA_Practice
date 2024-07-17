package com.utkarshrathore.app.hd.dsa._002_maths;

public class _025_Sieve_Of_Eratosthenes {

    public static void main(String[] args) {
        solution(100);
    }

    static void solution(int n){
        boolean[] nonPrimes = new boolean[n+1];
        nonPrimes[0] = true;
        nonPrimes[1] = true;
        for(int i=2;i<n;i++){  // n times
            if(!nonPrimes[i]){ // n/2+n/3+n/5+n/7+n/11
                int j = 2*i; // j = i*i
                while (j<n+1){
                    nonPrimes[j] = true;
                    j+=i;
                }
            }
        }
        for(int i=2;i<n+1;i++){
            if(!nonPrimes[i]){
                System.out.println(i);
            }
        }
    }
}
