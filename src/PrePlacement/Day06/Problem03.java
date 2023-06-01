package PrePlacement.Day06;

public class Problem03 {
    /*
     * Algorithm
     * ============
     * We can do this in place. In each row, the ith value
     * from the left is equal to the inverse of the
     * ith value from the right.
     *
     * We use (C+1) / 2 (with floor division) to iterate
     * over all indexes i in the first half
     * of the row, including the center.
     *
     * TC: O(N), where N -> Total no of elements in matrix
     * SC: O(1)
     */
    int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;

        for (int[] row : image) {
            for (int i = 0; i * 2 < n; i++) {
                if (row[i] == row[n - i - 1]) {
                    // XOR: row[i] = row[n - i - 1] ^= 1;
                    int temp = 1 - row[i];
                    row[i] = 1 - row[n - i - 1];
                    row[n - i - 1] = temp;
                }
            }
        }

        return image;
    }
}
