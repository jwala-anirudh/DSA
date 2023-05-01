package Leetcode;

public class LeetCode1672 {

    // Time Complexity: O(N x M)
    // Space Complexity: O(1)
    public int maximumWealth(int[][] accounts) {
        int richestCustomerWealth = 0;

        for (int[] account : accounts) {
            int customerWealthSum = 0;

            // Loop through all bank accounts balance for customer "i"
            for (int j = 0; j < accounts[0].length; j++) {
                customerWealthSum += account[j];
            }

            richestCustomerWealth = Math.max(richestCustomerWealth, customerWealthSum);
        }

        return richestCustomerWealth;
    }
}
