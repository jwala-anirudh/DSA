package PrePlacement.Day01;

import java.util.PriorityQueue;

/**
 * Given an integer array nums and an integer k,
 * return the kth smallest element in the array.
 * <p>
 * Note that it is the kth smallest element
 * in the sorted order, not the kth
 * distinct element.
 */
public class Problem06 {
    static int findKthSmallest(int[] nums, int k) {
        // initialize heap with 'the largest element first'
        PriorityQueue<Integer> heap = new PriorityQueue<>((n1, n2) -> n2 - n1);

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
