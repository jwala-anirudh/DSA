package Mathematics;

import java.util.*;

public class PrintAllDivisors {

    // Write your printDivisor function here
    static void printDivisor(int n) {
    /* Brute force approach
        for (int i = 1; i <= n; i++) {
          if (n % i == 0) {
            System.out.print(i + " ");
          }
        }
     */

        // Optimized mathematical approach
        List<Integer> values = new ArrayList<>();

        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                values.add(i);

                // another factor
                if (n / i != i) {
                    values.add(n / i);
                }
            }
        }

        Collections.sort(values);
        for (Integer value : values) {
            System.out.print(value + " ");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printDivisor(n);
        sc.close();
    }
}
