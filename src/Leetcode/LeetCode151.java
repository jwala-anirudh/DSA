package Leetcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 * Reverse Words in a String
 * ============================
 * Given an input string s, reverse the order of the words.
 *
 * A word is defined as a sequence of non-space characters.
 * The words in s will be separated by at least one space.
 *
 * Return a string of the words in reverse order
 * concatenated by a single space.
 *
 * Note that s may contain leading or trailing spaces or
 * multiple spaces between two words. The returned string
 * should only have a single space separating the words.
 * Do not include any extra spaces.
 */
public class LeetCode151 {
    public String reverseWords(String s) {
        s = s.trim();

        List<String> words = Arrays.asList(s.split("\\s+"));

        Collections.reverse(words);

        return String.join(" ", words);
    }
}
