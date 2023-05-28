package PrePlacement.Day02;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * Given an array of intervals where intervals[i] = [starti, endi],
 * merge all overlapping intervals, and return an array
 * of the non-overlapping intervals that cover all the
 * intervals in the input.
 */
public class Problem02 {
    /*
     * Algorithm
     * =============
     * 1) Sort the intervals based on starting
     * element (start time)
     *
     * 2) Insert 1st element into the answer
     *
     * 3) Continue to insert each interval,
     *
     * Check if
     * "start" of newInterval <= end of insertedInterval
     *
     * If it is true,
     *      update end time of last inserted interval
     *      to be the max of end time of both intervals
     *
     * If it is false,
     *      simply insert the interval
     *
     * 4) Return the answer
     *
     *
     * Time Complexity
     * ==================
     * Sorting - O(N log N)
     * Traversing - N
     *
     * Total: O(N log N)
     */
    int[][] merge(int[][] intervals) {
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
