package Leetcode;

// Set Matrix Zeroes
public class LeetCode73 {
    /*
     * Approach
     * ==============
     * Hint: Use first element of every row &
     * column as FLAG.
     *
     * 1) We iterate over the matrix & mark first cell
     * of row "i" & first cell of column "j", if cell[i][j] = 0
     *
     * 2) Catch: For the first cell of row & column cell[0][0],
     * we will use 2 variables "fr" and "fc" to know if first
     * row/first column has to be set 0 or not
     *
     * 3) Now we iterate over matrix again, matrix[r][c]
     * if matrix[r][0] == 0 (or) matrix[0][c] == 0
     *      we set matrix[r][c] = 0
     *
     * 4) Based on value of "fr" & "fc", we'll
     * set first row / first column as zero.
     *
     * TC: O(M * N)
     * SC: O(1)
     */
    public void setZeroes(int[][] matrix) {
        boolean fr = false;
        boolean fc = false;

        // Preparing the first row/column
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    if (i == 0)
                        fr = true;

                    if (j == 0)
                        fc = true;

                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }

        // Marking rest of element
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        // To set the first row as zeros
        if (fr) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[0][j] = 0;
            }
        }

        // To set the first column as zeros
        if (fc) {
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}
