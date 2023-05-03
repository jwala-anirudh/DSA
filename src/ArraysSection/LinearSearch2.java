package ArraysSection;

import java.util.Scanner;

public class LinearSearch2 {
    // Time complexity: O ( N )
    static int linearSearch(int[] arr, int n, int key) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {10, 15, 12, 9, 6, 4, 3, 10, 8};
        int n = arr.length;

        System.out.println("Enter the search key ::");
        int key = sc.nextInt();

        int result = linearSearch(arr, n, key);

        if (result != -1) {
            System.out.println("Key has been found at index :: " + result);
        } else {
            System.out.println("Key is not available in the array");
        }

        sc.close();
    }
}