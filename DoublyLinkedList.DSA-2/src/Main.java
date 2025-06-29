class Node{
    int data;
    Node next;
    Node prev;
    Node(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class LinkedList {
    Node head;
    Node tail;

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;                                // tail to last node
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.prev = temp;
            tail = newNode;
        }
    }

    public void display() {                          //prints from head
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void displayRev() {                     //prints from tail
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
        System.out.println();
    }

    public void displayRandom(Node random) {           //prints from random node
        if (random == null) {                         //if random is null, we return immediately to prevent errors
            return;
        }
        Node temp = random;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

}

public class Main {
    public static void main(String[] args) {
LinkedList list = new LinkedList();
list.add(2);
list.add(3);
list.add(4);
list.add(5);
list.add(6);
list.displayRev();
list.display();

Node temp = list.head;
while(temp != null && temp.data != 4){            //at the end, 4 will be stored in 'temp'. 4 is our desired random node. In this method we will work to reach to our desired node and store it in temp
    temp = temp.next;                             //our goal is to execute the displayRandom method by storing our random node in 'temp'
}
if(temp!= null){
    list.displayRandom(temp);
}
else{
    System.out.println("Node not found");
}

    }
}

// Here the displayRandom method prints the nodes from random desired node in head->tail order.
//All the complete linkedlist display methods will have no parameters. But the random display method will have
//parameter as a Random node because we want to print elements from that desired random node.