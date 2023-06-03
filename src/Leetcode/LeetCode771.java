package Leetcode;

import java.util.HashSet;
import java.util.Set;

/*
 * Jewels and Stones
 * ===================
 *
 * You're given strings jewels representing the types of stones that are jewels,
 * and stones representing the stones you have. Each character in stones is a type
 * of stone you have. You want to know how many of the stones you have are also jewels.
 *
 * Letters are case-sensitive, so "a" is considered a different type of stone from "A".
 */
public class LeetCode771 {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;

        Set<Character> jewellerySet = new HashSet<>();
        char[] jewelleryList = jewels.toCharArray();

        // Prepare the set of jewels
        for (char jewel : jewelleryList) {
            jewellerySet.add(jewel);
        }

        // Iterate over the input stones S
        for (int i = 0; i < stones.length(); i++) {
            if (jewellerySet.contains(stones.charAt(i))) {
                count++;
            }
        }

        return count;
    }
}
