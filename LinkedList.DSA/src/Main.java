//GENERAL CODE FOR LINKEDLIST
class Node{
    int data;
    Node next;                  //reference to the next node
}

class LinkedList{
    Node head;
    public void add(int data){                //'add' method to insert/add value in node
        Node newNode = new Node();
        newNode.data = data;

        if(head == null){
            head = newNode;         //Head becomes the first node
        }
        else{
            Node temp = head;           //Else head is stored in a 'temp' node whose value keeps on changing
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;                 //link last node to new node
        }
    }
    public void display(){
        Node temp = head;
           while(temp != null) {
           System.out.println(temp.data);
           temp = temp.next;
       }
    }
}

public class Main{
    public static void main(String[] args) {
     LinkedList list = new LinkedList();
     list.add(2);
     list.add(5);
     list.add(7);
     list.add(9);
        list.display();


    }
}


/* You can also use constructor so that you directly input the value of 'data' of each node from the object
creation itself. Its more simpler. Its done in Methods of linkedlist project.
After creating a constructor with a parameter for 'data' in class node, we will simply create objects of
node class with arguments of 'data' parameter.
 */

