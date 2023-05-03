package ArraysSection;

import java.util.Scanner;

import java.util.List;
import java.util.ArrayList;

/**
 * Given an integer vector and a value k, your task is to rotate the array k
 * times clockwise.
 * <p>
 * Input Format
 * In the function an integer vector and number k is passed.
 * <p>
 * Output Format
 * Return an integer vector.
 * <p>
 * <p>
 * Sample Input
 * {1, 3, 5, 7, 9}, x = 2
 * <p>
 * Sample Output
 * {7, 9, 1, 3, 5}
 * <p>
 * Explanation
 * After 1st rotation - {9, 1, 3, 5, 7}
 * After 2nd rotation - {7, 9, 1, 3, 5}
 */

public class KRotate {
    static void rotateArrayByKTimes(List<Integer> arr, int k) {
        List<Integer> result = new ArrayList<>();
        int n = arr.size();

        for (int i = 0; i < n; i++) {
            if (i < k) {
                result.add(arr.get(n + i - k));
            } else {
                result.add(arr.get(i - k));
            }
        }

        for (Integer res : result) {
            System.out.print(res + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no of test cases :: ");
        int noOfTests = sc.nextInt();

        while (noOfTests != 0) {
            System.out.println("Enter the array size :: ");
            int arrSize = sc.nextInt();
            List<Integer> arr = new ArrayList<>();

            System.out.println("Enter the array elements :: ");
            for (int i = 0; i < arrSize; i++) {
                arr.add(sc.nextInt());
            }

            System.out.println("Enter the value of K ::");
            int k = sc.nextInt();

            rotateArrayByKTimes(arr, k);

            noOfTests--;
        }

        sc.close();
    }
}
