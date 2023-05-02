package Leetcode;

/**
 * You are given an n x n 2D matrix representing an image, rotate the image
 * by 90 degrees (clockwise).
 * <p>
 * You have to rotate the image in-place, which means you have to modify the
 * input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation.
 */
public class LeetCode48 {
    public void rotate(int[][] matrix) {
        // Transpose of a matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < i; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Reversing values of columns, row-by-row
        for (int i = 0; i < matrix.length; i++) {
            int leftIndex = 0;
            int rightIndex = matrix[0].length - 1;

            while (leftIndex <= rightIndex) {
                int temp = matrix[i][leftIndex];
                matrix[i][leftIndex] = matrix[i][rightIndex];
                matrix[i][rightIndex] = temp;

                leftIndex++;
                rightIndex--;
            }
        }
    }
}
