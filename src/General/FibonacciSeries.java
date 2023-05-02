package General;

public class FibonacciSeries {
    /*
     * Starts with 0, 1
     *
     * [0, 1, 1, 2, 3, 5, 8, 13, 21, 34...]
     *
     * In this series, value of n is,
     * n = (n - 1) + (n - 2)
     */
    static void fibonacci(int number) {
        int first = 0;
        int second = 1;
        int current = 0;

        /*
        int third = first + second;
        int fourth = second + third;
        int fifth = third + fourth;
        .... in this way it will go on increasing
        */

        if (number <= 0) {
            return;
        }

        if (number == 1) {
            System.out.println("N-th value of fibonacci :: " + first);
            return;
        }

        if (number == 2) {
            System.out.println("N-th value of fibonacci :: " + second);
            return;
        }

        for (int i = 3; i <= number; i++) {
            current = first + second;
            first = second;
            second = current;
        }
        System.out.println("N-th value of fibonacci :: " + current);
    }

    public static void main(String[] args) {
        fibonacci(-2);
        fibonacci(0);

        // One-based Indexing
        fibonacci(1);
        fibonacci(2);
        fibonacci(3);
        fibonacci(4);
        fibonacci(5);
        fibonacci(6);
    }

}
