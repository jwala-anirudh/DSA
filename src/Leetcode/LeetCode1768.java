package Leetcode;

/**
 * You are given two strings word1 and word2.
 * Merge the strings by adding letters in alternating order,
 * starting with word1. If a string is longer than the other,
 * append the additional letters onto the end of the merged string.
 * <p>
 * Return the merged string.
 * <p>
 * Input: word1 = "abc", word2 = "pqr"
 * Output: "apbqcr"
 * Explanation: The merged string will be merged as so:
 * word1:  a   b   c
 * word2:    p   q   r
 * merged: a p b q c r
 */
public class LeetCode1768 {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();

        int i = 0;
        int j = 0;
        char[] word1Arr = word1.toCharArray();
        char[] word2Arr = word2.toCharArray();

        while (i < word1Arr.length && j < word2Arr.length) {
            result.append(word1Arr[i]);
            result.append(word2Arr[j]);

            ++i;
            ++j;
        }

        while (i < word1Arr.length) {
            result.append(word1Arr[i]);
            ++i;
        }

        while (j < word2Arr.length) {
            result.append(word2Arr[j]);
            ++j;
        }

        return result.toString();
    }
}
