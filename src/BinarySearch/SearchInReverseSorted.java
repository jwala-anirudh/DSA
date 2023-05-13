package BinarySearch;

public class SearchInReverseSorted {
    public static void main(String[] args) {
        int[] arr = {90, 84, 77, 45, 38, 23, 17, 12, 6};
        int searchKey = 84;

        int result = binarySearch(arr, searchKey);

        if (result != -1) {
            System.out.println("The value is present at index :: " + result);
        } else {
            System.out.println("Value is not present");
        }
    }

    // Array is in sorted BUT reverse
    private static int binarySearch(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + ((end - start) / 2);

            if (key == arr[mid]) {
                return mid;
            } else if (key < arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }
}
