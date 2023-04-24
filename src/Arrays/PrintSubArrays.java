package Arrays;

// Print all sub-arrays of a given array
// It should be a continuous small part of the main array

// Total no of sub-array of size of N --> NC2 combinations
public class PrintSubArrays {

    // Time complexity: O ( N^3 )
    static void allSubArrays(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {

                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + ", ");
                }
                System.out.println();

            }
        }

    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60};
        int n = arr.length;

        allSubArrays(arr);
    }
}
