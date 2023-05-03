package ArraysSection;

/**
 * Transpose of a matrix
 * <p>
 * You have a square 2d matrix. Return the transpose of the given matrix.
 * <p>
 * transpose: Convert all the columns into rows
 */
public class TransposeOfMatrix {
    /**
     * Travel on the lower triangle of the matrix
     * Ignoring the diagonal values
     * <p>
     * Swap the (i, j) <===> (j, i)
     * <p>
     * Also, row "i" value should be strictly greater than column "j" value
     */
    static void transposeOfMatrix(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16},
        };
        transposeOfMatrix(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
