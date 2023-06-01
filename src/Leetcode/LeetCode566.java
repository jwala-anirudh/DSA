package Leetcode;

// Reshape the Matrix
public class LeetCode566 {
    /*
     * In MATLAB, there is a handy function called reshape which can reshape
     * an m x n matrix into a new one with a different size r x c keeping its original data.
     *
     * You are given an m x n matrix mat and two integers r and c representing
     * the number of rows and the number of columns of the wanted reshaped matrix.
     *
     * The reshaped matrix should be filled with all the elements of the
     * original matrix in the same row-traversing order as they were.
     *
     * If the reshape operation with given parameters is possible and
     * legal, output the new reshaped matrix; Otherwise, output the original matrix.
     */
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int[][] result = new int[r][c];

        // Base conditions
        if (mat.length == 0 || r * c != mat.length * mat[0].length) {
            return mat;
        }

        int count = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                result[count / c][count % c] = mat[i][j];
                count++;
            }
        }

        return result;
    }
}
