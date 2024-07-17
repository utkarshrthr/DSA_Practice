package com.utkarshrathore.app.hd.dsa._010_hashing;

import java.util.*;

public class _002_Valid_Soduko {

    public static void main(String[] args) {
        List<String> al = List.of("53..7....", "6..195...", ".98....6.", "8...6...3", "4..8.3..1", "7...2...6", ".6....28.", "...419..5", "....8..79");
        //List<String> al2 = List.of("....5..1.",".4.3.....",".....3..1","8......2.","..2.7....",".15......",".....2...",".2.9.....","..4......");
        List<String> al3 = List.of("..5.....6","....14...",".........",".....92..","5....2...",".......3.","...54....","3.....42.","...27.6..");
        isValidSudoku(al3);
    }


    public static void main2(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0; i<81; i++){
            al.add(i+1);
        }
        int i = 1;
        // print row wise
        for (Integer a: al){
            System.out.print(a + " ");
            if(i%9==0){
                System.out.println();
            }
            i++;
        }
        System.out.println("\n\n");
        i = 1; int j = 1;
        // print column wise
        for (Integer a: al){
            System.out.print(i + " ");
            i += 9;
            if(i > 81){
                System.out.println();
                i = (j++);
            }
        }
        System.out.println();
        System.out.println();
        j = 0; i = 0; int k = 0;
        while (true){
            Integer val = al.get(i); //
            System.out.print(val + " ");
            i+=9;
            if(i>80){
                i = (++j);
                System.out.println();
                //hs.clear();
            }
            if(k>=al.size())
                break;
            k++;
        }
    }

    /*public int isValidSudoku(final List<String> A) {
        HashSet<String> hs = new HashSet<>();
        for(int i=0; i<A.size(); i++){ // for rows
            String val = A.get(i);
            if(!val.equals(".") && !hs.add(val)){
                return 0;
            }
            if((i+1)%9 == 0){
                hs.clear();
            }
        }
        hs.clear();
        int i = 0; int j = 0;
        while(true){
            String val = A.get(i);
            if(!val.equals(".") && !hs.add(val)){
                return 0;
            }
            i+=9;
            if(i>=81){
                i = (++j);
                hs.clear();
            }
            if(j>8){
                break;
            }
        }
        return 1;
    }*/
    public static int isValidSudoku(final List<String> A) {
        int i = 0;
        int len = A.size();
        while(i < len){
            char[] row = A.get(i).toCharArray();
            HashSet<Character> hs = new HashSet<>();
            for(char c: row){
                if(c != '.' && !hs.add(c)){
                    return 0;
                }
            }
            i++;
        }
        i = 0;
        while(true){
            int j = 0;
            HashSet<Character> hs = new HashSet<>();
            while(j<len){
                char c = A.get(j).charAt(i);
                if(c != '.' && !hs.add(c)){
                    return 0;
                }
                j++;
            }
            i++;
            if(i==9){
                break;
            }
        }

        i=0; int j = 0;
        int blockSize = 0;
        HashSet<Character> hs = new HashSet<>();
        while(true){
            j = blockSize;
            while(true){
                char c = A.get(j).charAt(i);
                System.out.print("["+i+","+j+"] ");
                if(c != '.' && !hs.add(c)){
                    return 0;
                }
                j++; // 0, 1, 2
                if(j%3==0)
                    break;
            }
            System.out.println();
            i++; // 1
            if(i==9){
                if(j==9){
                    break;
                }
                i=0;
                blockSize+=3;
            }
            else if(i%3==0){  // 3, j
                j = blockSize;
                hs.clear();
            }
        }
        return 1;
    }
}
