package LiveClass;

public class Lecture08 {
    static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        for (int i = 2; i <= number - 1; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    static void rotateArray() {
        int[] arr = {2, 3, 7, 1, -11, 8, 13, 12};

        // Rotate array by one value in clock-wise
        int n = arr.length;
        int number = arr[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            arr[i + 1] = arr[i];
        }
        arr[0] = number;

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }

    static int makeProductOne(int[] arr, int N) {
        // Goal is to make the final product of all the values to 1
        // We need to either reduce or increase the numbers such that goal is done
        int countOfZeros = 0;
        int multiplerValue = 1;
        int noOfSteps = 0;

        for (int i = 0; i < N; i++) {
            // Positive numbers make to 1
            if (arr[i] > 0) {
                noOfSteps = noOfSteps + (arr[i] - 1);
                multiplerValue = multiplerValue * 1;
            } else if (arr[i] < 0) {
                // Negative numbers make to -1
                noOfSteps = noOfSteps + (-1 - arr[i]);
                multiplerValue = multiplerValue * -1;
            } else {
                // Value is zero
                ++countOfZeros;
                noOfSteps = noOfSteps + 1;
            }
        }

        // Check the multiple and count
        if (multiplerValue == 1 || countOfZeros > 0) {
            return noOfSteps;
        } else {
            return noOfSteps + 2;
        }
    }
}
