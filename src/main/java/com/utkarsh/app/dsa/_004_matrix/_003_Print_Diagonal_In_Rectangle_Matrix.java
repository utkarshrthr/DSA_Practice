package com.utkarshrathore.app.hd.dsa._004_matrix;

public class _003_Print_Diagonal_In_Rectangle_Matrix {

    // Diagonals: Diagonals can start from Oth row & last column

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 0, 1, 2}
        };
        printMatrixAllDiagonals(matrix);
    }
    // [2, 0] i = rows-1; col = 0
    // [1, 0] [2, 1]
    // [0, 0] [1, 1] [2, 2]
    // [0, 1] [1, 2] [2, 3]
    // [0, 2] [1, 3]
    // [0, 3] i = 0, j = col-1
    static void printMatrixAllDiagonals(int[][] matrix){
        int rows = matrix.length;
        int cols = matrix[0].length;
        int i = 0; int j = 0;
        while (i<rows){
            int st = i; int en = j;
            while (st < rows && en < cols){
                System.out.print(matrix[st][en] + " ");
                st++; en++;
            }
            System.out.println();
            i++;
        }
        i = 0; j = 1;
        while (j<cols){
            int st = i; int en = j;
            while (st < rows && en < cols){
                System.out.print(matrix[st][en] + " ");
                st++; en++;
            }
            System.out.println();
            j++;
        }
/*************************************************/
        i = 0; j = cols-1;
        while (i<rows){
            int st = i; int en = j;
            while (st < rows && en >=0){
                System.out.print(matrix[st][en] + " ");
                st++; en--;
            }
            System.out.println();
            i++;
        }
        i = 0; j = cols-2;
        while (j>=0){
            int st = i; int en = j;
            while (st < rows && en >=0){
                System.out.print(matrix[st][en] + " ");
                st++; en--;
            }
            System.out.println();
            j--;
        }
    }
}
