package Recursion;

import java.util.Scanner;

public class SumNValues {
    static void parameterizedSum(int i, int sum) {
        if (i < 0) {
            System.out.println("Sum :: " + sum);
            return;
        }
        parameterizedSum(i - 1, sum + i);
    }

    static int functionalSum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + functionalSum(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of N :: ");
        int N = sc.nextInt();
        parameterizedSum(N, 0);
        int sumResult = functionalSum(N);
        System.out.println("Sum :: " + sumResult);

        sc.close();
    }
}
