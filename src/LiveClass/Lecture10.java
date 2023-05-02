package LiveClass;

public class Lecture10 {
    // https://practice.geeksforgeeks.org/problems/selection-sort/1?page=1&difficulty[]=0&category[]=Sorting&sortBy=submissions
    static void selectionSort(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            int smallestIndex = i;

            for (int j = i; j <= n - 1; j++) {
                if (arr[j] < arr[smallestIndex]) {
                    smallestIndex = j;
                }
            }

            // Swap the values
            int temp = arr[smallestIndex];
            arr[smallestIndex] = arr[i];
            arr[i] = temp;
        }
    }

    // https://practice.geeksforgeeks.org/problems/bubble-sort/1
    static void bubbleSort(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // https://practice.geeksforgeeks.org/problems/insertion-sort/1
    static void insertionSort(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i; j >= 0; j--) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                } else {
                    break;
                }
            }
        }
    }

    // https://practice.geeksforgeeks.org/problems/cyclically-rotate-an-array-by-one2614/1

    // https://practice.geeksforgeeks.org/problems/find-the-fine4353/1

    // https://practice.geeksforgeeks.org/problems/union-of-two-sorted-arrays-1587115621/1

    // https://practice.geeksforgeeks.org/problems/equilibrium-point-1587115620/1
}
