package PrePlacement.Day4;

/**
 * Richest Customer Wealth
 */
public class Problem04 {
    public int maximumWealth(int[][] accounts) {
        int richestCustomerWealth = 0;

        for (int[] account : accounts) {
            int customerWealthSum = 0;
            for (int i = 0; i < accounts[0].length; i++) {
                customerWealthSum += account[i];
            }

            richestCustomerWealth = Math.max(customerWealthSum, richestCustomerWealth);
        }
        return richestCustomerWealth;
    }
}
