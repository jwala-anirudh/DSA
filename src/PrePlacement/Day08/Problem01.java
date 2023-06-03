package PrePlacement.Day08;

import java.util.HashSet;
import java.util.Set;

/*
 * Jewels & Stones
 * =================
 * You're given strings jewels representing the types of stones that
 * are jewels, and stones representing the stones you have. Each character
 * in stones is a type of stone you have. You want to know how many of
 * the stones you have are also jewels.
 *
 * Letters are case-sensitive, so "a" is considered a different type of stone from "A".
 */
public class Problem01 {
    /*
     * Brute force
     * ===============
     * for (char ch : stones) {
     *     for(char c : jewels) {
     *         if (ch == c) {
     *             // output
     *         }
     *     }
     * }
     *
     * TC: O(N * M)
     * where, N -> No. of stones and M -> No. of jewels
     * SC: O(1)
     */

    /*
     * Approach 2
     * ============
     * 1) Create a map for jewels and add all of them into it
     * 2) Iterate over the stones string once, and check if
     * any of the stone value is present in the hash set.
     *
     *     If yes, increment the count
     *
     * TC: O(M + N)
     * SC: O(M)
     * where, N -> No. of stones and M -> No. of jewels
     */
    int numJewelsInStones(String jewels, String stones) {
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
