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
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public int getLength(){
        int count = 0;
        Node temp = head;
        while(temp!=null){
            count++;
            temp = temp.next;
        }
        return count;
    }
}

public class Main{
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(4);
        list.add(9);
        list.add(16);
        list.add(25);
        list.add(36);
        list.add(49);
        list.display();
        System.out.println("The total elements are: " + list.getLength());

        // Step 1: Create an array of the same size as the linked list
        int length = list.getLength();
        int [] arr = new int [length];

// Step 2: Traverse the linked list and fill the array
        Node temp = list.head;
        int i = 0;
        while(temp!=null){
            arr[i] = temp.data;
            temp = temp.next;
            i++;
        }

        for(int x : arr){
            System.out.print(x + " ");
        }
        System.out.println();

        System.out.println(arr[3]);
        System.out.println(arr[2]);
    }
}