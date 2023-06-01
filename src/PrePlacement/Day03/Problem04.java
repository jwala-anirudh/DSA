package PrePlacement.Day03;

/**
 * Given an array nums with n objects colored red, white, or blue, sort them in-place
 * so that objects of the same color are adjacent, with the colors in the order red,
 * white, and blue.
 * <p>
 * We will use the integers 0, 1, and 2 to represent the color red, white, and blue,
 * respectively.
 * <p>
 * You must solve this problem without using the library's sort function.
 */
public class Problem04 {
    /*
     * Algorithm
     * =============
     * 1) Initialize boundary of 0's by p0 = 0
     *
     * 2) Initialize boundary of 2's by p2 = n-1
     *
     * 3) current = 0
     *
     * 4) While current <= p2,
     *      - if nums[current] = 0
     *        Swap current & p0 elements and move both pointers
     *
     *      - if nums[current] = 2
     *        Swap current & p2 elements and move both p2 to left
     *        p2 = p2-1
     *
     *      - If nums[current]=1
     *          current = current + 1
     *
     * TC: O(N)
     * SC: O(1)
     */
    void sortColors(int[] nums) {
        int p0 = 0, current = 0;
        int p2 = nums.length - 1;

        int temp;
        while (current <= p2) {
            if (nums[current] == 0) {
                temp = nums[p0];
                nums[p0] = nums[current];
                nums[current] = temp;

                p0++;
                current++;
            } else if (nums[current] == 2) {
                temp = nums[current];
                nums[current] = nums[p2];
                nums[p2] = temp;

                p2--;
            } else {
                current++;
            }
        }
    }
}
