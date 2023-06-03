package PrePlacement.Day08;

/*
 * Split a String in Balanced Strings
 * ======================================
 *
 * Balanced strings are those that have an equal quantity
 * of 'L' and 'R' characters.
 *
 * Given a balanced string s, split it into some number
 * of substrings such that:
 *
 * Each substring is balanced.
 *
 * Return the maximum number of balanced strings you
 * can obtain.
 */
public class Problem05 {
    /*
     * TC: O(N)
     * SC: O(1)
     */
    int balancedStringSplit(String s) {
        int result = 0, count = 0;

        for (int i = 0; i < s.length(); i++) {
            count += s.charAt(i) == 'L' ? 1 : -1;

            if (count == 0) {
                // we can split at this location
                ++result;
            }
        }

        return result;
    }
}
