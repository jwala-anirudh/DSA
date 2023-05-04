package Leetcode;

public class LeetCode35 {
    static int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int low = 0;
        int high = n - 1;
        int index = -1;

        while (low <= high) {
            int mid = low + ((high - low) / 2);

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                low = mid + 1;
                index = mid + 1;
            } else {
                high = mid - 1;
                index = mid;
            }
        }

        return index;
    }
}
