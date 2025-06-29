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
            tail = newNode;
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


    public void display() {         // complete display from head->tail
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void displayRev() {          //complete display from tail->head
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
        System.out.println();
    }
    public void displayRandom(Node random){         //display from our desired random node from head->tail
        if(random ==null){
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
    public void displayRandomRev(Node random1){         //display from our desired random node from tail->head
        if(random1 == null){
            return;
        }
        else{
            Node temp = random1;
           while(temp!=null){
               System.out.print(temp.data + " ");
               temp = temp.prev;
           }
        }
        System.out.println();
    }

    //Method to get the length of a given linkedlist.
    public static int getLength(Node head){                   //we start from head until it gets to null to get the length of the linkedlist
        int count = 0;
        while(head!=null){
            count++;
            head = head.next;
        }
       return count;
    }

    //Method to get value of a node at any index
    public int getIndex(int index){               //we will traverse from either head or tail to the node of desired index
        Node temp = head;
  for(int i = 1; i<=index; i++){                        //START FOR-LOOP FROM 1
      temp = temp.next;
        }
       return temp.data;
    }

    //Method to find mid value of a linkedlist
    public int getMid(){
        Node temp = head;
        int count = 0;
        while(temp!=null){
            count++;
            temp = temp.next;
        }
        int mid = (0 + count)/2;                //it gives the index value of mid node value
        return mid;
    }
}

    public class Main {
        public static void main(String[] args) {
            LinkedList list = new LinkedList();
            list.add(10);
            list.add(20);
            list.add(30);
            list.add(40);
            list.add(50);
            list.add(60);

            list.display();
            list.displayRev();

            //calling displayRandom method  (head->tail display)
            Node temp = list.head;
            while(temp!=null && temp.data != 40){
                temp = temp.next;
            }
            list.displayRandom(temp);           //prints from 40 to tail

            //calling displayRandomRev method (tail->head display)
            Node temp1 = list.tail;
            while(temp1!=null && temp1.data!=40){
                temp1 = temp1.prev;
            }
            list.displayRandomRev(temp1);                    //prints from 40 to head

            //calling getLength method to get the length of the linkedlist
            Node temp2 = list.head;
            System.out.println(LinkedList.getLength(temp2));

            //calling getIndex method to get the value of any node at any index
            System.out.println(list.getIndex(3));

            //calling getMid method to get the mid value of the linkedlist
            System.out.println(list.getMid());
        }
    }
