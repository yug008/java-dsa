class Node{
int data;
Node next;
Node(int data){
    this.data = data;
}
}

class LinkedList {
    Node head;

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public void addAtStart(int data) {                  //method to add elements at the start of linkedlist
        Node node = new Node(data);
        node.next = head;
        head = node;
    }

    public void addAt(int index, int data) {            //method to add elements at any specified index
        Node node1 = new Node(data);
        node1.data = data;
        if (index == 0) {
            addAtStart(data);
        } else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            node1.next = temp.next;
            temp.next = node1;
        }
    }

    public void deleteAt(int index) {                //method to delete elements at any specified index
        if (index == 0) {
            head = head.next;
        } else {
            Node temp = head;
            Node temp1 = null;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp1 = temp.next;
            temp.next = temp1.next;
            temp1 = null;
        }
    }

    public void deletehead() {                  //deletion from head
        if (head == null) {                  //if list is empty
            return;
        } else {
            head = head.next;
        }
    }

    public void deletetail() {
        if (head == null) {                       //if list is empty
            return;
        }
        if (head.next == null) {                   //if only one node exists
            head = null;
            return;
        }
        Node temp = head;
        while (temp.next.next != null) {               //traverse to the 2nd last element and then declare last element as null
            temp = temp.next;
        }
        temp.next = null;
    }
}

public class Main{
    public static void main(String[] args) {
LinkedList list = new LinkedList();
list.add(2);
list.add(5);
list.add(7);
list.add(9);

list.display();               //displays 2 5 7 9
list.deletehead();                //deletes the head 2
//after deleting head, the list will be
list.display();
list.deletetail();



//list.addAtStart(1);
//list.addAtStart(8);
//list.addAt(4,77);
//list.addAt(1,10);
//list.deleteAt(3);                                                             //deletes 2
  //      list.display();
    }
}