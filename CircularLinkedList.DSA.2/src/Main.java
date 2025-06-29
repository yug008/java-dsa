//CIRCULAR DOUBLY LINKEDLIST...

class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
    }
}

class DoublyCircularLinkedList {
    Node head = null;
    Node tail = null;

    // Add node at the end
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            // First node
            head = newNode;
            tail = newNode;
            newNode.next = head;
            newNode.prev = tail;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
            tail.next = head;
            head.prev = tail;
        }
    }

    // Display list forward
    public void displayForward() {
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

    // Display list in reverse
    public void displayBackward() {
        if (tail == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = tail;
        do {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        } while (temp != tail);
        System.out.println();
    }

    // Delete node by value
    public void delete(int value) {
        if (head == null) return;

        Node current = head;

        // Search for the node
        do {
            if (current.data == value) {
                // If the list has only one node
                if (current == head && current == tail) {
                    head = null;
                    tail = null;
                }
                // Deleting head
                else if (current == head) {
                    head = head.next;
                    head.prev = tail;
                    tail.next = head;
                }
                // Deleting tail
                else if (current == tail) {
                    tail = tail.prev;
                    tail.next = head;
                    head.prev = tail;
                }
                // Deleting middle node
                else {
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                }
                return;
            }
            current = current.next;
        } while (current != head);
    }
}
