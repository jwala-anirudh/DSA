package PrePlacement.Day07;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 * Reverse Words in a String
 * =============================
 *
 * Given an input string s, reverse the order of the words.
 *
 * A word is defined as a sequence of non-space characters. The words
 * in s will be separated by at least one space.
 *
 * Return a string of the words in reverse order concatenated
 * by a single space.
 *
 * Note that s may contain leading or trailing spaces or multiple
 * spaces between two words. The returned string should only have
 * a single space separating the words. Do not include any extra spaces.
 */
public class Problem06 {
    /*
     * Approach 1
     *
     * Algorithm
     * ============
     *
     * 1) Trim the string
     *
     * 2) Split the string with 1 or more spaces
     *
     * 3) Reverse the above list and join by single
     * space
     */
    String reverseWords(String s) {
        // Step 1
        s = s.trim();

        // Step 2
        List<String> words = Arrays.asList(s.split("\\s+"));

        // Step 3
        Collections.reverse(words);

        return String.join(" ", words);
    }
}
