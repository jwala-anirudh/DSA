package LinkedList;

public class MidOfLinkedList {

    /**
     * In brute force approach, we find the length and divide by 2
     */
    static Node<Integer> midElementLLBrute(Node<Integer> head) {
        int totalLength = 0;

        // List is empty
        if (head == null) {
            return null;
        }

        Node<Integer> current = head;
        while (current != null) {
            totalLength += 1;
            current = current.next;
        }

        Node<Integer> midElement = head;

        int noOfTraversals = 0;
        if (totalLength % 2 == 0) {
            noOfTraversals = (totalLength / 2) - 1;
        } else {
            noOfTraversals = (totalLength / 2);
        }

        for (int i = 0; i < noOfTraversals; i++) {
            midElement = midElement.next;
        }

        return midElement;
    }

    static int findMiddleLL(Node<Integer> head) {
        Node<Integer> slow = head;
        Node<Integer> fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        if (slow != null)
            return slow.data;

        return -1;
    }

    public static void main(String[] args) {
        Node<Integer> n1 = new Node<>(1);
        Node<Integer> n2 = new Node<>(2);
        Node<Integer> n3 = new Node<>(3);
        Node<Integer> n4 = new Node<>(4);
        Node<Integer> n5 = new Node<>(5);
        Node<Integer> n6 = new Node<>(6);

        Node<Integer> head = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;

        System.out.println("Mid element is :: " + findMiddleLL(head));
    }
}
