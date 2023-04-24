package Mathematics;

public class GcdHcf {

    public static int gcd(int a, int b) {
        int gcdResult = 1;

        /* Brute force
            for (int i = 1; i <= Math.max(a, b); i++) {
                if ((a % i == 0) && (b % i) == 0) {
                    gcdResult = i;
                }
            }
         */

        /* Small optimization
           Time complexity: O(min(a, b))

            for (int i = 1; i <= Math.min(a, b); i++) {
                if ((a % i == 0) && (b % i) == 0) {
                    gcdResult = i;
                }
            }
         */

        /* Medium optimization
            for (int i = Math.min(a, b); i >= 1; i--) {
                if ((a % i == 0) && (b % i) == 0) {
                    gcdResult = i;
                    break;
                }
            }
         */

        // Best optimization
        while (a > 0 && b > 0) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }
        if (a == 0) {
            gcdResult = b;
        } else {
            gcdResult = a;
        }

        return gcdResult;
    }
}
