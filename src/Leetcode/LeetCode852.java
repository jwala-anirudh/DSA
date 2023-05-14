package Leetcode;

/**
 * Peak Index in a Mountain Array
 * <p>
 * An array arr a mountain if the following properties hold:
 * <p>
 * arr.length >= 3
 * <p>
 * There exists some i with 0 < i < arr.length - 1 such that:
 * arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
 * arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
 * <p>
 * Given a mountain array arr, return the index i such that arr[0] < arr[1] < ... < arr[i - 1] < arr[i] > arr[i + 1] > ... > arr[arr.length - 1].
 * <p>
 * You must solve it in O(log(arr.length)) time complexity.
 */
public class LeetCode852 {
    public int peakIndexInMountainArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + ((right - left) / 2);

            if (mid > 0 && arr[mid] < arr[mid - 1]) {
                right = mid - 1;
            } else if (mid < arr.length - 1 && arr[mid] < arr[mid + 1]) {
                left = mid + 1;
            } else {
                result = mid;
                break;
            }
        }

        return result;
    }

}
