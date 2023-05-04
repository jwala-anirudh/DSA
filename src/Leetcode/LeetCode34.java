package Leetcode;

/**
 * Find First and Last Position of Element in Sorted Array
 * <p>
 * Given an array of integers nums sorted in non-decreasing order,
 * find the starting and ending position of a given target value.
 * <p>
 * If target is not found in the array, return [-1, -1].
 * <p>
 * You must write an algorithm with O(log n) runtime complexity.
 */
public class LeetCode34 {
    public int[] searchRange(int[] nums, int target) {
        int leftIndex = -1;
        int rightIndex = -1;

        int n = nums.length;
        int low = 0;
        int high = n - 1;

        // Determine the left most index for target
        while (low <= high) {
            int mid = low + ((high - low) / 2);

            if (nums[mid] == target) {
                leftIndex = mid;
                // Next, inorder to perform search still on the left side
                high = mid - 1;
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        low = 0;
        high = n - 1;
        // Determine the right most index for target
        while (low <= high) {
            int mid = low + ((high - low) / 2);

            if (nums[mid] == target) {
                rightIndex = mid;
                // Next, inorder to perform search still on the right side
                low = mid + 1;
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return new int[]{leftIndex, rightIndex};
    }
}
