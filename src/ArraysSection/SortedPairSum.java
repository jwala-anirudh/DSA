package ArraysSection;

import java.util.Scanner;

/**
 * !SPECIAL ATTENSION
 * Given a sorted array and a number x, find a pair in array whose sum is
 * closest to x.
 * <p>
 * Input Format
 * In the function an integer vector and number x is passed.
 * <p>
 * Output Format
 * Return a pair of integers.
 * <p>
 * Sample Input
 * {10, 22, 28, 29, 30, 40}, x = 54
 * <p>
 * Sample Output
 * 22 and 30
 */

public class SortedPairSum {

    static void identifySortedPairSum(int[] arr, int X) {
        int resultIndex1 = 0, resultIndex2 = 0;

        int n = arr.length;
        int start = 0, end = n - 1;
        // start with max value
        int diff = Integer.MAX_VALUE;

        while (start < end) {
            int pairSum = arr[start] + arr[end];

            if (Math.abs(pairSum - X) < diff) {
                diff = Math.abs(pairSum - X);

                resultIndex1 = start;
                resultIndex2 = end;
            }

            if (pairSum > X)
                end--;
            else
                start++;
        }

        System.out.println(arr[resultIndex1] + " " + arr[resultIndex2]);
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

            System.out.println("Enter the value of X :: ");
            int x = sc.nextInt();

            identifySortedPairSum(arr, x);

            noOfTests--;
        }

        sc.close();
    }
}
