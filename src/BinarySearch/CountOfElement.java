package BinarySearch;

public class CountOfElement {
    public static void main(String[] args) {
        int[] arr = {6, 12, 23, 23, 23, 23, 77, 84, 90};
        int searchKey = 23;

        int firstOccurrence = leftMostIndex(arr, searchKey);
        int lastOccurrence = rightMostIndex(arr, searchKey);

        System.out.println("Count of " + searchKey + " in array is : " + (lastOccurrence - firstOccurrence + 1));
    }

    private static int leftMostIndex(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;
        int result = -1;

        while (start <= end) {
            int mid = start + ((end - start) / 2);

            if (key == arr[mid]) {
                result = mid;
                end = mid - 1;
            } else if (key < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return result;
    }

    private static int rightMostIndex(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;
        int result = -1;

        while (start <= end) {
            int mid = start + ((end - start) / 2);

            if (key == arr[mid]) {
                result = mid;
                start = mid + 1;
            } else if (key < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return result;
    }
}
