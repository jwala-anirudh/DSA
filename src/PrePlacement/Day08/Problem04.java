package PrePlacement.Day08;

/*
 * Redistribute Characters to Make All Strings Equal
 * =====================================================
 * You are given an array of strings words (0-indexed).
 *
 * In one operation, pick two **distinct** indices i and j, where words[i]
 * is a non-empty string, and move **any** character from words[i] to
 * any position in words[j].
 *
 * Return true if you can make every string in words equal using any
 * number of operations, and false otherwise.
 */
public class Problem04 {
    /*
     * Algorithm
     * =============
     * 1) Create an array of 26 size, to store frequency of each character
     *
     * 2) Iterate over all the words, and calculate the Total frequency of each character
     *
     * 3) Total frequency of each letter % No. of words != 0, for any character
     * then return false
     *
     * Else, return true
     *
     * TC: O(N), N is the sum of length of all strings
     * SC: O(1)
     */
    boolean makeEqual(String[] words) {
        int[] frequency = new int[26];

        for (String word : words) {
            for (int i = 0; i < word.length(); i++) {
                frequency[word.charAt(i) - 'a']++;
            }
        }

        for (int freq : frequency) {
            if (freq % words.length != 0) {
                return false;
            }
        }

        return true;
    }
}
