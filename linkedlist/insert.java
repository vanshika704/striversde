public class insert {

    // Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Print the linked list
    static void printList(Node head) {
        Node temp = head;
        System.out.print("Linked List: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Insert at the beginning
    static Node insertAtBeginning(Node head, int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        return newNode;
    }

    // Insert at the end
    static Node insertAtEnd(Node head, int data) {
        Node newNode = new Node(data);
        if (head == null) return newNode;

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        return head;
    }

    // Insert at a specific position (0-based index)
    static Node insertAtPosition(Node head, int data, int position) {
        if (position == 0) return insertAtBeginning(head, data);

        Node newNode = new Node(data);
        Node temp = head;

        for (int i = 0; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Position out of bounds");
            return head;
        }

        newNode.next = temp.next;
        temp.next = newNode;

        return head;
    }

    // Main method to test
    public static void main(String[] args) {
        // Initial list: 10 -> 20 -> 30
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        printList(head);

        head = insertAtBeginning(head, 5);        // 5 -> 10 -> 20 -> 30
        printList(head);

        head = insertAtEnd(head, 40);             // 5 -> 10 -> 20 -> 30 -> 40
        printList(head);

        head = insertAtPosition(head, 25, 3);      // 5 -> 10 -> 20 -> 25 -> 30 -> 40
        printList(head);
    }
}
