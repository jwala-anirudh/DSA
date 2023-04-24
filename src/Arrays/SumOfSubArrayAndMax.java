package Arrays;

// Print the sum of each sub-array & find out the largest sum

public class SumOfSubArrayAndMax {
    // Brute Force, Time Complexity: O (N ^ 3)
    static void sumOfAllSubArrays01(int[] arr, int n) {
        int maxSum = -1;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {

                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                    System.out.print(arr[k] + " ");
                }
                System.out.println(" ----- Sum :: " + sum);

                if (sum > maxSum) {
                    maxSum = sum;
                }

            }
        }

        System.out.println("Max Sum :: " + maxSum);
    }

    // Prefix sum, Time Complexity: O (N ^ 2)
    static void sumOfAllSubArrays02(int[] arr, int n) {
        // Compute prefix-sums
        int[] prefix = new int[n];
        prefix[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        int maxSum = -1;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {

                int sum = i > 0 ? prefix[j] - prefix[i - 1] : prefix[j];
                System.out.println("Sum :: " + sum);

                if (sum > maxSum) {
                    maxSum = sum;
                }

            }
        }

        System.out.println("Max Sum :: " + maxSum);
    }

    // Kadane's Algorithm, Time Complexity: O (N)
    static void sumOfAllSubArrays03(int[] arr, int n) {
        int currentSum = 0;
        int largestSum = 0;

        for (int i = 0; i < n; i++) {
            currentSum = currentSum + arr[i];
            if (currentSum < 0) {
                currentSum = 0;
            }

            largestSum = Math.max(largestSum, currentSum);
        }

        System.out.println("Max Sum :: " + largestSum);
    }

    public static void main(String[] args) {
        int[] arr = {-2, 3, 4, -1, 5, -12, 6, 1, 3};
        int n = arr.length;

        sumOfAllSubArrays01(arr, n);
        sumOfAllSubArrays02(arr, n);
        sumOfAllSubArrays03(arr, n);

    }
}
