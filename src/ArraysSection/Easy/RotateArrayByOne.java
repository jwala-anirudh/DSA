package ArraysSection.Easy;

public class RotateArrayByOne {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        leftRotateByOne(arr);
        rightRotateByOne(arr);
    }

    static void leftRotateByOne(int[] arr) {
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

    static void rightRotateByOne(int[] arr) {
        int n = arr.length;
        int temp = arr[n - 1];

        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = temp;

        for (int element : arr) {
            System.out.print(element + " ");
        }
    }
}
