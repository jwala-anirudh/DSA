package ArraysSection;

import java.util.Scanner;

/**
 * Implement a function that takes an array as input and returns the maximum
 * sub array sum.
 * <p>
 * sub array --> continuous elements of the main array
 * <p>
 * Sample Input
 * 1 -2 3 4 4 -2
 * 5 0 -1 0 1 2 -1
 * <p>
 * Sample Output
 * 11
 * 7
 * <p>
 * Explanation : for test case one, A[2..4] is [3, 4, 4] and
 * It has max sum 3 + 4 + 4 = 11,
 * <p>
 * Similarly for test case two, answer should be 7.
 * Note: Minimum size of the sub array should be 1.
 */

public class MaxSubArraySum {
    static int maxSumOfArray(int[] arr) {
        // Special Edge Case: When all the values are negative
        // [-3, -2, -1, -5, -4]

        boolean allNegative = true;
        int largest = Integer.MIN_VALUE;

        for (int x : arr) {
            if (x > 0) {
                allNegative = false;
            }
            largest = Math.max(largest, x);
        }

        if (allNegative) {
            return largest;
        }

        // Kanade algo
        int currentSum = 0;
        int largestSum = 0;

        for (int j : arr) {
            currentSum = currentSum + j;

            if (currentSum < 0) {
                currentSum = 0;
            }

            largestSum = Math.max(largestSum, currentSum);
        }

        return largestSum;
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

            int result = maxSumOfArray(arr);
            System.out.println("Result :: " + result);

            noOfTests--;
        }

        sc.close();
    }
}
