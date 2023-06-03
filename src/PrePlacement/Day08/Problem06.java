package PrePlacement.Day08;

// Reverse vowels of a string
public class Problem06 {
    /*
     * Algorithm
     * ===============
     * 1) Maintain 2 pointers
     *      left = 0
     *      right = n - 1, at the end of string
     *
     * 2) Keep incrementing left-pointer till it points
     * to a vowel
     *
     * 3) Keep decrementing right pointer till it points
     * to a vowel
     *
     * 4) Swap values at left & right
     *
     * 5) Increment left, decrement right
     *
     * 6) Return the string value
     *
     * TC: O(N)
     * SC: O(1)
     */
    private boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i'
                || ch == 'o' || ch == 'u' || ch == 'A'
                || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }

    private void swap(char[] values, int left, int right) {
        char temp = values[left];
        values[left] = values[right];
        values[right] = temp;
    }

    String reverseVowels(String s) {
        int left = 0;
        int right = s.length() - 1;

        char[] values = s.toCharArray();

        while (left < right) {
            // find the leftmost vowel
            while (left < s.length() && !isVowel(values[left])) {
                ++left;
            }

            // find the rightmost vowel
            while (right >= 0 && !isVowel(values[right])) {
                --right;
            }

            // swap them
            if (left < right) {
                swap(values, left, right);
                ++left;
                --right;
            }
        }

        return new String(values);
    }
}
