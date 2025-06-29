class Node1{
    int data;
    Node next;
    Node prev;
    Node1(int data){
        this.data = data;
    }
}

class LinkedList1{
    Node head1;
    Node tail;
    public void add(int data){
        Node1 newNode1 = new Node1(data);
        if(head1 == null){
            head1 = newNode1;
            tail = newNode1;
        }
    }
}



public class Main1 {
    public static void main(String[] args) {

    }
}
