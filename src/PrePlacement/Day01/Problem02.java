package PrePlacement.Day01;

/**
 * You are given an array where prices[i] is the price of a given stock on the i-th day
 * <p>
 * <p>
 * You want to maximize your profit by choosing a single day to buy one stock
 * and choosing a different day in the future to sell that stock
 * <p>
 * <p>
 * Return the maximum profile you can achieve from this
 * transaction. If you cannot achieve any profit return 0.
 */
public class Problem02 {
    /*
     * Approach 1 (Brute force)
     *
     * Pick each value and then keep comparing with other one
     * (n-1) + (n-2) + ... + 1 comparisons ==> O(n^2)
     */

    /*
     * Approach 2 (Graph plotting)
     *
     * Day wise, keep track of
     *  - "min stock value" so far;
     *  - "profit" on that day;
     *  - max profit so far
     *
     *
     *  Algorithm
     *  ============
     *  1) Let max_profit = 0
     *  2) For each position of array, calculate min_value so far
     *      if (min_value > price) of that day
     *          min_value = price ---> giving new min_value that we encountered
     *      else
     *          calculate profit ===> "price" on that day    minus    "min_value"
     *
     *  3) Compute max_profit = max(max_profit, profit)
     *
     *
     *  TC: O(N)
     *  SC: O(1)
     */
    int maxProfit(int prices[]) {
        int minValue = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minValue) {
                minValue = prices[i];
            } else if (prices[i] - minValue > maxProfit) {
                maxProfit = prices[i] - minValue;
            }
        }

        return maxProfit;
    }
}
