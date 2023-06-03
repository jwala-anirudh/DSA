package PrePlacement.Day08;

/*
 * Valid Anagrams
 * ================
 *
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise*.
 *
 * An Anagram is a word or phrase formed by rearranging the letters of a
 * different word or phrase, typically using all the original letters exactly once.
 */
public class Problem02 {
    /*
     * Approach 1
     * =============
     * 1) Sort both the input strings
     * 2) Check they are equal or not in two-pointer
     *
     * TC: O(N log N)
     * SC: O(1)
     */

    /*
     * Approach 2
     * =============
     * 1) We can count occurrences of each letter in 2 strings
     * We'll maintain an array of size 26
     *
     * 2) For each character in S1, we will increment its array
     * value index to (key+1) and for each character in S2 we
     * have to decrement its value by 1
     *
     * 3) At the end we check if all values in the array are
     * zeros then it is a valid anagram.
     *
     * TC: O(N)
     * SC: O(1)
     */
    boolean isAnagram(String s, String t) {
        // Base condition
        if (s.length() != t.length()) {
            return false;
        }

        // To covert all strings to lower case (just in case)
        // Can skip as given in constraints that all are lowercase

        int[] characterFreq = new int[26];

        for (int i = 0; i < s.length(); i++) {
            // Increment for first string
            characterFreq[s.charAt(i) - 'a']++;

            // Decrement for second string
            characterFreq[t.charAt(i) - 'a']--;
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
