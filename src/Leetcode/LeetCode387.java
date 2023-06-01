package Leetcode;

import java.util.HashMap;

public class LeetCode387 {
    public int firstUniqChar(String str) {
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