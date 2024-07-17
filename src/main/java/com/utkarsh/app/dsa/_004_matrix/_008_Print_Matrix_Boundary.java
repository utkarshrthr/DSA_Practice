package com.utkarshrathore.app.hd.dsa._004_matrix;

public class _008_Print_Matrix_Boundary {

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 0, 1, 2},
                {3, 4, 5, 6}
        };
        printMatrixBoundary(matrix);
    }

    static void printMatrixBoundary(int[][] matrix){
        int rows = matrix.length;
        int cols = matrix[0].length;
        int i = 0; int j = 0;
        while (j<cols){
            System.out.print(matrix[i][j] + " ");
            j++;
        }
        j--; i++;
        while (i<rows){
            System.out.print(matrix[i][j] + " ");
            i++;
        }
        i--; j = cols-2;
        while (j>=0){
            System.out.print(matrix[i][j] + " ");
            j--;
        }
        j=0;
        i--;
        while (i>0){
            System.out.print(matrix[i][j] + " ");
            i--;
        }
    }
}
