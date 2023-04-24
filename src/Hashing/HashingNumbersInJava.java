package Hashing;

import java.util.Map;
import java.util.HashMap;

/**
 * java.util.HashMap is unordered; you can't and shouldn't assume anything
 * beyond that.
 * <p>
 * This class makes no guarantees as to the order of the map; in particular, it
 * does not guarantee that the order will remain constant over time.
 * <p>
 * java.util.LinkedHashMap uses insertion-order.
 * <p>
 * This implementation differs from HashMap in that it maintains a doubly-linked
 * list running through all of its entries. This linked list defines the
 * iteration ordering, which is normally the order in which keys were inserted
 * into the map (insertion-order).
 * <p>
 * java.util.TreeMap, a SortedMap, uses either natural or custom ordering of the
 * keys.
 * <p>
 * The map is sorted according to the natural ordering of its keys, or by a
 * Comparator provided at map creation time, depending on which constructor is
 * used.
 */

public class HashingNumbersInJava {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 1, 3};
        Map<Integer, Integer> hashMap = new HashMap<>();

        // Pre calculate
        for (int j : arr) {
            Integer value = hashMap.get(j);
            if (value == null) {
                hashMap.put(j, 1);
            } else {
                hashMap.put(j, value + 1);
            }
        }

        // Print the values to see hash map (un-ordered)
        // for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
        // System.out.println(entry.getKey() + ": " + entry.getValue());
        // }

        // Fetch
        int[] searchKeys = {1, 4, 2, 3, 12, 100};
        for (int search : searchKeys) {
            Integer noOfOccurrences = hashMap.get(search);

            if (noOfOccurrences != null) {
                System.out.println(search + " is present " + hashMap.get(search) + " times");
            } else {
                System.out.println(search + " is present 0 times");
            }
        }
    }
}
