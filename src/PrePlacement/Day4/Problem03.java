package PrePlacement.Day4;

/**
 * Find the total count of negative numbers in a non-increasing
 * sorted matrix across rows and columns
 */
public class Problem03 {
    /*
     * Brute force
     * =============
     * Two nested loops to check MxN times and print the count
     *
     * TC: O(M * N)
     * SC: O(1)
     */

    /*
     * Optimized
     *
     * Algorithm
     * =============
     * 1) Initialize count = 0 (total negative elements)
     * 2) Let n be no. of columns
     *        m be no. of rows
     *
     * Iterate on each row of the matrix &
     * find the index of 1st -ve element (left)
     *
     * 3) All elements from (left to n) will be -ve
     * Therefore, row is in decreasing order
     *
     * Increment count by (n - left)
     *
     * TC: O(log N) --> M rows
     *     ---> M * O(log N)
     * SC: O(1)
     */
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
