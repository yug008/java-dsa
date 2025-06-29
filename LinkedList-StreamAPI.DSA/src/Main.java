/* CONVERTING A LINKEDLIST (COLLECTION) INTO A STREAM ALLOWS US TO UTILIZE MANY IN-BUILT FUNCTIONS AND ALLOWS
 US TO UTILIZE MANY EFFICIENT FUNCTIONALITIES.
*/
import java.util.Iterator;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class LinkedList implements Iterable<Integer> {
    Node head;
    Node tail;

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public void displayRev(){
        Node temp = tail;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
    }
    public void displayRandom(Node random){
        if(random == null){                                       //if list is empty
            return;
        }
        else{
            Node temp = random;
            while(temp!=null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    // Make it iterable
    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {
            Node current = head;

            public boolean hasNext() {
                return current != null;
            }

            public Integer next() {
                int val = current.data;
                current = current.next;
                return val;
            }
        };
    }

    // Enable stream usage
    public Stream<Integer> stream() {
        return StreamSupport.stream(Spliterators.spliteratorUnknownSize(iterator(), Spliterator.ORDERED), false);
    }
}
public class Main{
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        list.display();

        Node temp = list.head;
        while(temp!=null && temp.data !=30){
            temp = temp.next;
        }
        list.displayRandom(temp);

        Stream<Integer>s1 = list.stream();
        Stream<Integer>s2 = s1.sorted();

        s2.forEach( x -> {
            System.out.print(x + " ");
        });
        System.out.println();

        Stream<Integer>s3 = list.stream();
        long x = s3.count();
        System.out.println("The count is : " + x);
    }
}

// '.count()' allows the use of 'long' datatype.