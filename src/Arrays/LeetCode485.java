package Arrays;

public class LeetCode485 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxValue = 0;
        int countOfOnes = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                countOfOnes++;
                if (countOfOnes > maxValue) {
                    maxValue = countOfOnes;
                }
            } else {
                countOfOnes = 0;
            }
        }

        return maxValue;
    }
}
