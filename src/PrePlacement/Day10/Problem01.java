package PrePlacement.Day10;

/*
 * Sum of digits
 * ================
 * Given a number, we need to find sum of its digits using recursion.
 *
 * Link: https://practice.geeksforgeeks.org/problems/sum-of-digits1742/1
 */
public class Problem01 {
    /*
     * TC: O(log N base 2)
     * SC: O(1)
     */
    int sumOfDigits(int n) {
        if (n == 0) {
            return 0;
        }

        int lastDigit = n % 10;

        return lastDigit + sumOfDigits(n / 10);
    }
}
