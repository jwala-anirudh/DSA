package Leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Top K Frequent Elements
 * <p>
 * Given an integer array nums and an integer k,
 * return the k most frequent elements. You may return the answer in any order.
 */
public class LeetCode347 {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> countMap = new HashMap<>();
        List<Integer>[] freq = new List[nums.length + 1];
        List<Integer> result = new ArrayList<>();

        for (int n : nums) {
            countMap.put(n, countMap.getOrDefault(n, 0) + 1);
        }

        for (int count : countMap.keySet()) {
            int key = countMap.get(count);
            // if values are not added before
            if (freq[key] == null) {
                freq[key] = new ArrayList<>();
            }
            // add to existing list
            freq[key].add(count);
        }

        for (int i = freq.length - 1; i >= 0 && result.size() < k; i--) {
            if (freq[i] != null) {
                result.addAll(freq[i]);
            }
        }

        return result.stream().mapToInt(i -> i).toArray();
    }
}
