package ArraysSection;

import java.util.Scanner;

/**
 * 1. Fast and efficient
 * 2. Search space is monotonic
 */
public class BinarySearch {
    // Time complexity: O( log N base 2 )
    static int binarySearch(int[] arr, int n, int key) {
        int start = 0;
        int end = n - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] > key) {
                end = mid - 1;
            } else if (arr[mid] < key) {
                start = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Sorted input
        int[] arr = {10, 20, 30, 40, 45, 60, 70, 89};
        int n = arr.length;

        System.out.println("Enter the search key ::");
        int key = sc.nextInt();

        int result = binarySearch(arr, n, key);

        if (result != -1) {
            System.out.println("Key has been found at index :: " + result);
        } else {
            System.out.println("Key is not available in the array");
        }

        sc.close();
    }
}
