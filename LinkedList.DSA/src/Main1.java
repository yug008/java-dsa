class Node1{
    int data;
    Node next1;                  //reference to the next node
}

class LinkedList1{
    Node head1;
    public void add(int data){                //'add' method to insert/add value in node
        Node1 newNode = new Node1();
        newNode.data = data;

        if(head1 == null){
            head1 = newNode;         //Head becomes the first node
        }
        else{
            Node temp = head1;           //Else head is stored in a 'temp' node whose value keeps on changing
            while(temp.next1 != null){
                temp = temp.next1;
            }
            temp.next = newNode;                 //link last node to new node
        }
    }
    public void display1(){
        Node temp = head1;
        while(temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public void InsertAtStart(int data){
        Node1 newNode = new Node1();
    }
}
public class Main1 {
    public static void main(String[] args) {

    }
}
