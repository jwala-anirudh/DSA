package Leetcode;

/**
 * Maximum Twin Sum of a Linked List
 * <p>
 * <p>
 * In a linked list of size n, where n is even, the ith node (0-indexed)
 * of the linked list is known as the twin of the (n-1-i)th node,
 * if 0 <= i <= (n / 2) - 1.
 * <p>
 * For example, if n = 4, then node 0 is the twin of node 3, and node 1
 * is the twin of node 2. These are the only nodes with twins for n = 4.
 * <p>
 * The twin sum is defined as the sum of a node and its twin.
 * <p>
 * Given the head of a linked list with even length, return the maximum
 * twin sum of the linked list.
 */
public class LeetCode2130 {
    public int pairSum(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        ListNode previous = null;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;

            ListNode temp = slow.next;
            slow.next = previous;
            previous = slow;
            slow = temp;
        }

        int result = 0;

        while (slow != null) {
            result = Math.max(result, previous.val + slow.val);
            previous = previous.next;
            slow = slow.next;
        }

        return result;
    }

}
