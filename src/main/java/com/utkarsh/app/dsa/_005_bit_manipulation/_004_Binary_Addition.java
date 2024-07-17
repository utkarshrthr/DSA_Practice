package com.utkarshrathore.app.hd.dsa._005_bit_manipulation;

public class _004_Binary_Addition {
    // Given two binary strings A and B. Return their sum (also a binary string).
    public static void main(String[] args) {
        System.out.println(solution("111111", "1111"));
    }

    static String solution(String A, String B){
        StringBuilder sb = new StringBuilder();
        int i=A.length()-1;  // 111111, 6
        int j=B.length()-1; // 1111,  4
        int carry = 0;
        while(i >= 0 && j >= 0){ //  5, 4
            int a = A.charAt(i)-48;  // 1
            int b = B.charAt(j)-48;// 1
            int val = a+b+carry; // 2
            if(val == 0){
                sb.append('0');
                carry = 0;
            }
            else if(val == 1){
                sb.append('1');
                carry = 0;
            }
            else if(val == 2){
                sb.append('0');
                carry = 1;
            }
            else if(val == 3){
                sb.append('1');
                carry = 1;
            }
            i--; j--;
        }
        while(i>=0){
            int val = (A.charAt(i)-48) + carry;
            if(val == 0){
                sb.append('0');
                carry = 0;
            }
            else if(val == 1){
                sb.append('1');
                carry = 0;
            }
            else if(val == 2){
                sb.append('0');
                carry = 1;
            }
            i--;
        }

        while(j>=0){
            int val = (B.charAt(j)-48) + carry;
            if(val == 0){
                sb.append('0');
                carry = 0;
            }
            else if(val == 1){
                sb.append('1');
                carry = 0;
            }
            else if(val == 2){
                sb.append('0');
                carry = 1;
            }
            j--;
        }
        if(carry==1){
            sb.append('1');
        }
        return sb.reverse().toString();
    }
}
