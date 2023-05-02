package Leetcode;

public class LeetCode268 {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sumOfNValues = (n * (n + 1)) / 2;
        int actualSum = 0;

        for (int num : nums) {
            actualSum += num;
        }

        return sumOfNValues - actualSum;
    }
}
