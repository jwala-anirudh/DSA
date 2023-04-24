package Recursion;

import java.util.Scanner;

public class FibonacciNumbers {

    // Time complexity: O(2^n)
    static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nth fibbonacci number :: ");
        int N = sc.nextInt();
        System.out.println("Result :: " + fibonacci(N));

        sc.close();
    }
}
