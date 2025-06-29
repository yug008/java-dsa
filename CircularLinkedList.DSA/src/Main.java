//CIRCULAR SINGLE LINKEDLIST...

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

class CircularLinkedList {
    Node head = null;
    Node tail = null;

    // Add a node to the end
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head; // circular link
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head; // keep it circular
        }
    }

    // Display the list
    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }

    // Delete a node by value
    public void delete(int value) {
        if (head == null) return;

        // If only one node
        if (head == tail && head.data == value) {
            head = null;
            tail = null;
            return;
        }

        // If head needs to be deleted
        if (head.data == value) {
            head = head.next;
            tail.next = head;
            return;
        }

        Node current = head;
        Node prev = null;
        do {
            prev = current;
            current = current.next;
            if (current.data == value) {
                prev.next = current.next;
                if (current == tail) {
                    tail = prev;
                }
                return;
            }
        } while (current != head);
    }

    // Search for a value
    public boolean search(int value) {
        if (head == null) return false;
        Node temp = head;
        do {
            if (temp.data == value) return true;
            temp = temp.next;
        } while (temp != head);
        return false;
    }
}

public class Main {
    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.print("Original List: ");
        list.display();

        System.out.println("Search 30: " + list.search(30));
        System.out.println("Search 99: " + list.search(99));

        list.delete(10); // delete head
        list.delete(50); // delete tail
        list.delete(30); // delete middle

        System.out.print("After Deletions: ");
        list.display();
    }
}

