package PrePlacement.Day01;

/**
 * Given an integer array nums, find a subarray that has the largest product,
 * and return the product.
 * <p>
 * The test cases are generated so that the answer will fit in a 32-bit integer.
 */
public class Problem03 {
    /*
     * 1) While going through numbers, we have to keep track
     * of maximum_product up till that number
     *
     * And main_product up till that number
     *
     * 2) max_so_far = Max(
     *      max_so_far * current,
     *      min_so_far * current
     *      current
     *    );
     *
     *    min_so_far = Min(
     *      max_so_far * current,
     *      min_so_far * current
     *      current
     *    );
     *
     * 3) Update result,
     *      result = Max(result, max_so_far)
     */
    int maxProduct(int[] nums) {
        if (nums.length == 0)
            return 0;

        int maxSoFar = nums[0];
        int minSoFar = nums[0];
        int result = maxSoFar;

        for (int i = 1; i < nums.length; i++) {
            int current = nums[i];

            int temp = Math.max(current, Math.max(maxSoFar * current, minSoFar * current));
            minSoFar = Math.min(current, Math.min(maxSoFar * current, minSoFar * current));
            maxSoFar = temp;

            result = Math.max(result, maxSoFar);
        }

        return result;
    }
}
