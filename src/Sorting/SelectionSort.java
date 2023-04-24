package Sorting;

import java.util.Scanner;

/**
 * Select minimums and swap
 */
public class SelectionSort {

    // Brute force
    static void selectionSort01(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int lowestIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[lowestIndex]) {
                    lowestIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[lowestIndex];
            arr[lowestIndex] = temp;
        }

        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    static void selectionSort02(int[] arr) {
        // Why (arr.length - 1) ===> by the time we go to the end last element is sorted
        for (int i = 0; i < arr.length - 1; i++) {
            int lowestIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[lowestIndex]) {
                    lowestIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[lowestIndex];
            arr[lowestIndex] = temp;
        }

        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr1 = {13, 46, 24, 52, 20, 9};
        int[] arr2 = {13, 46, 24, 52, 20, 9};

        selectionSort01(arr1);
        selectionSort02(arr2);

        sc.close();
    }
}
