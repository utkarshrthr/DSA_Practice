package com.utkarshrathore.app.hd.dsa._012_recursion;

public class _008_Kth_Symbol {

    public static void main(String[] args) {
        solve(2, 2);
    }

    static int solve(int A, int B) {
        StringBuilder sb = new StringBuilder();
        sb.append("0");
        return solve(sb, A, B-1, 1, 0);
    }

    static int solve(StringBuilder sb, int A, int B, int row, int startIndex){
        if(A == row){
            int index = (1<<(row-1))+B;
            return sb.charAt(index-1) == '0' ? 0 : 1;
        }
        int len = sb.length(); // 3, '001', 0-1,1-3,3-N
        int i = startIndex; // 0
        while(i<len){
            if(sb.charAt(i) == '0')
                sb.append("01");
            else
                sb.append("10");
            i++;
        }
        return solve(sb, A, B, row+1, len);
    }
}
