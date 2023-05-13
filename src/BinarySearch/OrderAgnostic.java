package BinarySearch;

public class OrderAgnostic {
    public static void main(String[] args) {
        int[] arr1 = {90, 84, 77, 45, 38, 23, 17, 12, 6};
        int searchKey1 = 84;

        int result1 = binarySearch(arr1, searchKey1);

        if (result1 != -1) {
            System.out.println("The value is present at index :: " + result1);
        } else {
            System.out.println("Value is not present");
        }

        int[] arr2 = {6, 12, 17, 23, 38, 45, 77, 84, 90};
        int searchKey2 = 84;

        int result2 = binarySearch(arr2, searchKey2);

        if (result2 != -1) {
            System.out.println("The value is present at index :: " + result2);
        } else {
            System.out.println("Value is not present");
        }
    }

    // Array's sorted order is unknown
    private static int binarySearch(int[] arr, int key) {

        // Array has single element
        if (arr.length == 1) {
            if (arr[0] == key) {
                return 0;
            }
            return -1;
        }

        // Array has more than one element
        int start = 0;
        int end = arr.length - 1;
        boolean isAscending = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + ((end - start) / 2);

            if (key == arr[mid]) {
                return mid;
            } else if (key < arr[mid]) {

                if (isAscending)
                    end = mid - 1;
                else
                    start = mid + 1;

            } else {

                if (isAscending)
                    start = mid + 1;
                else
                    end = mid - 1;

            }
        }

        return -1;
    }
}
