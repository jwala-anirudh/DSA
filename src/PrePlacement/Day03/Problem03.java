package PrePlacement.Day03;

/**
 * Given an array arr[] of distinct elements size N that is sorted and then around an
 * unknown point, the task is to check if the array has a pair with a given sum X.
 */
public class Problem03 {
    /*
     * Algorithm
     * =============
     * 1) Run a loop from 0 to (N-1) to find the pivot points
     *
     * 2) Left pointer will point to the smallest element of the array
     * Right pointer will point to the largest element of the array
     *
     * 3) While (left != right), keep checking
     *    sum = arr[l] + arr[r];
     *
     *    If sum > target:
     *      --right;
     *    If sum < target
     *      ++left;
     *
     * Since right may exhaust at a point it needs to
     * come back to the actual right. So we need to write the formula,
     *
     * l = (l+1) mod N
     * r = (r-1+N) mod N
     *
     * TC: O(N)
     * SC: O(1)
     */
    boolean pairInSortedArray(int[] arr, int n, int x) {
        // Find the pivot element
        int i;
        for (i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                break;
            }
        }

        // l is now index of smallest element
        int l = (i + 1) % n;

        // r is now index of largest element
        int r = i;

        // Keep moving either l or r till they meet
        while (l != r) {
            // If we find a pair with sum x, we return true
            if (arr[l] + arr[r] == x) {
                return true;
            }

            // If current pair sum is less, move to the higher sum
            if (arr[l] + arr[r] < x) {
                l = (l + 1) % n;
            } else {
                // Move to the lower sum side
                r = (r - 1 - n) % n;
            }
        }

        return false;
    }
}
