package Recursion;

import java.util.Scanner;

public class PalindromeString {

    // Time complexity: O(N / 2)
    // ---> as we are running for half-length
    static boolean checkIsPalindrome(String str, int index) {
        int n = str.length();

        // Means string was checked for one side
        if (index >= n / 2) {
            return true;
        }

        if (str.charAt(index) != str.charAt(n - index - 1)) {
            return false;
        }

        return checkIsPalindrome(str, index + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string to check for palindrome :: ");
        String inputText = sc.nextLine();
        boolean result = checkIsPalindrome(inputText, 0);

        if (result) {
            System.out.println("String is palindrome");
        } else {
            System.out.println("Not a palindrome");
        }

        sc.close();
    }
}
