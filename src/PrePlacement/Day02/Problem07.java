package PrePlacement.Day02;

/**
 * Given an array of positive integers. We need to make the given array a
 * ‘Palindrome’. The only allowed operation is”merging” (of two adjacent elements).
 * Merging two adjacent elements means replacing them with their sum. The task is
 * to find the minimum number of merge operations required to make the given
 * array a ‘Palindrome’.
 * <p>
 * To make any array a palindrome, we can simply apply merge operation n-1 times
 * where n is the size of the array (because a single-element array is always
 * palindromic, similar to a single-character string). In that case, the size of array
 * will be reduced to 1. But in this problem, we are asked to do it in the minimum
 * number of operations.
 */
public class Problem07 {
    /*
     * Algorithm
     * ============
     * 1) Let f(i, j) be the minimum no of operations
     * to make sub-array [i...j] a palindrome
     *
     * 2) We start from i = 0; j = n-1
     *
     * 3) If arr[i] == arr[j], we don't need to do
     * any operation,
     *
     * Else if arr[i] > arr[j] then:
     *      Merge arr[j-1], arr[j]
     *
     *      arr[j-1] = arr[j-1] + arr[j]
     *      answer = 1 + f(i, j - 1)
     *
     * Else if arr[i] < arr[j] then:
     *      Merge arr[i], arr[i+1]
     *
     *      arr[i+1] = arr[i] + arr[i+1]
     *      answer = 1 + f(i + 1, j)
     *
     * return f(0, n-1)
     */
    static int findMinOps(int[] arr, int n) {
        int result = 0;

        // Start from two corners
        for (int i = 0, j = n - 1; i <= j; ) {
            // if corner elements are same,
            // problem reduces arr[i+1...j-1]
            if (arr[i] == arr[j]) {
                i++;
                j--;
            }

            // if the left element is greater, then
            // we merge right two elements
            else if (arr[i] > arr[j]) {
                // merge from tail
                arr[j - 1] = arr[j - 1] + arr[j];
                j--;
                result++;
            }

            // else we merge left two elements
            else {
                arr[i + 1] = arr[i + 1] + arr[i];
                i++;
                result++;
            }
        }

        return result;
    }
}
