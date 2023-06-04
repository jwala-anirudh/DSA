package PrePlacement.Day10;

import java.util.ArrayList;

/*
 * Subset Sums
 * ============
 * No. of subsets = 2^N
 * where, N is no of array elements
 *
 * Link: https://practice.geeksforgeeks.org/problems/subset-sums2234/1
 */
public class Problem03 {
    void sumOfSubsets(ArrayList<Integer> arr, ArrayList<Integer> result, int left, int right, int sum) {
        if (left > right) {
            result.add(sum);
            return;
        }

        // Value is Present
        sumOfSubsets(arr, result, left + 1, right, sum + arr.get(left));
        // Value is Absent
        sumOfSubsets(arr, result, left + 1, right, sum);
    }

    /*
     * TC: O(2^N)
     * SC: O(N)
     */
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N) {
        ArrayList<Integer> result = new ArrayList<>();

        sumOfSubsets(arr, result, 0, N - 1, 0);

        return result;
    }
}
