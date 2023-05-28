package Leetcode;

import java.util.Arrays;
import java.util.LinkedList;

public class LeetCode56 {
    public int[][] merge(int[][] intervals) {
        // Sort the intervals based on starting element (start time)
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        LinkedList<int[]> result = new LinkedList<>();

        for (int[] interval : intervals) {
            // if the list of merged intervals in empty (or)
            // if the current interval doesn't overlap with previous
            // simply append to the result
            if (result.isEmpty() || result.getLast()[1] < interval[0]) {
                result.add(interval);
            } else {
                // otherwise, there is overlap, so we merge
                // the current and previous intervals
                result.getLast()[1] = Math.max(result.getLast()[1], interval[1]);
            }
        }

        return result.toArray(new int[result.size()][]);
    }

}
