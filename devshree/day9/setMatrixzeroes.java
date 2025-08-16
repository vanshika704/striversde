package day9;

import java.util.*;

public class setMatrixzeroes {

    // Brute Force: Use a copy matrix
    public static void setZeroesBrute(int[][] matrix) {
        int n = matrix.length, m = matrix[0].length;
        int[][] copy = new int[n][m];
        for (int i = 0; i < n; i++) {
            copy[i] = matrix[i].clone();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (copy[i][j] == 0) {
                    for (int k = 0; k < m; k++) matrix[i][k] = 0; // row
                    for (int k = 0; k < n; k++) matrix[k][j] = 0; // col
                }
            }
        }
    }

    // Optimal: O(1) space using first row & col
    public static void setZeroesOptimal(int[][] matrix) {
        int n = matrix.length, m = matrix[0].length;
        boolean firstRow = false, firstCol = false;

        // Check first row
        for (int j = 0; j < m; j++) {
            if (matrix[0][j] == 0) firstRow = true;
        }

        // Check first col
        for (int i = 0; i < n; i++) {
            if (matrix[i][0] == 0) firstCol = true;
        }

        // Mark rows & cols
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        // Set zeroes using markers
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        // First row
        if (firstRow) {
            for (int j = 0; j < m; j++) matrix[0][j] = 0;
        }

        // First col
        if (firstCol) {
            for (int i = 0; i < n; i++) matrix[i][0] = 0;
        }
    }

    // Utility to print matrix
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static void main(String[] args) {
        int[][] matrix1 = {
            {1, 1, 1},
            {1, 0, 1},
            {1, 1, 1}
        };

        int[][] matrix2 = {
            {0, 1, 2, 0},
            {3, 4, 5, 2},
            {1, 3, 1, 5}
        };

        System.out.println("Original Matrix 1:");
        printMatrix(matrix1);
        setZeroesOptimal(matrix1);  // or setZeroesBrute(matrix1);
        System.out.println("After Set Zeroes (Optimal):");
        printMatrix(matrix1);

        System.out.println("\nOriginal Matrix 2:");
        printMatrix(matrix2);
        setZeroesOptimal(matrix2);
        System.out.println("After Set Zeroes (Optimal):");
        printMatrix(matrix2);
    }
}
