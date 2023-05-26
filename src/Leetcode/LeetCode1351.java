package Leetcode;

public class LeetCode1351 {
    public int countNegatives(int[][] grid) {
        int n = grid[0].length;
        int result = 0;

        for (int[] row : grid) {
            // binary search
            int left = 0;
            int right = n - 1;

            while (left <= right) {
                int mid = left + ((right - left) / 2);

                if (row[mid] >= 0) {
                    left = mid + 1;
                } else if (row[mid] < 0) {
                    right = mid - 1;
                }
            }

            result += (n - left);
        }

        return result;
    }

}
