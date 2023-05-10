package Leetcode;

/**
 * Spiral Matrix II
 * <p>
 * Given a positive integer n, generate an n x n matrix filled
 * with elements from 1 to n2 in spiral order.
 */
public class LeetCode59 {
    public int[][] generateMatrix(int n) {
        int[][] answer = new int[n][n];

        int left = 0;
        int right = n - 1;

        int top = 0;
        int bottom = n - 1;

        int count = 0;

        while (top <= bottom && left <= right) {
            // Right direction
            for (int i = left; i <= right; i++) {
                answer[top][i] = ++count;
            }
            top++;

            // Bottom direction
            for (int i = top; i <= bottom; i++) {
                answer[i][right] = ++count;
            }
            right--;

            // Left direction
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    answer[bottom][i] = ++count;
                }
                bottom--;
            }

            // Top direction
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    answer[i][left] = ++count;
                }
                left++;
            }
        }

        return answer;
    }
}
