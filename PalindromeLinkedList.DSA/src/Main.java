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
class LinkedList{
    Node head;
    Node tail;
    public void add(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
        }
        else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.prev = temp;
            tail = newNode;
        }
    }
    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    public void displayRandom(Node random){                   //(head -> tail)
        if(random == null){
            return;
        }
        else{
            Node temp = random;
            while(temp!=null){
                System.out.println(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
    public boolean palindrome(){
        if(head == null || head.next == null){            //for 0 or 1 elements, the list will always be a palindrome linkedlist
            return true;
        }
        Node left = head;
        Node right = tail;

        while(left!=right && left.prev!=right){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.prev;
        }
        return true;
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

        //for displayRandom
        Node temp = list.head;
        while(temp!=null && temp.data != 30){
            temp = temp.next;
        }
        list.displayRandom(temp);
        System.out.println(list.palindrome() );
    }
}

/* 'left!=right' is the condition for odd linkedlist whereas 'left.prev!=right' is the condition for
even linkedlist.
 */