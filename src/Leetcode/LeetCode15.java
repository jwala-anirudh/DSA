package Leetcode;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

/**
 * 3 Sum
 * <p>
 * <p>
 * Given an integer array nums, return all the triplets
 * [nums[i], nums[j], nums[k]]
 * such that i != j, i != k, and j != k, and
 * nums[i] + nums[j] + nums[k] == 0.
 * <p>
 * Notice that the solution set must not contain duplicate triplets.
 */
public class LeetCode15 {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < nums.length && nums[i] <= 0; i++) {
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
