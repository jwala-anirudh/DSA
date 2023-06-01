package PrePlacement.Day03;

/**
 * A permutation of an array of integers is an arrangement of its members into a
 * sequence or linear order.
 * <p>
 * For example, for arr = [1,2,3], the following are all the permutations of arr:
 * [1,2,3], [1,3,2], [2, 1, 3], [2, 3, 1], [3,1,2], [3,2,1].
 * <p>
 * The next permutation of an array of integers is the next lexicographically greater
 * permutation of its integer. More formally, if all the permutations of the array are
 * sorted in one container according to their lexicographical order, then the next
 * permutation of that array is the permutation that follows it in the sorted container.
 * <p>
 * If such arrangement is not possible, the array must be rearranged as the lowest
 * possible order (i.e., sorted in ascending order).
 * <p>
 * ● For example, the next permutation of arr = [1,2,3] is [1,3,2].
 * ● Similarly, the next permutation of arr = [2,3,1] is [3,1,2].
 * ● While the next permutation of arr = [3,2,1] is [1,2,3] because [3,2,1] does not
 * have a lexicographical larger rearrangement.
 * <p>
 * Given an array of integers nums, find the next permutation of nums.
 * <p>
 * The replacement must be in place and use only constant extra memory.
 */
public class Problem02 {
    /*
     * Algorithm
     * =============
     * 1) We need to find first pair. Of 2 successive
     * numbers in the array
     *
     * a[i] & a[i-1] such that,
     * a[i] > a[i-1]
     *
     * 2) From the end try to find the number which is just greater
     * than (i - 1)th number
     * Let it be "j"
     *
     * Swap those numbers
     *
     * 3) Reverse the array from position "i"
     *
     * TC: O(N)
     * SC: O(1)
     */
    void nextPermutation(int[] nums) {
        int i = nums.length - 2;
        while (i >= 0 && nums[i + 1] <= nums[i]) {
            i--;
        }

        if (i >= 0) {
            int j = nums.length - 1;
            while (nums[j] <= nums[i]) {
                j--;
            }
            // swap i, j
            swap(nums, i, j);
        }
        // reverse the rest of the part
        reverse(nums, i + 1);
    }

    void reverse(int[] nums, int start) {
        int i = start;
        int j = nums.length - 1;

        while (i < j) {
            // swap i, j
            swap(nums, i, j);
            i++;
            j--;
        }
    }

    void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
