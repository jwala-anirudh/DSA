package Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Find Duplicate
 * <p>
 * You have been given an integer array/list(ARR) of size N which contains
 * numbers from 0 to (N - 2). Each number is present at least once. That is, if
 * N = 5, the array/list constitutes values ranging from 0 to 3 and among these,
 * there is a single integer value that is present twice. You need to find and
 * return that duplicate number present in the array.
 * Note :
 * Duplicate number is always present in the given array/list.
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
 * For each test case, print the duplicate element in the array/list.
 * <p>
 * Output for every test case will be printed in a separate line.
 * Constraints :
 * 1 <= t <= 10^2
 * 0 <= N <= 10^3
 * Time Limit: 1 sec
 * Sample Input 1:
 * 1
 * 9
 * 0 7 2 5 4 7 1 3 6
 * Sample Output 1:
 * 7
 * Sample Input 2:
 * 2
 * 5
 * 0 2 1 3 1
 * 7
 * 0 3 1 5 4 3 2
 * Sample Output 2:
 * 1
 * 3
 */

public class FindDuplicate {
    static void findDuplicate01(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                }
            }
        }
    }

    static ArrayList<Integer> findDuplicate02(int[] arr, int n) {
        ArrayList<Integer> result = new ArrayList<>();
        HashMap<Integer, Integer> frequency = new HashMap<>();

        for (int j : arr) {
            if (frequency.containsKey(j)) {
                int prevCount = frequency.get(j);
                frequency.put(j, ++prevCount);
            } else {
                frequency.put(j, 1);
            }
        }

        for (Integer number : frequency.keySet()) {
            Integer occurrences = frequency.get(number);
            if (occurrences > 1) {
                result.add(number);
            }
        }

        Collections.sort(result);

        if (result.size() == 0) {
            result.add(-1);
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

            findDuplicate01(arr);

            noOfTests--;
        }

        sc.close();
    }
}
