package Arrays;

// Reverse all the elements of the array
public class ReverseAnArray {

    // Time complexity: O ( N )
    // No of iterations would be ====> N / 2
    static void reverseArray(int[] arr, int n) {
        int start = 0;
        int end = n - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 45, 60, 80, 90};
        int n = arr.length;

        reverseArray(arr, n);

        System.out.println("Output :: ");
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
