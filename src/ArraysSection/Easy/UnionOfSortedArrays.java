package ArraysSection.Easy;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.List;

public class UnionOfSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 1, 2, 3, 4, 5};
        int[] arr2 = {2, 3, 4, 4, 5, 6};

        brute(arr1, arr2);
        optimal(arr1, arr2);
    }

    static void brute(int[] arr1, int[] arr2) {
        Set<Integer> union = new LinkedHashSet<>();

        // Adding first array values
        for (int element : arr1) {
            union.add(element);
        }

        // Adding second array values
        for (int element : arr2) {
            union.add(element);
        }

        for (int unique : union) {
            System.out.print(unique + " ");
        }
    }

    static void optimal(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int i = 0;
        int j = 0;

        List<Integer> result = new ArrayList<>();

        while (i < n1 && j < n2) {
            // Compare the values from both the lists
            if (arr1[i] <= arr2[j]) {
                if (result.size() == 0 || result.get(result.size() - 1) != arr1[i]) {
                    result.add(arr1[i]);
                }
                ++i;
            } else {
                if (result.size() == 0 || result.get(result.size() - 1) != arr2[j]) {
                    result.add(arr2[j]);
                }
                ++j;
            }
        }

        while (j < n2) {
            if (result.size() == 0 || result.get(result.size() - 1) != arr2[j]) {
                result.add(arr2[j]);
            }
            ++j;
        }

        while (i < n1) {
            if (result.size() == 0 || result.get(result.size() - 1) != arr1[i]) {
                result.add(arr1[i]);
            }
            ++i;
        }
    }

}
