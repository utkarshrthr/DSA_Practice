package com.utkarshrathore.app.hd.dsa._004_matrix;

public class _002_Print_Matrix {

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 0, 1, 2},
                {3, 4, 5, 6}
        };
        printMatrixRowWise(matrix);
        System.out.println();
        printMatrixColumnWise(matrix);
        System.out.println();
        printMatrixDiagonals1(matrix);
        System.out.println();
        printMatrixDiagonals2(matrix);
    }

    static void printMatrixRowWise(int[][] matrix){
        for(int i=0; i<matrix.length; i++){
            for (int j=0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    static void printMatrixColumnWise(int[][] matrix){
        int M = matrix.length; // rows
        int N = matrix[0].length; // columns
        for(int i = 0; i<N; i++){ // iterate over columns
            for(int j = 0; j<M; j++){ // // iterate over rows
                System.out.print(matrix[j][i]+" ");
            }
            System.out.println();
        }
    }

    static void printMatrixDiagonals1(int[][] matrix){
        int rows = matrix.length;
        for (int i = 0; i<rows; i++){
            System.out.print(matrix[i][i] + " ");
        }
    }

    static void printMatrixDiagonals2(int[][] matrix){
        int rows = matrix.length;
        int col = rows-1;
        for (int i = 0; i<rows; i++, col--){
            System.out.print(matrix[i][col] + " ");
        }
    }
}
