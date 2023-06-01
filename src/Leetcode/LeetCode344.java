package Leetcode;

/*
 * Reverse String
 *
 * Write a function that reverses a string. The input string is given
 * as an array of characters s.
 *
 * You must do this by modifying the input array in-place with O(1) extra memory.
 */
public class LeetCode344 {
    public void reverseString(char[] s) {
        int n = s.length;
        int i = 0;
        int j = n - 1;

        while (i < j) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;

            i++;
            j--;
        }
    }
}
