package ArraysSection.Easy;

public class LeftRotateByOne {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        leftRotateArrayByOne(arr);
    }

    static void leftRotateArrayByOne(int[] arr) {
        int n = arr.length;
        int temp = arr[0];

        for (int i = 1; i < n; i++) {
            arr[i - 1] = arr[i];
        }
        arr[n - 1] = temp;

        for (int element : arr) {
            System.out.print(element + " ");
        }
    }
}
