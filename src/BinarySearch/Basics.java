package BinarySearch;

public class Basics {
    public static void main(String[] args) {
        int[] arr = {6, 12, 17, 23, 38, 45, 77, 84, 90};
        int searchKey = 84;

        int result = binarySearch(arr, searchKey);

        if (result != -1) {
            System.out.println("The value is present at index :: " + result);
        } else {
            System.out.println("Value is not present");
        }
    }

    private static int binarySearch(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + ((end - start) / 2);

            if (key == arr[mid]) {
                return mid;
            } else if (key < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }
}
