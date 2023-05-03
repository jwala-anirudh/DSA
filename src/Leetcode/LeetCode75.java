package Leetcode;

public class LeetCode75 {
    public void sortColors(int[] a) {
        int n = a.length;
        int low = 0, mid = 0, high = n - 1;

        for (int i = 0; i < n; i++) {

            if (a[mid] == 0) {
                int temp = a[low];
                a[low] = a[mid];
                a[mid] = temp;

                // Since values are moved to left are 0's they are sorted
                // Move the pointers to next part of the window
                low++;
                mid++;
            } else if (a[mid] == 1) {
                // Assuming all 1's are at the correct locations
                mid++;
            } else if (a[mid] == 2) {
                // Occurance of 2's must be swapped with last watch element
                int temp = a[mid];
                a[mid] = a[high];
                a[high] = temp;

                high--;
            }

        }
    }
}
