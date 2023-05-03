package ArraysSection.Easy;

public class RotateByK {
    // Left rotate: Brute force
    static void leftRotateArrayByDBrute(int[] arr, int d) {
        int n = arr.length;
        d = d % n;
        int[] temp = new int[d];

        // Copy the starting elements and prepare the temp array
        for (int i = 0; i < temp.length; i++) {
            temp[i] = arr[i];
        }

        // Shift the elements to left
        for (int i = d; i < n; i++) {
            arr[i - d] = arr[i];
        }

        // Copy back the temp values to array
        for (int i = n - d; i < n; i++) {
            arr[i] = temp[i - (n - d)];
        }
    }

    // Left rotate: Optimal solution
    static void leftRotateArrayByD(int[] arr, int d) {
        int n = arr.length;
        d = d % n;

        reverseArray(arr, 0, d - 1);
        reverseArray(arr, d, n - 1);
        reverseArray(arr, 0, n - 1);
    }

    // Right Rotate: Brute force
    static void rightRotateArrayByKBrute(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        int[] temp = new int[k];

        // Copy the last k elements and prepare the temp array
        int j = 0;
        for (int i = n - k; i < n; i++) {
            temp[j] = nums[i];
            ++j;
        }

        // Shift the elements to right
        j = nums.length - 1;
        for (int i = n - k - 1; i >= 0; i--) {
            nums[j] = nums[i];
            --j;
        }

        // Copy back the temp values to array
        for (int i = 0; i < temp.length; i++) {
            nums[i] = temp[i];
        }
    }

    // Right Rotate: Optimal
    static void rightRotateArrayByK(int[] arr, int k) {
        int n = arr.length;
        k = k % n;

        reverseArray(arr, 0, n - 1);
        reverseArray(arr, 0, k - 1);
        reverseArray(arr, k, n - 1);
    }

    static void reverseArray(int[] arr, int start, int end) {
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            ++start;
            --end;
        }
    }
}
