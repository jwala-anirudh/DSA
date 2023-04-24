package Arrays;

import java.util.Scanner;

/**
 * Implement a function that takes vector of integers as input and returns the
 * largest element.
 * <p>
 * Sample Input
 * -3 4 1 2 3
 * -1 -2 -3 -3 8
 * <p>
 * Sample Output
 * 4
 * 8
 * <p>
 * Explanation : for test case one, 4 is the largest integer in the array.
 * Similarly for test case two, 8 is the largest integer in the array.
 */

public class LargestElement {
    static int largestElementOfArr(int[] arr) {
        int largeElement = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largeElement) {
                largeElement = arr[i];
            }
        }

        return largeElement;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no of test cases :: ");
        int noOfTests = sc.nextInt();

        while (noOfTests != 0) {
            System.out.println("Enter the array size :: ");
            int arrSize = sc.nextInt();
            int[] arr = new int[arrSize];

            System.out.println("Enter the array elements :: ");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }

            int result = largestElementOfArr(arr);
            System.out.println("Result :: " + result);

            noOfTests--;
        }

        sc.close();
    }
}
