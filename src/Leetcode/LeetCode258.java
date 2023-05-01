package Leetcode;

/**
 * Given an integer num, repeatedly add all its digits until the
 * result has only one digit, and return it.
 */
public class LeetCode258 {
    public int addDigits(int num) {
        if (num == 0) {
            return 0;
        } else if (num % 9 == 0) {
            return 9;
        } else {
            return num % 9;
        }
    }

    public int addDigitsBruteForce(int num) {
        int sum = 0;

        // original value is not zero
        // and intermediate calculated sum is of two digits
        while (num > 0 || sum > 9) {
            if (num == 0) {
                num = sum;
                sum = 0;
            }

            sum += num % 10;
            num = num / 10;
        }

        return sum;
    }
}
