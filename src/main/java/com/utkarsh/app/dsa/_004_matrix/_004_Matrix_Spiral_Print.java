package com.utkarshrathore.app.hd.dsa._004_matrix;

public class _004_Matrix_Spiral_Print {

    public static void main(String[] args) {
        int[][] matrix = {
                { 1,  2,  3,  4, 5},
                {16, 17, 18, 19, 6},
                {15, 24, 25, 20, 7},
                {14, 23, 22, 21, 8},
                {13, 12, 11, 10, 9}
        };
        printSpiralMatrix(matrix);
    }

    static void printSpiralMatrix(int[][] m){
        int r = m.length; int c = m[0].length;
        int count = 0;
        int row = 0; int col = 0;
        while(count < (r*c)){
            for(int i=col; i<c;i++){
                System.out.print(m[row][i]+" ");
            }
            row++;
            System.out.println();
            for(int i=0; i<r;i++){
                System.out.print(m[row][i]+" ");
            }
            System.out.println();
            for(int i=c-1; i>=0;i--){
                System.out.print(m[c-1][i]+" ");
            }
            System.out.println();
            for(int i=r-1; i>=0;i--){
                System.out.print(m[i][i]+" ");
            }
            System.out.println();
        }
    }

    /*static void printSpiralMatrix(int[][] matrix){
        int rows = matrix.length;
        int cols = matrix[0].length;
        int i = -1; int j = 0;
        while (i<rows){
            i++;
            while (j<cols && i < rows){ // single row
                System.out.print(matrix[i][j]+" ");
                j++;
            }
            System.out.println();
            if(j==cols){
                i++; j--;
                while (j>=0  && i < rows){
                    System.out.print(matrix[i][j]+" ");
                    j--;
                }
                System.out.println();
            }
            j=0;
        }
    }*/
}
