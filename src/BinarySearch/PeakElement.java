package BinarySearch;

public class PeakElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1};

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + ((right - left) / 2);

            if (mid > 0 && arr[mid] < arr[mid - 1]) {
                // Left neighbour greater
                right = mid - 1;
            } else if (mid < arr.length - 1 && arr[mid] < arr[mid + 1]) {
                // Right neighbour greater
                left = mid + 1;
            } else {
                System.out.println(mid);
                return;
            }
        }
    }
}
