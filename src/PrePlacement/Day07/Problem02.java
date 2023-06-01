package PrePlacement.Day07;

import java.util.HashMap;

/*
 * First unique character
 * =========================
 *
 * Given a string s, find the first non-repeating character
 * in it and return its index. If it does not exist, return -1.
 */
public class Problem02 {
    /*
     * Algorithm
     * ============
     * 1) Go through the string; create a hashmap &
     * save the no. of times each character occurs in
     * the string
     *
     * 2) Iterate over the string, use hashmap to see
     * if the current character at position "i" occurred
     * "1" time or not
     *
     *      If it occurred 1 time, return "i"
     *
     *
     * TC: O(N)
     * SC: O(1), as we can get max of 26 characters
     * to be stored in the hashmap which is constant
     */
    public int firstUniqueChar(String str) {
        HashMap<Character, Integer> frequencyCount = new HashMap<>();
        int n = str.length();

        // Build hash map: character and how often it appears
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            frequencyCount.put(ch, frequencyCount.getOrDefault(ch, 0) + 1);
        }

        // Find the index
        for (int i = 0; i < n; i++) {
            if (frequencyCount.get(str.charAt(i)) == 1) {
                return i;
            }
        }

        return -1;
    }
}