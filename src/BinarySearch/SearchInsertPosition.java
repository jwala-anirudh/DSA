package BinarySearch;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] arr = {6, 12, 17, 23, 38, 45, 77, 84, 90};
        int searchKey = 12;

        int result = insertPosition(arr, searchKey);
        System.out.println("Value should be present at index " + result);
    }

    private static int insertPosition(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;
        int index = -1;

        while (start <= end) {
            int mid = start + ((end - start) / 2);

            if (key == arr[mid]) {
                return mid;
            } else if (key < arr[mid]) {
                end = mid - 1;
                index = mid;
            } else {
                start = mid + 1;
                index = mid + 1;
            }
        }

        return index;
    }
}
