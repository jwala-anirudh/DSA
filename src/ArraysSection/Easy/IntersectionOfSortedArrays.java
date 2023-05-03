package ArraysSection.Easy;

import java.util.ArrayList;
import java.util.List;

public class IntersectionOfSortedArrays {
    static void bruteForce(int[] arr1, int[] arr2) {
        int[] visited = new int[arr2.length];

        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j] && visited[j] == 0) {
                    answer.add(arr1[i]);
                    visited[j] = 1;
                    break;
                }

                if (arr2[j] > arr1[i]) {
                    break;
                }
            }
        }
    }

    static void optimal(int[] arr1, int[] arr2) {
        int i = 0;
        int j = 0;

        List<Integer> answer = new ArrayList<>();

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                ++i;
            } else if (arr2[j] < arr1[i]) {
                ++j;
            } else {
                answer.add(arr1[i]);
                ++i;
                ++j;
            }
        }
    }
}
