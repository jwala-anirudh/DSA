package Leetcode;

/*
 * Length of Last Word
 * ======================
 * Given a string s consisting of words and spaces, return the length of the last word in the string.
 *
 * A word is a maximal substring consisting of non-space characters only.
 */
public class LeetCode58 {
    /*
     * Algorithm
     * ============
     * 1) Remove the trailing spaces
     *
     * 2) Start from the last character & keep on
     * incrementing the length till we find a space
     *
     * 3) Return the length
     *
     * TC: O(N)
     * SC: O(1)
     */
    int lengthOfLastWord(String str) {
        int result = 0;
        int index = str.length() - 1;

        // Remove the trailing spaces
        while (index >= 0 && str.charAt(index) == ' ') {
            --index;
        }

        // Counting the length of the last word
        while (index >= 0 && str.charAt(index) != ' ') {
            ++result;
            --index;
        }

        return result;
    }
}
