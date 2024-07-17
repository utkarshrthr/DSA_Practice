package com.utkarshrathore.app.hd.dsa._004_matrix;

public class _005_Transpose_Of_A_Matrix_Constant_Space {

    public static void main(String[] args) {
    /* For rectangle matrix, you must need extra space of O(N) to transpose */
    /* For square matrix, transpose can be done in in-place. */
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 0, 1, 2},
                {3, 4, 5, 6}
        };
        transposedMatrix(matrix);
        System.out.println();
    }

    static void transposedRectangleMatrix(){

    }

    static void transposedMatrix(int[][] matrix){
        // iterate on only one half, either left or right or diagonal
        int i = 0;
        int j = 0;
        int rows = matrix.length;
        int cols = matrix[0].length;
        while (i<rows-1){
            j = i+1;
            while (j<cols){
                swap(i, j, matrix);
                j++;
            }
            i++;
        }
    }

    static void swap(int i, int j, int[][] matrix){
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
    }
}
