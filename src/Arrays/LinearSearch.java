package Arrays;

public class LinearSearch {
    static int linearSearch(int[] A, int B) {
        int isFound = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] == B) {
                isFound = 1;
                break;
            }
        }

        return isFound;
    }

    public static void main(String[] args) {
        int[] A = {1, 4, 3, 2};
        System.out.println(linearSearch(A, 2));
    }
}
