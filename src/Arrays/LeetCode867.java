package Arrays;

public class LeetCode867 {
    static int[][] transpose(int[][] arr) {
        int[][] result = new int[arr[0].length][arr.length];

        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr[0].length; j++)
                result[j][i] = arr[i][j];

        return result;
    }

    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
        };
        int[][] result = transpose(arr);

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
