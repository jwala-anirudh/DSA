package LinkedList;

/**
 * Printing a linked list
 * Inserting at position
 * Deleting from a position
 */

public class Basics {

  static Node<Integer> insertAt(int data, int position, Node<Integer> head) {
    Node<Integer> newNode = new Node<>(data);

    // Invalid position
    if (position < 0) {
      System.out.println("Position is invalid to insert");
      return head;
    }

    if (position == 0) {
      newNode.next = head;
      head = newNode;
      return head;
    }

    Node<Integer> current = head;
    for (int i = 0; i < position - 1; i++) {
      current = current.next;

      // If we exceed the linked list length, when out of range position is passed
      if (current.next == null) {
        return head;
      }
    }

    newNode.next = current.next;
    current.next = newNode;
    return head;
  }

  static Node<Integer> deleteAt(int position, Node<Integer> head) {

    if (position < 0) {
      System.out.println("Invalid position is provided");
      return head;
    }

    // Linked List is empty
    if (head == null) {
      return null;
    }

    // Deleting first element
    if (position == 0) {
      head = head.next;
      return head;
    }

    Node<Integer> current = head;
    for (int i = 0; i < position - 1; i++) {
      current = current.next;

      if (current == null) {
        // Exceeded due to large position outside the list size
        return head;
      }
    }
    current.next = current.next.next;

    return head;
  }

  static void printLL(Node<Integer> head) {
    Node<Integer> current = head;

    while (current != null) {
      System.out.print(current.data + " -> ");
      current = current.next;
    }
    System.out.println("NULL");
  }

  public static void main(String[] args) {
    Node<Integer> n1 = new Node<>(10);
    Node<Integer> n2 = new Node<>(20);
    Node<Integer> n3 = new Node<>(30);
    Node<Integer> n4 = new Node<>(40);
    Node<Integer> n5 = new Node<>(50);
    Node<Integer> n6 = new Node<>(60);

    Node<Integer> head = n1;
    n1.next = n2;
    n2.next = n3;
    n3.next = n4;
    n4.next = n5;
    n5.next = n6;
    // n6.next = null (done internally)

    System.out.println("------- Linked List traversing -------");
    printLL(head);

    System.out.println("------- Adding element at a position -------");
    head = insertAt(100, 0, head);
    printLL(head);

    head = insertAt(200, 3, head);
    printLL(head);

    System.out.println("------- Passing abnormal value of position to add element -------");
    head = insertAt(300, 30, head);
    printLL(head);

    System.out.println("------- Deleting element at a position -------");
    head = deleteAt(3, head);
    printLL(head);

    System.out.println("------- Passing abnormal value of position to delete element -------");
    head = deleteAt(100, head);
    printLL(head);
  }
}
