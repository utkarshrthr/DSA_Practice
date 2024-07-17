package com.utkarshrathore.app.hd.dsa._004_matrix;

import java.util.Arrays;

public class _010_Transpose_Of_Matrix {

    public static void main(String[] args) {
    /* For rectangle matrix, you must need extra space of O(N) to transpose */
    /* For square matrix, transpose can be done in in-place. */
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 0, 1, 2},
                {3, 4, 5, 6}
        };

        /*int[][] rotated = {
                {3, 9, 5, 1},
                {4, 0, 6, 2},
                {5, 1, 7, 3},
                {6, 2, 8, 4}
        };*/
        for(int[] ar: matrix){
            System.out.println(Arrays.toString(ar));
        }
        transposedMatrix(matrix);
        System.out.println();
        for(int[] ar: matrix){
            System.out.println(Arrays.toString(ar));
        }
    }

    static void transposedMatrix(int[][] matrix){
        int rows = matrix.length;
        int cols = matrix[0].length;
        int i = 0;
        int j = 0;
        while (i<rows-1){
            j = i+1;
            while (j<cols){
                swap(i, j, matrix);
                j++;
            }
            i++;
        }
        //
        for(i=0; i<rows; i++){
            for(j=0;j<cols/2;j++){
                swap(i, j, matrix);
            }
        }
    }

    static void swap(int i, int j, int[][] matrix){
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
    }
}
