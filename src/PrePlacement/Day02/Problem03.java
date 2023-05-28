package PrePlacement.Day02;

/**
 * You are given two integer arrays nums1 and nums2, sorted in non-decreasing
 * order, and two integers m and n, representing the number of elements in nums1
 * and nums2 respectively.
 * <p>
 * Merge nums1 and nums2 into a single array sorted in non-decreasing order.
 * <p>
 * The final sorted array should not be returned by the function, but instead be
 * stored inside the array nums1. To accommodate this, nums1 has a length of m +
 * n, where the first m elements denote the elements that should be merged, and the
 * last n elements are set to 0 and should be ignored. nums2 has a length of n.
 */
public class Problem03 {
    /*
     * Algorithm
     * ============
     * 1) Initialise a new array nums1Copy containing
     * the first M elements
     *
     * 2) Initialise "p1" to beginning of nums1Copy
     *
     * 3) Initialise "p2" to beginning of nums2
     *
     * 4) If nums1Copy[p1] exists is less than or equal to nums[p2]
     *
     * 5) Write nums1Copy[p1] in nums1 & increment p1
     * Else,
     *    Write nums2[p2] in nums1 & increment p2
     *
     * Time Complexity: O(M + N)
     * Space Complexity: O(M)
     */
    void merge(int[] nums1, int m, int[] nums2, int n) {
        // Make a copy of first M element of num2
        int[] nums1Copy = new int[m];
        for (int i = 0; i < m; i++) {
            nums1Copy[i] = nums1[i];
        }

        // Read pointers for nums1Copy and num2 respectively
        int p1 = 0;
        int p2 = 0;

        // Compare elements from nums1Copy and nums2
        // and write the smallest to nums1
        for (int p = 0; p < m + n; p++) {
            // We also need to ensure that p1 and p2
            // aren't over the boundaries of their respective arrays
            if (p2 >= n || (p1 < m && nums1Copy[p1] < nums2[p2])) {
                nums1[p] = nums1Copy[p1];
                p1++;
            } else {
                nums1[p] = nums2[p2];
                p2++;
            }
        }
    }

    // Easy solution to read
    void mergeEasy(int[] nums1, int m, int[] nums2, int n) {
        int i = 0; // to iterate over nums1
        int j = 0; // to iterate over nums2
        int k = 0; // to iterate over result
        int[] result = new int[n + m];

        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                result[k] = nums1[i];
                i++;
                k++;
            } else {
                result[k] = nums2[j];
                j++;
                k++;
            }
        }

        // Iteration exhausted, but more elements are present
        while (i < m) {
            result[k] = nums1[i];
            i++;
            k++;
        }

        while (j < n) {
            result[k] = nums2[j];
            j++;
            k++;
        }

        // Update the original nums1
        for (int index = 0; index < result.length; index++) {
            nums1[index] = result[index];
        }
    }
}
