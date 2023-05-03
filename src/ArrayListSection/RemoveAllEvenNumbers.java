package ArrayListSection;

import java.util.List;
import java.util.ArrayList;

/**
 * Write an algorithm to remove all the even numbers from the given ArrayList
 */
public class RemoveAllEvenNumbers {
    static void removeAllEvenNumbers(List<Integer> arr) {
        /**
         * Traversing from end?
         *
         * Less expensive operations, and there is no need to shift the elements
         */
        for (int i = arr.size() - 1; i >= 0; i--) {
            if (arr.get(i) % 2 == 0) {
                arr.remove(i);
            }
        }

        for (Integer x : arr) {
            System.out.print(x + " ");
        }
    }

    public static void main(String[] args) {
        List<Integer> input = new ArrayList<>();
        input.add(5);
        input.add(10);
        input.add(4);
        input.add(15);
        input.add(8);
        input.add(21);
        input.add(3);
        input.add(2);

        removeAllEvenNumbers(input);
    }
}
