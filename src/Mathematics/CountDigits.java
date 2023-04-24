package Mathematics;

public class CountDigits {

    public static int count(int n) {
        int count = 0;

        /* Sol 1
          while (n > 0) {
            ++count;
            n = n / 10;
          }
        */

        // Sol 2
        count = (int) (Math.log10(n) + 1);

        return count;
    }
}
