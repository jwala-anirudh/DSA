package PrePlacement.Day06;

import java.util.LinkedList;
import java.util.Queue;

public class Problem02 {
    /*
     * Approach 1
     * =================
     * The simplest method is to extract all the elements of the
     * given matrix by reading the elements in a row-wise fashion.
     * In this implementation, we use a queue to put the extracted elements.
     * Then, we can take out the elements of the queue formed
     * in a serial order and arrange the elements in the
     * resultant required matrix in a row-by-row order again.
     *
     * The formation of the resultant matrix won't be possible
     * if the number of elements in the original matrix isn't
     * equal to the number of elements in the resultant matrix.
     *
     * TC: O(M * N)
     * SC: O(M * N)
     */
    public int[][] matrixReshape1(int[][] nums, int r, int c) {
        int[][] res = new int[r][c];
        if (nums.length == 0 || r * c != nums.length * nums[0].length)
            return nums;
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                queue.add(nums[i][j]);
            }
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                res[i][j] = queue.remove();
            }
        }
        return res;
    }

    /**
     * Approach 2
     */
    int[][] matrixReshape2(int[][] nums, int r, int c) {
        int[][] result = new int[r][c];

        // Base conditions
        if (nums.length == 0 || r * c != nums.length * nums[0].length) {
            return nums;
        }

        int rows = 0;
        int cols = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                result[rows][cols] = nums[i][j];
                cols++;

                if (cols == c) {
                    rows++;
                    cols = 0;
                }
            }
        }

        return result;
    }

    /*
     * Approach 3
     * ==============
     * Index of an element in 2D array, can be determined
     * by
     *
     *      row = (count)
     *            -------
     *               c
     *
     *      col = (count) % c
     *
     *
     * Where, c -> Total No. of columns
     */
    int[][] matrixReshape(int[][] nums, int r, int c) {
        int[][] result = new int[r][c];

        // Base conditions
        if (nums.length == 0 || r * c != nums.length * nums[0].length) {
            return nums;
        }

        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                result[count / c][count % c] = nums[i][j];
                count++;
            }
        }

        return result;
    }
}
