package PrePlacement.Day09;

public class Problem02 {
    /*
     * TC: O(2^N)
     * SC: O(1)
     */
    int fibOfN(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        return fibOfN(n - 1) + fibOfN(n - 2);
    }
}