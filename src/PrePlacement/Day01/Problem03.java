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
        return 0;
    }
}
