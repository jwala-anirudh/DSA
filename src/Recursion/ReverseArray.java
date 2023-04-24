package Recursion;

public class ReverseArray {
    // Brute force
    static void iterative(int[] arr) {
        int startIndex = 0;
        int endIndex = arr.length - 1;

        while (startIndex < endIndex) {
            // swap
            int temp = arr[startIndex];
            arr[startIndex] = arr[endIndex];
            arr[endIndex] = temp;

            startIndex++;
            endIndex--;
        }

        System.out.println("Output 1 :: ");
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    // Approach 1 - Recursive
    static void recursiveOne(int[] arr, int l, int r) {
        if (l > r) {
            System.out.println("Output 2 :: ");
            for (int j : arr) {
                System.out.print(j + " ");
            }
            System.out.println();
            return;
        }

        // swap
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;

        recursiveOne(arr, l + 1, r - 1);
    }

    // Approach 2 - Recursive
    static void recursiveTwo(int[] arr, int index) {
        int n = arr.length / 2;
        if (index >= n) {
            System.out.println("Output 3 :: ");
            for (int j : arr) {
                System.out.print(j + " ");
            }
            System.out.println();
            return;
        }

        // swap
        int temp = arr[index];
        arr[index] = arr[n - index - 1];
        arr[n - index - 1] = temp;

        recursiveTwo(arr, index + 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 313, 53, 354, 78};
        iterative(arr);

        int[] arr2 = {1, 4, 313, 53, 354, 78};
        recursiveOne(arr2, 0, arr.length - 1);
        recursiveTwo(arr2, 0);
    }
}
