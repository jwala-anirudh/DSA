package Recursion;

import java.util.Scanner;

/**
 * Print name N times using recursion
 */
public class PrintNTimes {

    static void printName(int n) {
        if (n == 0) {
            return;
        }
        System.out.println("Anirudh");
        printName(n - 1);
    }

    static void printNameTwo(int iterations, int n) {
        if (iterations > n) {
            return;
        }
        System.out.println("Anirudh");
        printNameTwo(iterations + 1, n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no of times Name be printed :: ");
        int N = sc.nextInt();
        printName(N);
        System.out.println("====================");
        printNameTwo(1, N);

        sc.close();
    }
}
