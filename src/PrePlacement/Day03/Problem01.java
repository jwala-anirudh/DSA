package PrePlacement.Day03;

/**
 * Implement pow(x, n), which calculates x raised to the power n (i.e., x^n)
 */
public class Problem01 {
    /*
     * More precise code is under LeetCode50.java
     *
     * Algorithm
     * ===========
     * For even X,
     *      X^n = (X^2)^(n/2)
     *
     * For odd X,
     *      X^n = X*(X^2)^(n/2)
     *
     * Time Complexity: O(log(N))
     * Space Complexity: O(log(N))
     */
    static double power(double x, int n) {
        if (n == 0) {
            return 1;
        }

        if (n < 0) {
            n = -n;
            x = 1 / x;
        }

        return (n % 2 == 0) ? power(x * x, (n / 2)) : x * power(x * x, (n / 2));
    }
}
