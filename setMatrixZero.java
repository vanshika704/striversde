// brute force approach (o((m*n)*(m+n)))
//idea : when you find aa zero mark its enntire row and column to 0 but to avoid making multiple times, use a teemp variable -1 .
/////////////////////////////////////////////////
/// driver code 
public class setMatrixZero {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 1, 1},
            {1, 0, 1},
            {1, 1, 1}
        };

        setZeroes(matrix);

        // Print result
        for (int[] row : matrix) {
            for (int val : row) System.out.print(val + " ");
            System.out.println();
        }
    }
/////////////////////
// brute force approach (o((m*n)*(m+n)))
    // public static void setZeroes(int[][] matrix) {
    //     int m = matrix.length;
    //     int n = matrix[0].length;

    //     // First pass: mark rows and cols with -1
    //     for (int i = 0; i < m; i++) {
    //         for (int j = 0; j < n; j++) {
    //             if (matrix[i][j] == 0) {
    //                 // Mark row
    //                 for (int k = 0; k < n; k++) {
    //                     if (matrix[i][k] != 0) matrix[i][k] = -1;
    //                 }
    //                 // Mark column
    //                 for (int k = 0; k < m; k++) {
    //                     if (matrix[k][j] != 0) matrix[k][j] = -1;
    //                 }
    //             }
    //         }
    //     }

    //     // Second pass: replace -1 with 0
    //     for (int i = 0; i < m; i++) {
    //         for (int j = 0; j < n; j++) {
    //             if (matrix[i][j] == -1) matrix[i][j] = 0;
    //         }
    //     }
    // }


    //////////////////////////////////////////
    /// better approach (o(m+n)), space o(m+n)
    /// idea : uuuse twwo arrays to track which rows and whhich columns to be zeroed 
    // public static void setZeroes(int[][] matrix) {
    //     int m = matrix.length ,  n  = matrix[0].length;
    //     boolean[] rows = new boolean[m];
    //     boolean[] cols = new boolean[n];
    //     for (int i = 0 ; i < m;i++)
    //     {
    //         for (int j = 0 ; j <n; j++){
    //             if (matrix[i][j] == 0) {
    //                 rows[i] = true;
    //                 cols[j] = true;
    //             }
    //         }
          
    //     }
    //     for (int i = 0 ; i < m ;  i++){
    //             for (int j = 0 ; j < n ; j++){
    //                 if (rows[i]|| cols[j]){
    //                     matrix[i][j] = 0;
    //                 }
    //             }
    //     }
    // }




    //////////////////////////////////////////////////////
    /// optimal solution :(o(m*n)) space o(1)
    /// idea : use firsst row and forst column as markers 
    public static void setZeroes(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        boolean row0 = false, col0 = false;
    
        // Step 1: check first row and col
        for (int i = 0; i < m; i++) {
            if (matrix[i][0] == 0) col0 = true;
        }
        for (int j = 0; j < n; j++) {
            if (matrix[0][j] == 0) row0 = true;
        }
    
        // Step 2: mark rows and cols
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
    
        // Step 3: set zeroes based on marks
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }
    
        // Step 4: handle first row and col
        if (col0) {
            for (int i = 0; i < m; i++) matrix[i][0] = 0;
        }
        if (row0) {
            for (int j = 0; j < n; j++) matrix[0][j] = 0;
        }
    } 
}
