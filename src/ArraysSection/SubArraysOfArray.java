package ArraysSection;

/**
 * Write an algorithm to print all the sub-arrays of an array
 * <p>
 * sub-arrays: A sub-array is a contiguous part of array
 */
public class SubArraysOfArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                // Using "i" as start index & "j" as end index loop over arr
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }

    }
}
