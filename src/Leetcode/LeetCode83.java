package Leetcode;

/**
 * Remove Duplicates from Sorted List
 * <p>
 * Given the head of a sorted linked list, delete all
 * duplicates such that each element appears only once.
 * Return the linked list sorted as well.
 */
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class LeetCode83 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;

        while (temp != null && temp.next != null) {
            if (temp.val == temp.next.val) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }

        return head;
    }
}
