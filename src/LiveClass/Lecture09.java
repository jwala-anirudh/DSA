package LiveClass;

public class Lecture09 {
    public static void main(String[] args) {
        // nested for-loops
        int[] arr = {2, 3, 8, 7, 4};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                System.out.print(arr[j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        // nested for-loop with a pattern
        int[] arr2 = {3, 13, 12, 7, 4};
        for (int i = 0; i < arr2.length; i++) {
            for (int j = i; j < arr2.length; j++) {
                System.out.print(arr2[j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        // nested for-loop: print array in reverse
        int[] arr3 = {3, 11, 13, 8, 4};
        for (int i = 0; i < arr3.length; i++) {
            for (int j = arr3.length - 1; j >= 0; j--) {
                System.out.print(arr3[j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        // nested for-loop: print array in reverse with reducing manner
        int[] arr4 = {2, 3, 8, 7, 4};
        for (int i = 0; i < arr4.length; i++) {
            for (int j = arr4.length - 1; j >= i; j--) {
                System.out.print(arr4[j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        // Find duplicates in an array
        int[] arr5 = {2, 3, 1, 2, 3};
        int[] count = new int[arr5.length];
        for (int i = 0; i < arr5.length; i++) {
            count[arr5[i]]++;
        }
        for (int i = 0; i < count.length; i++) {
            if (count[i] > 1) {
                System.out.println(i);
            }
        }

        System.out.println();

        // sort values by (0, 1, 2)
        int[] arr6 = {2, 1, 0, 1, 0};
        int countZeros = 0;
        int countOnes = 0;
        int countTwos = 0;

        for (int i = 0; i < arr6.length; i++) {
            if (arr6[i] == 0) {
                countZeros++;
            } else if (arr6[i] == 1) {
                countOnes++;
            } else if (arr6[i] == 2) {
                countTwos++;
            }
        }

        for (int i = 0; i < countZeros; i++) {
            arr6[i] = 0;
        }
        for (int i = countZeros; i < countZeros + countOnes; i++) {
            arr6[i] = 1;
        }
        for (int i = countZeros + countOnes; i < countZeros + countOnes + countTwos; i++) {
            arr6[i] = 2;
        }
        for (int i = 0; i < arr6.length; i++) {
            System.out.print(arr6[i] + " ");
        }
    }
}
