package Leetcode;

/**
 * Toeplitz Matrix
 * <p>
 * Given an m x n matrix, return true if the matrix is Toeplitz.
 * Otherwise, return false.
 * <p>
 * A matrix is Toeplitz if every diagonal from top-left to bottom-right
 * has the same elements.
 */
public class LeetCode766 {
    /*
     * Algorithm
     * ============
     * For every element that belongs to a diagonal, compare it with the previous
     * element (if it exists) on the same diagonal.
     *
     * TC: O(M * N)
     * SC: O(1)
     */
    public boolean isToeplitzMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                if (row > 0 && col > 0
                        && matrix[row - 1][col - 1] != matrix[row][col]) {
                    return false;
                }
            }
        }

        return true;
    }
}
