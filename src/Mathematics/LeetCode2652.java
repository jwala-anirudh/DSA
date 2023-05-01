package Mathematics;

public class LeetCode2652 {
    public int sumOfMultiples(int n) {
        int sumOfAllMultiples = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
                sumOfAllMultiples += i;
            }
        }

        return sumOfAllMultiples;
    }
}
