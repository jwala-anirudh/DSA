package Leetcode;

public class LeetCode198 {
    public int rob(int[] houses) {
        int highest = 0;
        int closest = 0;

        for (int house: houses) {
            int nextHighest = Math.max(highest, closest + house);
            closest = highest;
            highest = nextHighest;
        }

        return highest;
    }
}
