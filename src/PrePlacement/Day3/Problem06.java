package PrePlacement.Day3;

public class Problem06 {
    /*
     * Algorithm
     * =============
     * 1) Maintain a counter for the number of 1's
     *
     * 2) Increment counter by 1, whenever we see 1
     *
     * 3) Whenever we encounter 0,
     *      update max
     *      revert counter = 0
     *
     *  4) Return max
     *
     *  TC: O(N)
     *  SC: O(1)
     */
    int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int maxCount = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                // increment the count of 1's by one
                count += 1;

                // find the maximum till now
                maxCount = Math.max(maxCount, count);
            } else {
                // reset count of 1
                count = 0;
            }
        }

        return Math.max(maxCount, count);
    }
}
