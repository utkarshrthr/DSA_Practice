package com.utkarshrathore.app.hd.dsa._005_bit_manipulation;

public class _001_Excel_Columns_To_Numbers {

    /*
    * Given a string representing exel column e.g A, B, AA, BD etc.
    * Return a number corresponding to each column
    * A->1
    * Z->26
    * AA->27
    * BD->58
    * */

    static int solution(String column){
        int val = 0;
        char[] ar = column.toCharArray();
        int pow = 0;
        for(int i= ar.length-1;i>=0;i--){
            char c = ar[i];
            val+=Math.pow(26, i);
        }
        // AB = AB = 1*26+
        //

        return val;
    }
}
