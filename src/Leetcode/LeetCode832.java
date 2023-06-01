package Leetcode;

// Flipping an Image
public class LeetCode832 {
    /*
     * Given an n x n binary matrix image, flip the image
     * horizontally, then invert it, and return the resulting image.
     *
     * To flip an image horizontally means that each
     * row of the image is reversed.
     *
     * For example, flipping [1,1,0] horizontally results in [0,1,1].
     * To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.
     *
     * For example, inverting [0,1,1] results in [1,0,0].
     */
    public int[][] flipAndInvertImage(int[][] image) {
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
