package com.utkarshrathore.app.hd.dsa._006_strings;

public class _001_Toggle_Character_Case {

    /* Given a string, toggle the case of every character.
    *  Input: HappY, Output: hAPPy
    * */
    public static void main(String[] args) {
        System.out.println(solution("hApPy")); //
        System.out.println(solution2("hApPy")); //
    }

    static String solution(String ip){ // counting sort
        char[] ar = ip.toCharArray();
        for(int i=0; i< ar.length;i++){
            char c = ar[i];
            if(c >='A' && c <= 'Z'){  //if(Character.isUpperCase(c)){ // if(c >=65 && c <= 90){
                //ar[i] = Character.toLowerCase(ar[i]);
                ar[i] = (char)(c+32);
            }
            else { // expecting it only contains alphabets and no special character
                //ar[i] = Character.toUpperCase(ar[i]);
                ar[i] = (char)(c-32);
            }
        }
        return String.valueOf(ar);
    }

    static String solution2(String ip){
        /*
        * 'A' -> 1000001
        * 'a' -> 1100001
        *  Since difference b/w them is 32. only 6th bit will change from lower to upper case and vice versa
        *  So we can toggle 6th bit in each representation
        * */
        char[] ar = ip.toCharArray();
        for(int i=0; i< ar.length;i++){
            ar[i] ^= 32;
        }
        return String.valueOf(ar);
    }

    static int toggleBit(int n){
        // 65 -> 1000001
        // 97 -> 1100001
        // 1<<6
        return 0;
    }
}
