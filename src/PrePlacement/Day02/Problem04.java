package PrePlacement.Day02;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array nums of size n, return the majority element.
 * <p>
 * The majority element is the element that appears more than ⌊n / 2⌋ times.
 * <p>
 * You may assume that the majority element always exists in the array.
 */
public class Problem04 {
    /*
     * Algorithm
     * =============
     * 1) We can use a hashmap to store elements &
     * their count/frequency
     * 2) Return the element with frequency > (n/2)
     *
     * TC: O(N)
     * SC: O(N)
     */
    int majorityElement(int[] nums) {
        Map<Integer, Integer> frequency = new HashMap<>();
        int result = 0;

        for (int num : nums) {
            if (!frequency.containsKey(num)) {
                frequency.put(num, 1);
            } else {
                frequency.put(num, frequency.get(num) + 1);
            }

            // check if condition is met
            if (frequency.get(num) > nums.length / 2) {
                // most recurring element
                result = num;
                break;
            }
        }

        return result;
    }
}
