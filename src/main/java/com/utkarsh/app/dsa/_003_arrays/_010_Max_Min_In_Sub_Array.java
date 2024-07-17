package com.utkarshrathore.app.hd.dsa._003_arrays;

public class _010_Max_Min_In_Sub_Array {

    public static void main(String[] args) {
        maxMinInSubArray2(new int[]{1, 2, 3, 1, 3, 4, 6, 1, 6, 3});
    }

    static void maxMinInSubArray(int[] ar){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i:ar){
            max = Math.max(max, i);
            min = Math.min(min, i);
        }
        int len = ar.length;
        for(int i=0; i<ar.length; i++){
            if(ar[i] == max){
                // find next min
                int j = i;
                while (j < ar.length){
                    if(ar[j] == min){
                        len = Math.min(len, (j-i+1));
                        break;
                    }
                    j++;
                }
            }
            else if(ar[i] == min){
                // find next max
                int j = i;
                while (j < ar.length){
                    if(ar[j] == max){
                        len = Math.min(len, (j-i+1));
                        break;
                    }
                    j++;
                }
            }
        }
        System.out.println(len);
    }

    static void maxMinInSubArray2(int[] ar){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i:ar){
            max = Math.max(max, i);
            min = Math.min(min, i);
        }
        int len = ar.length;
        int minIndex = -1;
        int maxIndex = -1;
        for(int i=0; i<ar.length; i++){ // 1, 2, 3, 1, 3, 4, 6, 1, 6, 3
            if(ar[i] == max){
                maxIndex = i;
                if(minIndex != -1){
                    len = Math.min(len, (Math.abs(maxIndex-minIndex))+1);
                }
            }
            else if(ar[i] == min){
                minIndex = i;
                if(maxIndex != -1){
                    len = Math.min(len, (Math.abs(maxIndex-minIndex))+1);
                }
            }
        }
        System.out.println(len);
    }
}
