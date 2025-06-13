public class traversal {
    // Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Function to convert array to linked list
    static Node convertArrayToLinkedList(int[] arr) {
        if (arr.length == 0) return null;

        Node head = new Node(arr[0]);
        Node current = head;

        for (int i = 1; i < arr.length; i++) {
            current.next = new Node(arr[i]);
            current = current.next;
        }

        return head;
    }

    // Function to traverse and print linked list
    static void traverse(Node head) {
        Node temp = head;

        System.out.print("Linked List Elements: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40};

        Node head = convertArrayToLinkedList(array);  // Step 1: Convert array to linked list

        traverse(head);  // Step 2: Traverse and print
    }
}
