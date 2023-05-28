package PrePlacement.Day02;

import java.util.HashSet;
import java.util.Set;

/**
 * Given an array nums containing n distinct numbers in the
 * range [0, n], return the only number in the
 * range that is missing from the array.
 */
public class Problem01 {
    /*
     * Brute force
     * ===========
     * 1) Sort the array
     * 2) Loop through the array and check
     * individually if for missing one
     *
     * Time Complexity
     * ================
     * Sorting: O(N log N) + Searching: O(N)
     * --- Total: O(N log N)
     */

    /*
     * Optimized Sol 1
     * =================
     * 1) Maintain a hashset of elements
     * 2) No. of elements = n + 1
     *
     * 3) Check if No. from 0...n+1 are present
     * in the hash set or not
     *
     * 4) If not, return the number
     *
     * TC: O(N)
     * SC: O(N)
     */
    int missingNumber(int[] nums) {
        Set<Integer> hashset = new HashSet<>();
        for (int n : nums) {
            hashset.add(n);
        }

        for (int i = 0; i < nums.length + 1; i++) {
            if (!hashset.contains(i)) {
                return i;
            }
        }

        return -1;
    }

    /*
     * Optimized Sol 2
     * =================
     * 1) Loop through all the values of input
     * 2) Calculate the sum of elements present
     * 3) Since we are given, there are elements
     * from 0...N we can compute the "Sum of N elements"
     *
     * sum = (N * (N+1))/2
     *
     * 4) Calculate the difference between
     * Result ---> sumOfNValues - actualArraySum
     */
}
