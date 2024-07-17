package com.utkarshrathore.app.hd.dsa._003_arrays;

public class _011_Print_All_Sub_Arrays {

    public static void main(String[] args) {
        printAllSubArrays(new int[]{1, 2, 3, 4, 5});
    }

    static void printAllSubArrays(int[] ar){
        for(int i=0; i< ar.length; i++){
            for(int j=i; j< ar.length; j++){
                System.out.print("[");
                for(int k=i; k<=j; k++){
                    System.out.print(ar[k]+" ");
                }
                System.out.print("]");
                System.out.println();
            }
            System.out.println();
        }
    }
    //System.out.print(ar[j] + " ");
}
