package ArraysSection.Easy;

public class LargestElement {
    void largestElementOfArr(int[] arr, int n) {
        int largeElement = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            largeElement = Math.max(largeElement, arr[i]);
        }

        System.out.println("Largest Element :: " + largeElement);
    }
}
