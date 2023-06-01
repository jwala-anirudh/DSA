package PrePlacement.Day06;

/**
 * Given an m x n integer matrix, if an element is 0,
 * set its entire row and column to 0's.
 * <p>
 * You must do it in place
 */
public class Problem01 {
    /*
     * Approach 1
     * ==============
     * 1) Make a pass over original array and look
     * for 0 elements
     *
     * 2) If entry at arr[i][j] = 0, then record "i"
     * in the row hashset & "j" in column hashset
     *
     * 3) Iterate over the original matrix if arr[r][c]
     *      if arr[r][c]
     *          if "r" is in rowset (or) c is in columnset
     *              set arr[r][c] = 0
     *
     * TC: O(M * N)
     * SC: O(M + N)
     */

    /*
     * Approach 2
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
    void setZeros(int[][] matrix) {
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