package Leetcode;

/**
 * Matrix Diagonal Sum
 * <p>
 * <p>
 * Given a square matrix mat, return the sum of the matrix diagonals.
 * <p>
 * Only include the sum of all the elements on the primary diagonal
 * and all the elements on the secondary diagonal that are not part
 * of the primary diagonal.
 */
public class LeetCode1572 {
    public int diagonalSum(int[][] mat) {
        int rows = mat.length;
        int sum = 0;

        for (int i = 0; i < rows; i++) {
            // Primary diagonal sum
            System.out.println(i + " " + i);
            sum = sum + mat[i][i];

            // Secondary diagonal sum
            System.out.println(i + " " + (rows - 1 - i));
            sum = sum + mat[i][rows - 1 - i];
        }

        // Odd no. of rows are present, overlapping is present
        if (rows % 2 != 0) {
            int midPoint = rows / 2;
            sum = sum - mat[midPoint][midPoint];
        }

        return sum;
    }
}
