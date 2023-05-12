package Leetcode;

import java.util.Arrays;

/**
 * Solving Questions With Brainpower
 * <p>
 * You are given a 0-indexed 2D integer array questions
 * where questions[i] = [points i, brainpower i].
 * <p>
 * The array describes the questions of an exam, where you have to
 * process the questions in order (i.e., starting from question 0)
 * and make a decision whether to solve or skip each question.
 * <p>
 * Solving question i will earn you points i points but you will
 * be unable to solve each of the next brainpower i questions.
 * If you skip question i, you get to make the decision on the next question.
 * <p>
 * For example, given questions = [[3, 2], [4, 3], [4, 4], [2, 5]]:
 * If question 0 is solved, you will earn 3 points but you will
 * be unable to solve questions 1 and 2.
 * If instead, question 0 is skipped and question 1 is solved,
 * you will earn 4 points but you will be unable to solve questions 2 and 3.
 * Return the maximum points you can earn for the exam.
 */
public class LeetCode2140 {
    private long dfs(int[][] q, long[] dp, int i, int n) {
        if (i >= n) {
            return 0;
        }

        if (i == n - 1) {
            return q[i][0];
        }

        if (dp[i] != -1) {
            return dp[i];
        }

        // Param 1 :: skip question
        // Param 2 :: solve current question
        dp[i] = Math.max(
                dfs(q, dp, i + 1, n),
                q[i][0] + dfs(q, dp, i + 1 + q[i][1], n)
        );

        return dp[i];
    }

    public long mostPoints(int[][] questions) {
        int n = questions.length;
        long[] dp = new long[n + 1];
        Arrays.fill(dp, -1);

        long result = 0;

        result = Math.max(result, dfs(questions, dp, 0, n));

        return result;
    }
}
