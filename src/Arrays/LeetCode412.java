package Arrays;

import java.util.List;
import java.util.ArrayList;

public class LeetCode412 {
    public List<String> fizzBuzz(int n) {
        List<String> answer = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            boolean isDivisibleBy3 = i % 3 == 0;
            boolean isDivisibleBy5 = i % 5 == 0;

            if (isDivisibleBy3 && isDivisibleBy5) {
                answer.add("FizzBuzz");
            } else if (isDivisibleBy3) {
                answer.add("Fizz");
            } else if (isDivisibleBy5) {
                answer.add("Buzz");
            } else {
                answer.add(String.valueOf(i));
            }
        }

        return answer;
    }
}
