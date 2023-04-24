package Recursion;

import java.util.Scanner;

public class PrintNToOne {
    static void printDescendingNumbers(int n) {
        if (n < 1) {
            return;
        }
        System.out.print(n + " ");
        printDescendingNumbers(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter N value: ");
        int N = sc.nextInt();
        printDescendingNumbers(N);

        sc.close();
    }
}
