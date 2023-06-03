package Leetcode;

/*
 * Valid Anagram
 * ===============
 *
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 *
 * An Anagram is a word or phrase formed by rearranging the letters of a different
 * word or phrase, typically using all the original letters exactly once.
 */
public class LeetCode242 {
    public boolean isAnagram(String s, String t) {
        // Base condition
        if (s.length() != t.length()) {
            return false;
        }

        int[] characterFreq = new int[26];

        // Increment for first string
        for (int i = 0; i < s.length(); i++) {
            int charIndex = s.charAt(i) - 'a';

            characterFreq[charIndex]++;
        }

        // Decrement for second string
        for (int i = 0; i < t.length(); i++) {
            int charIndex = t.charAt(i) - 'a';

            characterFreq[charIndex]--;
        }

        // Check for all zeros
        for (int freq : characterFreq) {
            if (freq != 0) {
                return false;
            }
        }

        return true;
    }
}
