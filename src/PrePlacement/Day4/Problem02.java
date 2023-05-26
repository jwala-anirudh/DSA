package PrePlacement.Day4;

/**
 * Diagonal matrix sum
 */
public class Problem02 {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };
        int n = arr.length;
        int answer = 0;

        for (int i = 0; i < n; i++) {
            answer += arr[i][i];
            answer += arr[i][n - 1 - i];
        }

        // To remove the duplicate sum in case of an "odd" order matrix
        if (n % 2 == 1) {
            answer -= arr[n/2][n/2];
        }

        System.out.println("Answer :: " + answer);
    }
}
