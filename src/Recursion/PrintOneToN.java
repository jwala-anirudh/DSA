package Recursion;

import java.util.Scanner;

/**
 * Print 1 to N using recursion
 */
public class PrintOneToN {
    static void printAscendingNumbers(int i, int n) {
        if (i > n) {
            return;
        }
        System.out.print(i + " ");
        printAscendingNumbers(i + 1, n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter N value: ");
        int N = sc.nextInt();
        printAscendingNumbers(1, N);

        sc.close();
    }
}
