package Leetcode;

/*
 * Longest Common Prefix
 * =======================
 *
 * Write a function to find the longest common prefix string amongst
 * an array of strings.
 *
 * If there is no common prefix, return an empty string "".
 */
public class LeetCode14 {
    /*
     * TC: O(N)
     * SC: O(1)
     */
    public String longestCommonPrefix(String[] strs) {
        // Base condition check
        if (strs.length == 0) {
            return "";
        }

        // Considering the first element of the list
        // to be the LCP of the problem
        String prefix = strs[0];

        // Iterate over all other input values
        for (int i = 1; i < strs.length; i++) {

            // For each input value, verify if there is LCP
            while (strs[i].indexOf(prefix) != 0) {

                // Keep eliminating one char from last one-by-one
                prefix = prefix.substring(0, prefix.length() - 1);

                // Prefix is exhausted and nothing is left
                if (prefix.isEmpty()) {
                    return "";
                }
            }

        }

        return prefix;
    }
}
