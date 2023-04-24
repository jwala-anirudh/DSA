package Strings;

import java.util.Scanner;

/**
 * I AM GOOD ----> GOOD AM I
 */
public class ReverseSentence {

    static String reverseBruteForce(String input) {
        // 1. Split at ' ' spaces and obtain the words into array
        String[] inputValues = input.split("\\s+");

        // 2. Reverse the array values
        int start = 0;
        int end = inputValues.length - 1;
        while (start < end) {
            String temp = inputValues[start];
            inputValues[start] = inputValues[end];
            inputValues[end] = temp;

            start++;
            end--;
        }

        // 3. Join the array values at ' ' spaces

        return String.join(" ", inputValues);
    }

    static String reverseOptimized(String input) {
        // 1. Reverse the entire string value input
        // 2. Take two pointers of start, end from beginning
        // 3. Increment end pointer until you find EOL/space, once found
        // 4. Reverse the value starting from 'start' to 'end - 1'
        // 5. Increment end index and also update start with it
        return null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputStr = sc.nextLine();

        System.out.println(reverseBruteForce(inputStr));
        // System.out.println(reverseOptimized(inputStr));

        sc.close();
    }
}