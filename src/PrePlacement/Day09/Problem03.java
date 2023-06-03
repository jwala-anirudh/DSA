package PrePlacement.Day09;

public class Problem03 {
    /*
     * TC: O(log N base 4)
     * SC: O(1)
     */
    boolean isPowerOfFour(int n) {
        // Base case
        if (n <= 0)
            return false;

        // Because, 4^0 = 1
        if (n == 1)
            return true;

        if (n % 4 == 0)
            return isPowerOfFour(n / 4);
        else
            return false;
    }
}