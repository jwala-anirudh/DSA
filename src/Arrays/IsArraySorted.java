package Arrays;

public class IsArraySorted {
    boolean arraySortedOrNot(int[] arr, int n) {
        for (int i = 1; i < n; i++) {
            if (arr[i] >= arr[i - 1]) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }
}
