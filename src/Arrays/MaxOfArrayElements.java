package Arrays;

/**
 * Write an algorithm to find the max in the array
 */
public class MaxOfArrayElements {
    public static void main(String[] args) {
        int n = 8;
        int[] input = {5, 10, -1, 14, -7, 21, -3, 1};
        int maxElement = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (input[i] > maxElement) {
                maxElement = input[i];
            }
        }

        System.out.println("Result :: " + maxElement);
    }
}
