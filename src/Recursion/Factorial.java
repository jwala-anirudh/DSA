package Recursion;

import java.util.Scanner;

public class Factorial {

    static int factorial(int n) {
        if (n == 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of N ::");
        int N = sc.nextInt();
        int result = factorial(N);
        System.out.println("Result :: " + result);

        sc.close();
    }
}
