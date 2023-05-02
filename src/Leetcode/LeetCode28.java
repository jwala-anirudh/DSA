package Leetcode;

public class LeetCode28 {
    public int strStrBruteForce(String haystack, String needle) {
        if (haystack.contains(needle))
            return haystack.indexOf(needle);
        return -1;
    }

    public int strStr(String haystack, String needle) {
        int j = 0;
        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(j)) {
                j++;
            } else {
                i = i - j;
                j = 0;
            }

            if (j == needle.length()) {
                return i - needle.length() + 1;
            }
        }
        return -1;
    }
}
