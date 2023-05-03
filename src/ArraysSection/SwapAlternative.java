package ArraysSection;

import java.util.Scanner;

/**
 * Swap Alternate
 * <p>
 * You have been given an array/list(ARR) of size N. You need to swap every pair
 * of alternate elements in the array/list.
 * <p>
 * You don't need to print or return anything, just change in the input array
 * itself.
 * <p>
 * Input Format :
 * The first line contains an Integer 't' which denotes the number of test cases
 * or queries to be run. Then the test cases follow.
 * <p>
 * First line of each test case or query contains an integer 'N' representing
 * the size of the array/list.
 * <p>
 * Second line contains 'N' single space separated integers representing the
 * elements in the array/list.
 * <p>
 * Output Format :
 * For each test case, print the elements of the resulting array in a single row
 * separated by a single space.
 * <p>
 * Output for every test case will be printed in a separate line.
 * Constraints :
 * 1 <= t <= 10^2
 * 0 <= N <= 10^5
 * <p>
 * Time Limit: 1sec
 * <p>
 * Sample Input 1:
 * 1
 * 6
 * 9 3 6 12 4 32
 * <p>
 * Sample Output 1 :
 * 3 9 12 6 32 4
 * <p>
 * Sample Input 2:
 * 2
 * 9
 * 9 3 6 12 4 32 5 11 19
 * 4
 * 1 2 3 4
 * <p>
 * Sample Output 2 :
 * 3 9 12 6 32 4 11 5 19
 * 2 1 4 3
 */

public class SwapAlternative {
    static void swapAlternatives(int[] arr) {

        for (int i = 0; i < arr.length - 1; i = i + 2) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }

        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
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

            swapAlternatives(arr);

            noOfTests--;
        }

        sc.close();
    }
}
