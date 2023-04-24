package LinkedList;

public class DeleteAnElementByNode {

  static void deleteByNode(Node<Integer> node) {
    if (node == null) {
      return;
    }

    node.data = node.next.data;
    node.next = node.next.next;
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
    Node<Integer> n1 = new Node<>(1);
    Node<Integer> n2 = new Node<>(2);
    Node<Integer> n3 = new Node<>(3);
    Node<Integer> n4 = new Node<>(4);
    Node<Integer> n5 = new Node<>(5);

    Node<Integer> head = n1;
    n1.next = n2;
    n2.next = n3;
    n3.next = n4;
    n4.next = n5;

    printLL(head);

    System.out.println("------- Linked List Deletion by Node -------");
    deleteByNode(n3);
    printLL(head);

  }
}
