class queue{
    int [] queue = new int [5];
    int front = 0;
    int rear = 0;

    public void enqueue(int data){
        if((rear+1) % queue.length == front){
            System.out.println("The queue is full");
            return;
        }
        queue[rear] = data;
        rear = (rear+1) % queue.length;
    }

    public int dequeue(){
        if(front == rear){
            System.out.println("The queue is empty");
            return -1;
        }
        int data;
        data = queue[front];
        queue[front] = 0;
        front = (front+1) % queue.length;
        return data;
    }

    public int size(){
        if(rear>=front){
            return rear-front;
        }
        else{
            return queue.length-front+rear;
        }
    }

    public void show(){
        int i = front;
        while(i!=rear){
            System.out.print(queue[i] + " ");
            i = (i+1) % queue.length;
        }
    }
}

public class Main1 {
    public static void main(String[] args) {
queue obj = new queue();
        obj.enqueue(10);
        obj.enqueue(20);
        obj.enqueue(30);
        obj.enqueue(40);
        obj.enqueue(50);
        System.out.println(obj.size());

        obj.show();

        obj.dequeue();
        obj.dequeue();
        obj.show();

        obj.enqueue(100);
        obj.enqueue(200);
        System.out.println(obj.size());
        obj.show();
    }
}
