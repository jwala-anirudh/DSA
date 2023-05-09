package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode54 {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> answer = new ArrayList<>();

        // No of rows (m)
        int m = matrix.length;

        // No of cols (n)
        int n = matrix[0].length;

        int left = 0;
        int right = n - 1;

        int top = 0;
        int bottom = m - 1;

        while (top <= bottom && left <= right) {
            // Right direction
            for (int i = left; i <= right; i++) {
                answer.add(matrix[top][i]);
            }
            top++;

            // Bottom direction
            for (int i = top; i <= bottom; i++) {
                answer.add(matrix[i][right]);
            }
            right--;

            // Edge case 1
            if (top <= bottom) {
                // Left direction
                for (int i = right; i >= left; i--) {
                    answer.add(matrix[bottom][i]);
                }
                bottom--;
            }

            // Edge case 2
            if (left <= right) {
                // Top direction
                for (int i = bottom; i >= top; i--) {
                    answer.add(matrix[i][left]);
                }
                left++;
            }
        }

        return answer;
    }
}