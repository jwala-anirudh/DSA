package Leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Minimum Number of Vertices to Reach All Nodes
 * <p>
 * Given a directed acyclic graph, with n vertices numbered
 * from 0 to n-1, and an array edges where edges[i] = [from-i, to-i]
 * represents a directed edge from node from-i to node toi.
 * <p>
 * Find the smallest set of vertices from which all nodes in the
 * graph are reachable. It's guaranteed that a unique solution exists.
 * <p>
 * Notice that you can return the vertices in any order.
 */
public class LeetCode1557 {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        Set<Integer> incomingDestinations = new HashSet<>();

        for (List<Integer> edge : edges) {
            incomingDestinations.add(edge.get(1));
        }

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (!incomingDestinations.contains(i)) {
                result.add(i);
            }
        }

        return result;
    }
}
