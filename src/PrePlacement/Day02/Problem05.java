package PrePlacement.Day02;

import java.util.HashSet;
import java.util.Set;

/**
 * Given an array of integers nums containing n + 1 integers where each integer is in
 * the range [1, n] inclusive.
 * <p>
 * There is only one repeated number in nums, return this repeated number.
 * <p>
 * You must solve the problem without modifying the array nums and uses only
 * constant extra space.
 */
public class Problem05 {
    /*
     * Brute force
     * ==============
     * Compare all element one by one
     *
     * (n-1) + (n-2) + ... + 1
     *
     * TC: O(N^2)
     */

    /*
     * Sorting
     * ==============
     * Compare all element one by one
     * whichever element is same will be
     * same,
     *
     * Check for arr[n-1] == arr[n]
     *
     * TC: O(N log N)
     */

    /*
     * Optimal Solution
     * =================
     * 1) Store elements in the hashset
     * 2) If an element is already present,
     * return that element
     */
    int findDuplicate(int[] nums) {
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
