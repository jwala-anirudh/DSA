package PrePlacement.Day07;

/*
 * Reverse a string
 * ===================
 * Write a function that reverses a string. The input string is given as an array of characters s.
 *
 * You must do this by modifying the input array in-place with O(1) extra memory.
 */
public class Problem01 {
    /*
     * Approach 1
     * ==============
     * Use inbuilt method to reverse the string value
     *
     * StringBuilder s1 = new StringBuilder("Anirudh");
     * s1.reverse();
     */

    /*
     * Approach 2
     * ==============
     * 2 Pointer approach to start from left, right pointers
     */
    void reverseString(String str) {
        char[] strVals = str.toCharArray();
        int low = 0;
        int high = str.length() - 1;

        while (low < high) {
            char temp = strVals[low];
            strVals[low] = strVals[high];
            strVals[high] = temp;

            ++low;
            --high;
        }
    }
}
