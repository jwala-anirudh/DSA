package Leetcode;

/**
 * Maximum Product Subarray
 */
public class LeetCode152 {
    public int maxProduct(int[] nums) {
        if (nums.length == 0)
            return 0;

        int maxSoFar = nums[0];
        int minSoFar = nums[0];
        int result = maxSoFar;

        for (int i = 1; i < nums.length; i++) {
            int current = nums[i];

            int temp = Math.max(current, Math.max(maxSoFar * current, minSoFar * current));
            minSoFar = Math.min(current, Math.min(maxSoFar * current, minSoFar * current));
            maxSoFar = temp;

            result = Math.max(result, maxSoFar);
        }

        return result;
    }
}
