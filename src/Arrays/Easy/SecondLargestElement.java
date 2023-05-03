package Arrays.Easy;

import java.util.Arrays;

public class SecondLargestElement {
    // Brute force approach
    void bruteForce() {
        int[] arr = {1, 2, 4, 7, 7, 5};

        // O(N log N)
        Arrays.sort(arr);

        int n = arr.length;
        int largest = arr[n - 1];
        int secondLargest = -1;

        // O(N)
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] != largest) {
                secondLargest = arr[i];
                break;
            }
        }

        System.out.println("Second largest element :: " + secondLargest);
    }

    // Better approach
    void better() {
        int[] arr = {1, 2, 4, 7, 7, 5};

        int n = arr.length;
        int largest = -1;
        int secondLargest = -1;

        // First pass -> O(N)
        for (int i = 0; i < n; i++) {
            largest = Math.max(arr[i], largest);
        }

        // Second pass -> O(N)
        for (int i = 0; i < n; i++) {
            if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        System.out.println("Second largest element :: " + secondLargest);
    }

    // Optimal solution
    void optimal() {
        int[] arr = {1, 2, 4, 7, 7, 5};

        int n = arr.length;
        int largest = arr[0];
        int secondLargest = Integer.MIN_VALUE;

        // Time -> O(N)
        for (int i = 1; i < n; i++) {
            // When a new largest is found, then set secondLargest to OLD largest value
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] < largest && arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }

        if (secondLargest != Integer.MIN_VALUE) {
            System.out.println("Second largest element :: " + secondLargest);
            return;
        }

        secondLargest = -1;
        System.out.println("Second largest element :: " + secondLargest);
    }
}
