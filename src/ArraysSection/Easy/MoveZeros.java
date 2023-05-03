package ArraysSection.Easy;

import java.util.ArrayList;
import java.util.List;

public class MoveZeros {
    // brute force
    static void moveZerosBrute(int[] nums, int n) {
        List<Integer> temp = new ArrayList<>();

        // First iteration and keep all non-zeros into it
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                temp.add(nums[i]);
            }
        }

        // Update the original array value with temp
        for (int i = 0; i < temp.size(); i++) {
            nums[i] = temp.get(i);
        }

        // Populate the rest with zeros
        int noOfNonZero = temp.size();
        for (int i = noOfNonZero; i < n; i++) {
            nums[i] = 0;
        }
    }

    // Optimal solution
    static void moveZeros(int[] nums, int n) {
        int j = -1;

        // To check if all are non-zeros
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                // once zero element is encountered
                j = i;
                break;
            }
        }

        // All are non-zero numbers
        if (j == -1) return;

        for (int i = j + 1; i < n; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;

                ++j;
            }
        }

    }

}
