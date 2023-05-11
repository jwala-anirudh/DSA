package Leetcode;

import java.util.Arrays;

public class LeetCode1035 {
    int m, n;
    int[] n1;
    int[] n2;
    int[][] dp;

    private int dfs(int i, int j) {
        if (i == m || j == n) {
            return 0;
        }

        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        if (n1[i] == n2[j]) {
            dp[i][j] = 1 + dfs(i + 1, j + 1);
        } else {
            dp[i][j] = Math.max(dfs(i + 1, j), dfs(i, j + 1));
        }

        return dp[i][j];
    }

    public int maxUncrossedLines(int[] nums1, int[] nums2) {
        n1 = nums1;
        m = n1.length;

        n2 = nums2;
        n = n2.length;

        dp = new int[m][n];

        for (var row : dp)
            Arrays.fill(row, -1);

        return dfs(0, 0);
    }
}
