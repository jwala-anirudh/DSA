package ArraysSection;

/**
 * Write an algorithm to find the sum of all the elements in an array
 */
public class SumOfArrayElements {
    public static void main(String[] args) {
        int n = 8;
        int[] input = {10, 3, -1, -8, 7, 12, 3, 15};
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += input[i];
        }

        System.out.println("Result :: " + sum);
    }
}
