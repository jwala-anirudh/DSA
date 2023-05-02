package Mathematics;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int counter = 0;

        // Time complexity: O(sqrt(N))
        for (int i = 1; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                counter++;

                if (number / i != i) {
                    counter++;
                }
            }
        }

        if (counter == 2) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        sc.close();
    }
}
