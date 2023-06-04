package Leetcode;

/*
 * Find Greatest Common Divisor of Array
 * ==========================================
 * Given an integer array nums, return the greatest common divisor
 * of the smallest number and largest number in nums.
 *
 * The greatest common divisor of two numbers is the largest positive
 * integer that evenly divides both numbers.
 */
public class LeetCode1979 {
    private int gcd(int A, int B) {
        if (B == 0) {
            return A;
        }

        return gcd(B, A % B);
    }

    public int findGCD(int[] nums) {
        int minNumber = nums[0];
        int maxNumber = nums[0];

        // To get the min and max numbers of the array
        for (int i = 1; i < nums.length; i++) {
            minNumber = Math.min(minNumber, nums[i]);
            maxNumber = Math.max(maxNumber, nums[i]);
        }

        return gcd(maxNumber, minNumber);
    }
}
