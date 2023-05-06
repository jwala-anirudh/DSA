package Leetcode;

import java.util.Arrays;

public class LeetCode1498 {
    public int numSubseq(int[] nums, int target) {
        // Sort the given input
        Arrays.sort(nums);

        // Left and right pointer will be present on the array

        // Right pointer is moved when given condition fails
        // Left pointer is moved when given condition passes
        int left = 0;
        int right = nums.length - 1;
        int result = 0;

        // Since the answer may be too large, return it modulo 10^9 + 7
        int[] exp = new int[nums.length];
        exp[0] = 1;

        // Prepare an exponential calculated array
        for (int i = 1; i < nums.length; i++)
            exp[i] = (exp[i - 1] * 2) % 1000000007;

        // Iterate over the array and move the pointers
        while (left <= right) {
            if (nums[left] + nums[right] <= target) {
                result = (result + exp[right - left]) % 1000000007;
                left++;
            } else {
                // When the picked values are greater than target
                right--;
            }
        }

        return result;
    }

}
