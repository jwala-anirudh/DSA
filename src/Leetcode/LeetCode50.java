package Leetcode;

/**
 * Pow(x, n)
 * <p>
 * Implement pow(x, n), which calculates x raised to the power n (i.e., x^n).
 */
public class LeetCode50 {
    double power(double x, int n) {
        if (n == 0) {
            return 1;
        }

        double p = power(x, n / 2);
        if (n % 2 == 0) {
            return p * p;
        } else {
            return p * p * x;
        }
    }

    double myPow(double x, int n) {
        if (x == 0) {
            return 0;
        }

        double ans = power(x, n);

        if (n > 0) {
            return ans;
        }

        return 1 / ans;
    }
}
