package Leetcode;

public class LeetCode485 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxValue = 0;
        int countOfOnes = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                countOfOnes++;
                maxValue = Math.max(countOfOnes, maxValue);
            } else {
                countOfOnes = 0;
            }
        }

        return maxValue;
    }
}
