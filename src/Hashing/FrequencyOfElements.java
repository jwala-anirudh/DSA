package Hashing;

import java.util.Map;
import java.util.HashMap;

/**
 * Find the highest/lowest frequency element
 */
public class FrequencyOfElements {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 3, 3, 4, 5};
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

        int lowestNumber = -1;
        int lowestFrequency = -1;
        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            int number = entry.getKey();
            int frequency = entry.getValue();

            if (lowestFrequency == -1) {
                lowestNumber = number;
                lowestFrequency = frequency;
            } else {
                if (frequency < lowestFrequency) {
                    lowestNumber = number;
                    lowestFrequency = frequency;
                }
            }
        }
        System.out.println("Lowest frequency element :: " + lowestNumber + " with " + lowestFrequency + " occurences");

        int highestNumber = -1;
        int highestFrequency = -1;
        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            int number = entry.getKey();
            int frequency = entry.getValue();

            if (highestNumber == -1) {
                highestNumber = number;
                highestFrequency = frequency;
            } else {
                if (frequency > highestFrequency) {
                    highestNumber = number;
                    highestFrequency = frequency;
                }
            }
        }
        System.out.println("Highest frequency element :: " + highestNumber + " with " + highestFrequency + " occurences");
    }
}
