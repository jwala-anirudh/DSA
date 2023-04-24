package Hashing;

public class HashingNumbersBasics {
    /**
     * Limitations:
     * We cannot do this for very large inputs like 10^8, 10^9, etc
     * <p>
     * At max at global level we can declare up to 10^7
     */
    static int[] preCalculate(int[] arr, int size) {
        int[] hashArray = new int[size + 1];

      for (int j : arr) {
        hashArray[j]++;
      }

        return hashArray;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 1, 3};
        int maxValue = 12;

        int[] hashArray = preCalculate(arr, maxValue);

        int[] searchKeys = {1, 4, 2, 3, 12, 100};

      for (int search : searchKeys) {
        if (search <= maxValue) {
          System.out.println(search + " appears " + hashArray[search] + " no of times");
        } else {
          System.out.println("Out of range, try with other key");
        }
      }
    }
}
