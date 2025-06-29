/* FOR BASIC AND MANUAL UNDERSTANDING AND LEARNING ONLY. DONT USE THIS FOR REAL WORLD. IN THIS WE ARE
MANUALLY LINKING NODES WHICH ISNT DYNAMIC.
 */

class Node{
    int data;
    Node next;
    Node prev;
    Node(int data){
        this.data = data;
    }
}

class LinkedList{
   public void display(Node head){
       Node temp = head;
       while(temp!=null){
           System.out.println(temp.data);
           temp = temp.next;
       }
   }
   public void displayrev(Node tail){
       Node temp = tail;
       while(temp != null){
           System.out.println(temp.data);
           temp = temp.prev;
       }
   }
}

public class Main {
    public static void main(String[] args) {
Node a  = new Node(2);
        Node b  = new Node(3);
        Node c  = new Node(4);
        Node d  = new Node(5);
        Node e  = new Node(6);
        a.prev = null;
        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = e;
        e.prev = d;
        e.next = null;

     LinkedList list = new LinkedList();
     list.display(c);

    }
}