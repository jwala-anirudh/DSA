package PrePlacement.Day10;

/*
 * GCD of two numbers
 * ====================
 * Using euclidean algorithm
 *
 * Link: https://practice.geeksforgeeks.org/problems/gcd-of-two-numbers3459/1
 */
public class Problem02 {
    /*
     * TC: O( log( min(A,B) base 2 )
     * SC: O( log( min(A,B) base 2 )
     */
    int gcd(int A, int B) {
        if (B == 0) {
            return A;
        }

        return gcd(B, A % B);
    }
}
