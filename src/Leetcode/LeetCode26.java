package Leetcode;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LeetCode26 {
    // Time -> O(N log N) + O(N)
    static int removeDuplicatesBruteForce(int[] nums) {
        int k = 0;

        HashSet<Integer> set = new LinkedHashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        for (Integer val : set) {
            nums[k] = val;
            k = k + 1;
        }

        return k;
    }

    // Optimal approach -> O(N)
    static int removeDuplicates(int[] nums) {
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            // Look for a NEW value that is not same as arr[i] that is picked
            if (nums[j] != nums[i]) {
                nums[i + 1] = nums[j];
                i++;
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {
        int[] arr = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(removeDuplicates(arr));
    }
}
