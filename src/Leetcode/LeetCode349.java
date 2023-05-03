package Leetcode;

// Intersection of Two Arrays

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

/**
 * Given two integer arrays nums1 and nums2, return
 * an array of their intersection. Each element in the result
 * must be unique and you may return the result in any order.
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: nums1 = [1,2,2,1], nums2 = [2,2]
 * Output: [2]
 * Example 2:
 * <p>
 * Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * Output: [9,4]
 * Explanation: [4,9] is also accepted.
 */
public class LeetCode349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;

        List<Integer> answer = new ArrayList<>();

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                ++i;
            } else if (nums2[j] < nums1[i]) {
                ++j;
            } else {
                if (!answer.contains(nums1[i])) {
                    answer.add(nums1[i]);
                }
                ++i;
                ++j;
            }
        }

        int[] result = new int[answer.size()];
        int k = 0;
        for (int element : answer) {
            result[k] = element;
            ++k;
        }

        return result;
    }
}
