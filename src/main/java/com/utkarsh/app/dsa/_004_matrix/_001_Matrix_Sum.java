package com.utkarshrathore.app.hd.dsa._004_matrix;

public class _001_Matrix_Sum {

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 0, 1, 2}
        };
        matrixRowWiseSum(matrix);
        System.out.println();
        matrixColumnWiseSum(matrix);
        System.out.println();
        matrixSum(matrix);
    }

    static void matrixRowWiseSum(int[][] matrix){
        for(int i=0; i<matrix.length; i++){
            int rowSum = 0;
            for (int j=0; j<matrix[i].length; j++){
                rowSum += matrix[i][j];
                //System.out.print(matrix[i][j]+" ");
            }
            System.out.println(rowSum);
        }
    }

    static void matrixColumnWiseSum(int[][] matrix){
        int M = matrix.length; // rows
        int N = matrix[0].length; // columns
        for(int i = 0; i<N; i++){ // iterate over columns
            int colSum = 0;
            for(int j = 0; j<M; j++){ // // iterate over rows
                // System.out.print(matrix[j][i]+" ");
                colSum += matrix[j][i];
            }
            System.out.println(colSum);
        }
    }

    static void matrixSum(int[][] matrix){
        int M = matrix.length; // rows
        int N = matrix[0].length; // columns
        int sum = 0;
        for(int i = 0; i<N; i++){ // iterate over columns
            for(int j = 0; j<M; j++){ // // iterate over rows
                // System.out.print(matrix[j][i]+" ");
                sum += matrix[j][i];
            }
        }
        System.out.println(sum);
    }
}
