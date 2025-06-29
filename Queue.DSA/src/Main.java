//FOR LINEAR QUEUE ...

class World{
    int [] queue = new int [4];
    int front = 0;
    int rear = 0;

    public void enqueue(int data){                       //(enqueue->insert/push)
        queue[rear] = data;
        rear++;
    }
    public int dequeue(){                                //(dequeue->delete/pop)
        int data;
        data = queue[front];
        queue[front] = 0;
        front++;
        return data;
    }
    public void show(){
        for(int i=front; i<rear; i++){
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }
    public int size(){
        return rear-front;
    }
}

public class Main {
    public static void main(String[] args) {
World obj = new World();
        obj.enqueue(10);
        obj.enqueue(20);
        obj.enqueue(30);
        obj.enqueue(40);
        System.out.println(obj.size());

        obj.show();

    }
}