package Leetcode;

public class LeetCode24 {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode() {}
     * ListNode(int val) { this.val = val; }
     * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    public ListNode swapPairs(ListNode head) {
        // Edge case 1: Empty list
        if (head == null) {
            return head;
        }

        // Edge case 2: Single value
        if (head.next == null) {
            return head;
        }

        ListNode temp = new ListNode(0, head);
        ListNode previous = temp;
        ListNode current = head;

        while (current != null && current.next != null) {
            // Save the pointers
            ListNode nextPair = current.next.next;
            ListNode second = current.next;

            // Reverse the pair
            second.next = current;
            current.next = nextPair;
            previous.next = second;

            // Update the pointers
            previous = current;
            current = nextPair;
        }

        return temp.next;
    }
}