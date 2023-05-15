package Leetcode;

/*
 * Definition for singly-linked list.
 */
class LListNode {
    int val;
    LListNode next;

    LListNode() {
    }

    LListNode(int val) {
        this.val = val;
    }

    LListNode(int val, LListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class LeetCode1721 {
    public LListNode swapNodes(LListNode head, int k) {
        LListNode current = head;

        // 1-based indexing
        for (int i = 0; i < k - 1; i++) {
            current = current.next;
        }

        // Two-pointer approach
        LListNode left = current; // It will point to the actual k-th value
        LListNode right = head; // Point to the k-th value from last that should be swapped with

        // Traverse until you find the k-th value in the right side
        while (current.next != null) {
            current = current.next;
            right = right.next;
        }

        // Swap the information of k-th node at left & right
        int temp = left.val;
        left.val = right.val;
        right.val = temp;

        return head;
    }
}