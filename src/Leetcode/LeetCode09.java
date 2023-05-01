package Leetcode;

public class LeetCode09 {
    public boolean isPalindrome(int x) {
        String value = String.valueOf(x);

        int i = 0;
        int j = value.length() - 1;

        while (i <= j) {
            if (value.charAt(i) != value.charAt(j)) {
                return false;
            }

            ++i;
            --j;
        }

        return true;
    }
}
