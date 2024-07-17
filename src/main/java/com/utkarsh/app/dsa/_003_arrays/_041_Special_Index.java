package com.utkarshrathore.app.hd.dsa._003_arrays;

public class _041_Special_Index {

    public static void main(String[] args) {
        specialIndex(new int[]{4, 3, 2, 7, 6, -2});
    }

    static void specialIndex(int[] ar){
        int oddSum = 0;
        int evenSum = 0;
        int[] pfEven = new int[ar.length];
        int[] pfOdd = new int[ar.length];
        for(int i=0;i<ar.length;i++){
            if(i%2==0){
               evenSum+=ar[i];
               pfEven[i]=evenSum;
               if(i+1< ar.length)
                   pfEven[i+1]=evenSum;
            }
            else {
                oddSum+=ar[i];
                pfOdd[i]=oddSum;
                if(i+1< ar.length)
                    pfOdd[i+1]=oddSum;
            }
        }
//        System.out.println(Arrays.toString(pfEven));
//        System.out.println(Arrays.toString(pfOdd));
        // Queries
        /*System.out.println(Arrays.toString(ar));
        System.out.println("Sum of all even:" + pfEven[ar.length-1]);
        System.out.println("Sum of all odd:" + pfOdd[ar.length-1]);
        System.out.println();

        System.out.println("Sum of N-1 even:" + (pfEven[ar.length-1]-pfEven[2*0]));
        System.out.println("Sum of N-1 odd:" + (pfOdd[ar.length-1]-pfOdd[2*0+1]));
        System.out.println();
        System.out.println("Sum of N-2 even:" + (pfEven[ar.length-1]-pfEven[2*1]));
        System.out.println("Sum of N-2 odd:" + (pfOdd[ar.length-1]-pfOdd[2*1+1]));*/

        for(int i=0; i<ar.length; i++){
            if(i == 0){
                int od = pfEven[ar.length-1] -pfEven[0];
                int even = pfOdd[ar.length-1];
                if(od == even)
                    System.out.println("Special index: "+i);
            }
            else {
                int even = /* sum of even before that index*/ pfEven[i-1]+ (pfOdd[ar.length-1]-pfOdd[i]);
                int odd = /* sum of even before that index*/ pfOdd[i-1]+ (pfEven[ar.length-1]-pfEven[i]);
                if(odd == even)
                    System.out.println("Special index: "+i);
            }
        }
    }
}
