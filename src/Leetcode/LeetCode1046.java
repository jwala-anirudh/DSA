package Leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeetCode1046 {
    public int lastStoneWeight(int[] stones) {
        // Operations on array list is easier than array
        // Step 1: Convert array to array list
        List<Integer> stonesArr = new ArrayList<>();
        for (int stone : stones) {
            stonesArr.add(stone);
        }

        // Step 2: Until the array size is 1 (or) 0
        while (true) {
            int n = stonesArr.size();

            if (n == 1 || n == 0) {
                break;
            }

            // Step 3: Sort all values in ascending order
            Collections.sort(stonesArr);

            // Step 4: Grab two heavy stones from the last
            int maxStone1 = stonesArr.get(n - 2);
            int maxStone2 = stonesArr.get(n - 1);

            if (maxStone1 == maxStone2) {
                // Step 5: Large elements after sorting are at the end
                stonesArr.remove(stonesArr.size() - 1);
                stonesArr.remove(stonesArr.size() - 1);
            } else {
                int newValue = maxStone2 - maxStone1;

                stonesArr.remove(stonesArr.size() - 1);
                stonesArr.remove(stonesArr.size() - 1);

                // Step 6: New weight added
                stonesArr.add(newValue);
            }
        }

        // Step 7: Weight of last element left
        if (stonesArr.size() == 1) {
            return stonesArr.get(0);
        }

        // Step 8: Default case to return weight when no stones left
        return 0;
    }
}
