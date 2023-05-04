package Leetcode;

import java.util.PriorityQueue;

public class LeetCode649 {
    public String predictPartyVictory(String senate) {
        char[] senators = senate.toCharArray();
        PriorityQueue<Integer> radiants = new PriorityQueue<>();
        PriorityQueue<Integer> dires = new PriorityQueue<>();

        // Initialize the queues with data
        for (int i = 0; i < senators.length; i++) {
            if (senators[i] == 'R') {
                radiants.offer(i);
            } else {
                dires.offer(i);
            }
        }

        // Game simulation
        while (radiants.peek() != null && dires.peek() != null) {
            int direTurn = dires.poll();
            int radiantTurn = radiants.poll();

            if (radiantTurn < direTurn) {
                radiants.offer(radiantTurn + senators.length);
            } else {
                dires.offer(direTurn + senators.length);
            }
        }

        if (radiants.peek() != null) {
            return "Radiant";
        }

        return "Dire";
    }
}
