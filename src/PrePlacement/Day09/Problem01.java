package PrePlacement.Day09;

public class Problem01 {
    int sumOf(int n) {
        if (n == 1) {
            return 1;
        }

        return n + sumOf(n - 1);
    }
}
