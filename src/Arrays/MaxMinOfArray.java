package Arrays;

public class MaxMinOfArray {
    static int solve(int[] A) {
        int minValue = Integer.MAX_VALUE;
        int maxValue = Integer.MIN_VALUE;

        for (int i = 0; i < A.length; i++) {
            if (A[i] < minValue) {
                minValue = A[i];
            }

            if (A[i] > maxValue) {
                maxValue = A[i];
            }
        }

        return minValue + maxValue;
    }

    public static void main(String[] args) {
        int[] A = {1, 3, 4, 1};
        System.out.println(solve(A));
    }
}
