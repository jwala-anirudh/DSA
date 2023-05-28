package PrePlacement.Day01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given an integer array nums, return all the triplets
 * [nums[i], nums[j], nums[k]]
 * such that i != j, i != k, and j != k,
 * and nums[i] + nums[j] + nums[k] == 0.
 * <p>
 * Notice that the solution set must not contain duplicate triplets.
 */
public class Problem04 {
    /*
     * Dividing a formula of 3-Sum from 2-Sum problem
     *
     * Algorithm
     * ============
     * 1) Sort the input array
     * 2) If current value > 0, break from the loop
     * 3) If current value is same as one before, skip it
     * 4) Call 2sum for current position 'i'
     *
     * 2 Sum
     * =========
     * 1) Set low=i+1, high=last index
     * 2) Execute the loop
     *      while low < high
     *          if sum (num[low], num[high]) < -num[i]
     *                  or you can write
     *             num[low] + num[high] + num[i] < 0
     *          --- increment low
     *
     *          if sum > 0
     *          --- decrement high
     *
     *          Otherwise, sum = 0
     *          --- add triplet to answer
     *
     *          increment low
     *          decrement high
     *
     * Time complexity
     * ==================
     *       Sorting -- O(N log N)
     *       2 Sum   -- O(N^2)
     *
     *       O(N^2) + O(N log N)
     *
     *       Total --> O(N^2)
     *
     * Space complexity: O(1)
     */
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < nums.length && nums[i] <= 0; i++) {
            // checking for duplicates
            if (i == 0 || nums[i - 1] != nums[i]) {
                twoSum(nums, i, result);
            }
        }

        return result;
    }

    void twoSum(int[] nums, int current, List<List<Integer>> result) {
        int low = current + 1;
        int high = nums.length - 1;

        while (low < high) {
            int sum = nums[low] + nums[high] + nums[current];

            if (sum < 0) {
                ++low;
            } else if (sum > 0) {
                --high;
            } else {
                result.add(
                        Arrays.asList(nums[current], nums[low], nums[high])
                );
                ++low;
                --high;

                // ignore the duplicates
                while (low < high && nums[low] == nums[low - 1]) {
                    ++low;
                }
            }
        }
    }
}
