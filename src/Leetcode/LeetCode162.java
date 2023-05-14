package Leetcode;

/**
 * Find Peak Element
 * <p>
 * <p>
 * A peak element is an element that is strictly greater than its neighbors.
 * <p>
 * Given a 0-indexed integer array nums, find a peak element,
 * and return its index. If the array contains multiple peaks,
 * return the index to any of the peaks.
 * <p>
 * You may imagine that nums[-1] = nums[n] = -∞. In other words,
 * an element is always considered to be strictly greater than a
 * neighbor that is outside the array.
 * <p>
 * You must write an algorithm that runs in O(log n) time.
 */
public class LeetCode162 {
    public int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + ((right - left) / 2);

            if (mid > 0 && nums[mid] < nums[mid - 1]) {
                right = mid - 1;
            } else if (mid < nums.length - 1 && nums[mid] < nums[mid + 1]) {
                left = mid + 1;
            } else {
                result = mid;
                break;
            }
        }

        return result;
    }
}
