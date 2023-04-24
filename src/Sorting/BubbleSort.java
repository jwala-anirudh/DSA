package Sorting;

import java.util.Scanner;

/**
 * Bubble sort
 * <p>
 * 💡 Take larger element to the end by repeatedly swapping the adjacent
 * elements.
 */
public class BubbleSort {

    /**
     * @param arr - unsorted array is taken
     * @param n   - no of element in the input
     *            Values are sorted as per bubble sort algorithm with adjacent
     *            comparison, swapping. When you perform ascending order sorting,
     *            then large element is pushed to the rightmost side first
     * @time Complexity: O(N ^ 2)
     */
    static void bubbleSort(int[] arr, int n) {
        // For an input of size "N", we must perform the same procedure "N-1" times
        for (int times = 1; times <= n - 1; times++) {

            // We must run the comparison by picking an element with a value next to it
            for (int j = 0; j <= n - times - 1; j++) {

                // If the value picked on left is larger, then move it to right by swapping
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }
        }
    }

    /**
     * In case of optimized approach, when you check in the comparison logic
     * Once the swap is completed,
     */
    static void bubbleSortOptimized(int[] arr, int n) {
        boolean swapped;
        for (int times = 1; times <= n - 1; times++) {
            swapped = false;

            for (int j = 0; j <= n - times - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {-2, 3, 4, -1, 5, -12, 6, 1, 3};
        bubbleSort(arr, arr.length);

        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();

        int[] arr1 = {1, 3, 5, 7, 9};
        bubbleSortOptimized(arr1, arr1.length);

        for (int j : arr1) {
            System.out.print(j + " ");
        }
        System.out.println();

        sc.close();
    }
}
