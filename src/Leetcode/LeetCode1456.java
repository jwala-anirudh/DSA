package Leetcode;

/**
 * Maximum Number of Vowels in a Substring of Given Length
 * <p>
 * <p>
 * Given a string s and an integer k, return the maximum number of
 * vowel letters in any substring of s with length k.
 * <p>
 * Vowel letters in English are 'a', 'e', 'i', 'o', and 'u'.
 */
public class LeetCode1456 {
    int isAVowel(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return 1;
        }
        return 0;
    }

    public int maxVowels(String s, int k) {
        int maxValue = 0;
        int currentValue = 0;

        for (int i = 0; i < s.length(); i++) {
            // take a new incoming value and add to current value of iteration
            currentValue = currentValue + isAVowel(s.charAt(i));

            // once the window size is reached and iteration goes out
            // s[i - k] value that is present at the starting of last window
            if (i >= k) {
                currentValue = currentValue - isAVowel(s.charAt(i - k));
            }

            maxValue = Math.max(currentValue, maxValue);
        }

        return maxValue;
    }
}
