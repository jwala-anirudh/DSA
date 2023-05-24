package PrePlacement.Day01;

/**
 * Given an array of size N. The task is to find the maximum
 * and the minimum element of the array using the minimum
 * number of comparisons.
 * <p>
 * <p>
 * arr[] = {3, 5, 4, 1, 9}
 * <p>
 * Minimum Element is: 1
 * Maximum Element is: 9
 */
public class Problem01 {
    /**
     * Approach 1: (Brute force)
     *
     * 1) Compare each element with all the elements
     * 2) After comparison, place the element at the last if it is largest
     * 3) Keep doing the same for all the elements
     *
     * Time complexity --> No of comparisions
     * (n - 1) + (n - 2) + (n - 3) + .... + 1 ====> N*(N+1) / 2
     *
     * O(N^2)
     */

    /**
     * Approach 2: (Optimal)
     *
     * 1) Sort the elements
     * 2) Take the first and last elements
     *
     * Time complexity --> O(N log N)
     */

    /**
     * Approach 3: (Optimized)
     *
     * 1) Initialize the min & max with 0
     * 2) If the size of arr is 1, then return the first element
     * 3) If the size is more, then keep comparing the elements
     * on the go
     *
     * In the end, after one complete round of comparison
     * return the min and max
     *
     * Time complexity --> O(N)
     */
}
