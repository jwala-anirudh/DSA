package PrePlacement.Day3;

/**
 * Given an integer array nums, rotate the array to the right by k steps, where k is
 * non-negative.
 */
public class Problem05 {
    /*
     * Brute force
     * ================
     * Swap values from right to left
     * and shift the rest of the elements
     *
     * TC: O(n*k)
     */

    /*
     * Using extra array
     * ==================
     * 1) Copy from k to n-1 into the new array
     * 2) Copy from 0 to k into the result array
     *
     * TC: O(n)
     * SC: O(n)
     */

    /*
     * Without Using extra array
     * ==========================
     * 1) Reverse all the numbers
     * 2) Reverse 1st k numbers
     * 3) Reverse numbers from k to n-1
     *
     * TC: O(n)
     * SC: O(1)
     */
    void rotate(int[] nums, int k) {
        k = k % nums.length;

        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }
    }
}
