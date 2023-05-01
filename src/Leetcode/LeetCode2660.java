package Leetcode;

/**
 * You are given two 0-indexed integer arrays player1 and player2, that represent the
 * number of pins that player 1 and player 2 hit in a bowling game, respectively.
 * <p>
 * The bowling game consists of n turns, and the number of pins in each turn is exactly 10.
 * <p>
 * Assume a player hit xi pins in the ith turn. The value of the ith turn for the player is:
 * <p>
 * 2xi if the player hit 10 pins in any of the previous two turns.
 * Otherwise, It is xi.
 * The score of the player is the sum of the values of their n turns.
 * <p>
 * Return
 * <p>
 * 1 if the score of player 1 is more than the score of player 2,
 * 2 if the score of player 2 is more than the score of player 1, and
 * 0 in case of a draw.
 */
public class LeetCode2660 {
    public int isWinner(int[] player1, int[] player2) {
        int p1 = 1;
        int scoreOfPlayer1 = 0;
        int p2 = 1;
        int scoreOfPlayer2 = 0;

        int noOfRounds = player1.length;

        for (int i = 0; i < noOfRounds; i++) {
            if (i > 0) {
                // Multiplier for player 1
                p1 = player1[i - 1] == 10 ? 2 : 1;
                // Multiplier for player 2
                p2 = player2[i - 1] == 10 ? 2 : 1;

                if (i > 1) {
                    p1 = player1[i - 2] == 10 || player1[i - 1] == 10 ? 2 : 1;
                    p2 = player2[i - 2] == 10 || player2[i - 1] == 10 ? 2 : 1;
                }
            }

            scoreOfPlayer1 += player1[i] * p1;
            scoreOfPlayer2 += player2[i] * p2;
        }

        // Verdict logic
        if (scoreOfPlayer1 > scoreOfPlayer2) {
            // Player 1 is winner
            return 1;
        } else if (scoreOfPlayer2 > scoreOfPlayer1) {
            // Player 2 is winner
            return 2;
        } else {
            // both the scores are same, its a draw
            return 0;
        }
    }
}
