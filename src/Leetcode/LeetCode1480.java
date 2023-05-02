package Leetcode;

/**
 * Given an array nums. We define a running sum of an array as
 * runningSum[i] = sum(nums[0]…nums[i]).
 * <p>
 * Return the running sum of nums.
 * <p>
 * Example 1:
 * Input: nums = [1,2,3,4]
 * Output: [1,3,6,10]
 * Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
 * <p>
 * Example 2:
 * Input: nums = [1,1,1,1,1]
 * Output: [1,2,3,4,5]
 * Explanation: Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].
 * <p>
 * Example 3:
 * Input: nums = [3,1,2,10,1]
 * Output: [3,4,6,16,17]
 */
public class LeetCode1480 {
    public int[] runningSum(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int runningSum = 0;

        for (int i = 0; i < n; i++) {
            runningSum += nums[i];
            result[i] = runningSum;
        }

        return result;
    }
}
