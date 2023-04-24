package Arrays;

import java.util.Scanner;

/**
 * Find Unique
 * <p>
 * You have been given an integer array/list(ARR) of size N. Where N is equal to
 * [2M + 1].
 * Now, in the given array/list, 'M' numbers are present twice and one number is
 * present only once.
 * You need to find and return that number which is unique in the array/list.
 * Note:
 * Unique element is always present in the array/list according to the given
 * condition.
 * Input format :
 * The first line contains an Integer 't' which denotes the number of test cases
 * or queries to be run. Then the test cases follow.
 * <p>
 * First line of each test case or query contains an integer 'N' representing
 * the size of the array/list.
 * <p>
 * Second line contains 'N' single space separated integers representing the
 * elements in the array/list.
 * Output Format :
 * For each test case, print the unique element present in the array.
 * <p>
 * Output for every test case will be printed in a separate line.
 * Constraints :
 * 1 <= t <= 10^2
 * 0 <= N <= 10^3
 * Time Limit: 1 sec
 * Sample Input 1:
 * 1
 * 7
 * 2 3 1 6 3 6 2
 * Sample Output 1:
 * 1
 * Sample Input 2:
 * 2
 * 5
 * 2 4 7 2 7
 * 9
 * 1 3 1 3 6 6 7 10 7
 * Sample Output 2:
 * 4
 * 10
 */

public class FindUnique {
    static void findUnique01(int[] arr) {
        int totalSum = 0;
        int equalSum = 0;

        for (int i = 0; i < arr.length; i++) {
            totalSum += arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    equalSum += (arr[j] + arr[i]);
                }
            }
        }

        System.out.println("Result :: " + (totalSum - equalSum));
    }

    static void findUnique02(int[] arr) {
        int answer = 0;

        for (int i = 0; i < arr.length; i++) {
            answer = answer ^ arr[i];
        }

        System.out.println("Result :: " + answer);
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

            findUnique01(arr);
            findUnique02(arr);

            noOfTests--;
        }

        sc.close();
    }
}
