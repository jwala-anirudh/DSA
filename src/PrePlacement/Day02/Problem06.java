package PrePlacement.Day02;

/**
 * There are many situations where we use integer values as index in array to see
 * presence or absence. We can use bit manipulations to optimize space in such
 * problems.
 * <p>
 * Let us consider the below problem as an example.
 * <p>
 * Given two numbers say a and b, mark the multiples of 2 and 5 between a and b
 * and output each of the multiples.
 * <p>
 * Note : We have to mark the multiples i.e save (key, value) pairs in memory such
 * that each key either has a value as 1 or 0 representing a multiple of 2 or 5 or not
 * respectively.
 */
public class Problem06 {
    /*
     * Algorithm
     * ===========
     * 1) Creating an array of size (b-a+1)
     *
     * 2) For each element we are checking if it is
     * divisible by 2 (or) 5
     *      - Mark it as 1
     *      - Else, mark it as 0
     *
     * 3) Return all numbers marked as 1
     *
     * TC: O(b-a)
     */
    static int[] multiples(int a, int b) {
        int size = Math.abs(b - a) + 1;
        int[] arr = new int[size];

        // Iterate through a to b, if it is
        // a multiple of 2 or 5. Mark index
        // in array as 1
        for (int i = a; i <= b; i++) {
            if (i % 2 == 0 || i % 5 == 0) {
                arr[i - a] = 1;
            }
        }

        for (int i = a; i <= b; i++) {
            if (arr[i - a] == 1) {
                System.out.print(i + " ");
            }
        }

        return arr;
    }
}
