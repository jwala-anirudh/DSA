package Arrays;

public class TwoSum {

    // Brute force
    static void solution(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println(i + " " + j);
                    return;
                }
            }
        }
    }

    // Optimisation
    static void opSolution(int[] arr, int target) {
    }

    public static void main(String[] args) {
        int[] arr = {11, 3, 7, 9, 14, 2};
        int target = 17;

        solution(arr, target);
        opSolution(arr, target);
    }
}
