package ArraysSection;

import java.util.Scanner;

/**
 * Given an array of integers A (sorted) and a integer Val.
 * <p>
 * Implement a function that takes A and Val as input parameters and returns the
 * lower bound of Val.
 * <p>
 * Note: If Val is not present in array then Lower bound of a given integer
 * means integer which is just smaller than given integer.
 * <p>
 * Otherwise Val itself is the answer.
 * <p>
 * If Val is less than smallest element of array A then return '-1' in that
 * case.
 * <p>
 * Example 1 :
 * A = [-1, -1, 2, 3, 5]
 * Val = 4
 * Answer : 3
 * <p>
 * Since 3 is just smaller than 4 in the array.
 * <p>
 * Example 2 :
 * A = [1, 2, 3, 4, 6]
 * Val = 4
 * Answer : 4
 * <p>
 * Since 4 is equal to 4.
 */

public class LowerBound {
    static int identifyArrayLowerBound(int[] arr, int val) {
        int lowerBound = -1;

        for (int j : arr) {
            if (j < val) {
                lowerBound = j;
            } else if (j == val) {
                return val;
            }
        }

        return lowerBound;
    }

    // Since it is a sorted array, we can do binary search type
    static int identifyArrayLowerBoundOptimized(int[] arr, int val) {
        // Modified version of binary search
        int start = 0;
        int end = arr.length - 1;
        int result = -1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] <= val) {
                result = arr[mid];
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }

        return result;
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

            System.out.println("Enter the Val :: ");
            int val = sc.nextInt();

            int result = identifyArrayLowerBound(arr, val);
            System.out.println("Result :: " + result);

            int result1 = identifyArrayLowerBoundOptimized(arr, val);
            System.out.println("Result :: " + result1);

            noOfTests--;
        }

        sc.close();
    }
}
