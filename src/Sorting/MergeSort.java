package Sorting;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class MergeSort {

    static void merge(int[] arr, int low, int mid, int high) {
        List<Integer> temp = new ArrayList<>();

        int left = low;
        int right = mid + 1;

        while ((left <= mid) && (right <= high)) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }

        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }

        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }

        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
    }

    static void mergeSort(int[] arr, int low, int high) {
        if (low == high)
            return;

        int mid = low + (high - low) / 2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array :: ");
        int size = sc.nextInt();

        System.out.println("Enter the array elements :: ");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        mergeSort(arr, 0, size - 1);

        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();

        sc.close();

    }

}