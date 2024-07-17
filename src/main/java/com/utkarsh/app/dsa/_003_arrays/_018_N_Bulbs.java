package com.utkarshrathore.app.hd.dsa._003_arrays;

public class _018_N_Bulbs {
    /*
    * A wire connects N light bulbs. Each bulb has a switch associated with it; however, due to faulty wiring, a switch
    * also changes the state of all the bulbs to the right of the current bulb. Given an initial state of all bulbs, find
    * the minimum number of switches you have to press to turn on all the bulbs. You can press the same switch multiple times.
    * Note: 0 represents the bulb is off and 1 represents the bulb is on.
    * */
    public static void main(String[] args) {
        int[] ar = {0, 1, 0, 1};
        System.out.println(solution(ar));
    }

    static int solution(int[] ar){ // {0, 1, 0, 1}
        int press = 0;
        for(int i:ar){
            if(i == 0 && press%2==0){
                press++;
            }
            else if(i==1 && press%2!=0){
                press++;
            }
        }
        return press;
    }
}
