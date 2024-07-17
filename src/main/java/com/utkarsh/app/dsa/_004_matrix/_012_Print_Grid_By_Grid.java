package com.utkarshrathore.app.hd.dsa._004_matrix;

public class _012_Print_Grid_By_Grid {
    /*
     Given a 9*9 matrix, print matrix grid by grid. Each grid is of size 3*3.
    * */

    public static void main(String[] args) {
        int row = 9; int col = 9;
        for(int i=0; i<row; i+=3){
            for (int j=0; j<col; j+=3){
                int a = i; int b = j;
                for(int x=a; x<(a+3); x++){
                    for(int y=b; y<(b+3); y++){
                        System.out.print("["+x +","+y+"], ");
                    }
                    System.out.println();
                }
                System.out.println("Next Grid");
            }
        }
    }
}
