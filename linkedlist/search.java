public class search {

    // Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Convert array to linked list
    public static Node convertToLinkedList(int[] arr) {
        if (arr.length == 0) return null;

        Node head = new Node(arr[0]);
        Node current = head;

        for (int i = 1; i < arr.length; i++) {
            current.next = new Node(arr[i]);
            current = current.next;
        }

        return head;
    }

    // Find a node with a specific value
    public static Node find(Node head, int target) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == target) {
                return temp; // target found
            }
            temp = temp.next; // move to next node
        }
        return null; // target not found
    }

    // Main method to test the code
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        Node head = convertToLinkedList(array);

        int target = 30;
        Node result = find(head, target);

        if (result != null) {
            System.out.println("Element found: " + result.data);
        } else {
            System.out.println("Element not found");
        }
    }
}
