package Arrays;

public class PrintAllPairs {

    // Without duplicates
    static void printPairs(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("(" + arr[i] + ", " + arr[j] + ")");
            }
            System.out.println();
        }
    }

    // All possible with duplicates
    static void printDuplicatePairs(int[] arr) {
        for (int j : arr) {
            for (int k : arr) {
                System.out.print("(" + j + ", " + k + ")");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int n = arr.length;

        printPairs(arr);
        System.out.println("---------------");
        printDuplicatePairs(arr);
    }
}
