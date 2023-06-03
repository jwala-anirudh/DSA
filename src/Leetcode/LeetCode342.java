package Leetcode;

/*
 * Power of Four
 * ===============
 *
 * Given an integer n, return true if it is a power of four. Otherwise, return false.
 *
 * An integer n is a power of four, if there exists an integer x such that n == 4^x.
 */
public class LeetCode342 {
    public boolean isPowerOfFour(int n) {
        // Base case
        if (n <= 0)
            return false;

        // Because, 4^0 = 1
        if (n == 1)
            return true;

        if (n % 4 == 0)
            return isPowerOfFour(n / 4);
        else
            return false;
    }
}
