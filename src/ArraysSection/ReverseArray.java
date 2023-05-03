package ArraysSection;

/**
 * Write an algorithm to reverse an array
 */
public class ReverseArray {
    public static void main(String[] args) {
        int n = 8;
        int[] arr = {5, 10, -1, 14, -7, 21, -3, 1};

        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }

        System.out.print("Result :: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
