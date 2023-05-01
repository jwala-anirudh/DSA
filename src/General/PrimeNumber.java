package General;

public class PrimeNumber {
    /**
     * @return boolean
     */
    public boolean isPrime(int number) {
        if (number < 2) {
            System.out.println("Not a prime number");
            return false;
        }

        // Since 1, number can divide itself we are looping from (2...n-1)
        for (int i = 2; i <= number - 1; i++) {
            if (number % i == 0) {
                System.out.println("Not a prime number");
                return false;
            }

            System.out.println("Prime number");
        }

        return true;
    }
}
