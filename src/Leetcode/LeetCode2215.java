package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode2215 {
    static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> answer = new ArrayList<>();
        List<Integer> distinctOne = new ArrayList<>();
        List<Integer> distinctTwo = new ArrayList<>();

        for (int value1 : nums1) {
            boolean shouldAdd = true;
            for (int value2 : nums2) {
                if (value1 == value2) {
                    shouldAdd = false;
                    break;
                }
            }
            if (shouldAdd && !distinctOne.contains(value1)) {
                distinctOne.add(value1);
            }
        }

        for (int value2 : nums2) {
            boolean shouldAdd = true;
            for (int value1 : nums1) {
                if (value2 == value1) {
                    shouldAdd = false;
                    break;
                }
            }
            if (shouldAdd && !distinctTwo.contains(value2)) {
                distinctTwo.add(value2);
            }
        }

        /*
         * This may not be required
         *
         * distinctOne = distinctOne.stream().distinct().toList();
         * distinctTwo = distinctTwo.stream().distinct().toList();
         * */

        answer.add(distinctOne);
        answer.add(distinctTwo);

        return answer;
    }
}
