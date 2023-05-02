package Leetcode;

/**
 * Given an array nums, return true if the array was originally sorted in non-decreasing order,
 * then rotated some number of positions (including zero). Otherwise, return false.
 * <p>
 * There may be duplicates in the original array.
 * <p>
 * Note: An array A rotated by x positions results in an array B of the same length
 * such that A[i] == B[(i+x) % A.length], where % is the modulo operation.
 */
public class LeetCode1752 {
    public boolean check(int[] nums) {
        int count = 0;
        int n = nums.length;

        for (int i = 1; i < n; i++) {
            // if there is any value, where its previous is greater than it
            if (nums[i - 1] > nums[i]) {
                count++;
            }
        }

        // Checking first and last element
        if (nums[n - 1] > nums[0]) {
            count++;
        }

        return count <= 1;
    }

}
