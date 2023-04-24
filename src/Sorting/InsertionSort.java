package Sorting;

import java.util.Scanner;

/**
 * Tricky:
 * Takes an elements and places in correct position
 */

public class InsertionSort {
  static void insertionSort(int[] arr) {
    int n = arr.length;
    for (int i = 0; i < n; i++) {
      int j = i;

      while (j > 0 && arr[j - 1] > arr[j]) {
        // Swap
        int temp = arr[j - 1];
        arr[j - 1] = arr[j];
        arr[j] = temp;

        j--;
      }
    }

    for (int j : arr) {
      System.out.print(j + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int[] arr = { 13, 46, 24, 52, 20, 9 };
    insertionSort(arr);

    sc.close();
  }
}
