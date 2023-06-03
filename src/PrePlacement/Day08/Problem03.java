package PrePlacement.Day08;

/*
 * Valid Palindrome
 * ==================
 * A phrase is a palindrome if, after converting all uppercase
 * letters into lowercase letters and removing all non-alphanumeric
 * characters, it reads the same forward and backward. Alphanumeric
 * characters include letters and numbers.
 */
public class Problem03 {
    /*
     * Approach 1
     * ============
     * Reverse the string and check
     *
     * TC: O(N)
     */

    /*
     * Approach 2
     * ============
     * 2-Pointer approach
     *
     * 1) Set 2 pointers, one at each end of the string
     *
     * 2) If the input is a palindrome, then both the pointers should point at
     * equivalent characters if this condition is not met return false
     *
     * 3) We'll ignore special characters while traversing
     *
     * 4) Continue until both the pointers meet
     *
     * TC: O(N)
     * SC: O(1)
     */
    boolean isPalindrome(String str) {
        int i = 0;
        int j = str.length() - 1;

        while (i < j) {

            // To ignore any special characters from start
            while (i < j && !Character.isLetterOrDigit(str.charAt(i))) {
                ++i;
            }

            // To ignore any special characters from end
            while (i < j && !Character.isLetterOrDigit(str.charAt(j))) {
                --j;
            }

            // If value at "i" doesn't match with "j" from end, then return false
            if (Character.toLowerCase(str.charAt(i)) != Character.toLowerCase(str.charAt(j))) {
                return false;
            }

            ++i;
            --j;
        }

        return true;
    }

    // Another way of writing same solution
    boolean isPalindrome2(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");

        int i = 0;
        int j = s.length() - 1;
        while (i <= j) {
            if (s.charAt(i) != s.charAt(j))
                return false;

            ++i;
            --j;
        }

        return true;
    }
}
