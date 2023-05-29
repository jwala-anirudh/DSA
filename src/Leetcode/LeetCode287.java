package Leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * Find the Duplicate Number
 */
public class LeetCode287 {
    public int findDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();

        for (int num : nums) {
            if (seen.contains(num)) {
                return num;
            }

            seen.add(num);
        }

        return -1;
    }
}
