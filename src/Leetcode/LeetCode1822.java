package Leetcode;

/**
 * Sign of the Product of an Array
 * <p>
 * <p>
 * There is a function signFunc(x) that returns:
 * <p>
 * <p>
 * 1 if x is positive.
 * -1 if x is negative.
 * 0 if x is equal to 0.
 * You are given an integer array nums.
 * Let product be the product of all values in the array nums.
 * <p>
 * Return signFunc(product).
 */
public class LeetCode1822 {
    public int arraySign(int[] numbers) {
        int result = 1;

        for (int num : numbers) {
            if (num == 0) {
                return 0;
            } else if (num < 0) {
                result = -(result);
            }
        }

        return result;
    }
}
