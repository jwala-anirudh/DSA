package Leetcode;

import java.util.HashMap;
import java.util.Map;

/*
 * Longest Substring Without Repeating Characters
 *
 * Given a string s, find the length of the longest
 * substring without repeating characters.
 */
public class LeetCode03 {
    public int lengthOfLongestSubstring(String s) {
        int answer = 0;
        int n = s.length();
        Map<Character, Integer> freq = new HashMap<>();

        // Try to extend the range [i, j]
        for (int j = 0, i = 0; j < n; j++) {
            if (freq.containsKey(s.charAt(j))) {
                i = Math.max(
                        freq.get(s.charAt(j)),
                        i
                );
            }
            answer = Math.max(answer, j - i + 1);
            freq.put(s.charAt(j), j + 1);
        }

        return answer;
    }
}
