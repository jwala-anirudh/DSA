package PrePlacement.Day01;

import java.util.PriorityQueue;

/**
 * Given an integer array nums and an integer k,
 * return the k-th largest element in the array.
 * <p>
 * Note that it is the k-th largest element in the sorted
 * order, not the k-th distinct element.
 */
public class Problem05 {
    /*
     * Brute Force
     * ===============
     * 1) Sort the array
     * 2) Return the k-th element from end
     *
     * TC: O(N Log N)
     * SC: O(1)
     */

    /*
     * Optimized
     *
     * Algorithm
     * ==============
     * 1) Create a min heap & add all elements
     * from the array into the heap 1 by 1
     * 2) Heap will store 'k' largest elements at
     * any point
     *
     * Head of the heap will be the answer
     *
     * Time Complexity
     * ======================
     * "K" size heap
     *
     * height of tree = O (log K)
     *
     * For "n" array elements we are building
     * the heap,
     *
     * Total ---> N * O(log K)
     *
     *
     * Space Complexity
     * ==================
     * O(K)
     */
    int findKthLargest(int[] nums, int k) {
        // initialize heap with 'the smallest element first'
        PriorityQueue<Integer> heap = new PriorityQueue<>((n1, n2) -> n1 - n2);

        // Keep 'K' largest elements in the heap
        for (int n : nums) {
            heap.add(n);

            if (heap.size() > k) {
                heap.poll();
            }
        }

        return heap.poll();
    }
}
