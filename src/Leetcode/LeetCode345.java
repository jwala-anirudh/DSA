package Leetcode;

public class LeetCode345 {
    public String reverseVowels(String str) {
        final String vowels = "AEIOUaeiou";
        StringBuilder sb = new StringBuilder(str);

        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            while (
                    start < end &&
                            !vowels.contains("" + sb.charAt(start))
            ) {
                ++start;
            }

            while (
                    start < end &&
                            !vowels.contains("" + sb.charAt(end))
            ) {
                --end;
            }

            // Swap in string build using input string "str"
            sb.setCharAt(start, str.charAt(end));
            sb.setCharAt(end, str.charAt(start));

            ++start;
            --end;
        }

        return sb.toString();
    }

}
