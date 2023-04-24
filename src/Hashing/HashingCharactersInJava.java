package Hashing;

import java.util.Map;
import java.util.HashMap;

public class HashingCharactersInJava {
  public static void main(String[] args) {
    char[] arr = { 'a', 'c', 'd', 'e', 'a', 'b' };
    Map<Character, Integer> hashMap = new HashMap<>();

    // Pre calculate
    for (char c : arr) {
      Integer value = hashMap.get(c);
      if (value == null) {
        hashMap.put(c, 1);
      } else {
        hashMap.put(c, value + 1);
      }
    }

    // Print the values to see hash map (un-ordered)
    // for (Map.Entry<Character, Integer> entry : hashMap.entrySet()) {
    // System.out.println(entry.getKey() + ": " + entry.getValue());
    // }

    // Fetch
    char[] searchKeys = { 'a', 'c', 'z', 'i' };
    for (char search : searchKeys) {
      Integer noOfOccurrences = hashMap.get(search);

      if (noOfOccurrences != null) {
        System.out.println(search + " is present " + hashMap.get(search) + " times");
      } else {
        System.out.println(search + " is present 0 times");
      }
    }
  }
}
