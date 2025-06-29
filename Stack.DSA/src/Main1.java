//FOR DYNAMIC ARRAY...

class World1{
    int capacity = 2;
    int [] stack = new int[capacity];
    int top = 0;

    public void push(int data){
        if(size() == capacity){
            expand();
        }
        stack[top] = data;
        top++;
    }

    public int pop(){
        int data;
        top--;
        data = stack[top];
        stack[top] = 0;
        shrink();
        return data;
    }

    public int size(){
        return top;
    }

    public void expand(){
        int length = size();
        int [] newStack = new int [capacity*2];
        System.arraycopy(stack,0,newStack,0,length);
        stack = newStack;
        capacity = capacity*2;                      //the capacity/size of array will also increase after declaring stack as newStack
    }

    public void shrink(){
        int length = size();
        if(length <= capacity/4){
            capacity = capacity/2;
        }
        int [] newStack = new int [capacity];
        System.arraycopy(stack,0,newStack,0,length);
        stack = newStack;
    }

    public void show(){
        for(int x : stack){
            System.out.print(x + " ");
        }
        System.out.println();
    }
}

public class Main1 {
    public static void main(String[] args) {
World1 obj = new World1();
        obj.push(10);
        obj.push(20);
        obj.push(30);
        obj.push(40);
        obj.push(50);
        obj.push(60);
        obj.push(70);
       obj.show();

        System.out.println(obj.pop());
        obj.show();

        //use of shrink()                     when length/size=2, capacity = 4
        obj.push(100);
        obj.push(110);
        System.out.println(obj.pop());
        System.out.println(obj.pop());
        System.out.println(obj.pop());
        System.out.println(obj.pop());
        System.out.println(obj.pop());
        System.out.println(obj.pop());
        obj.show();
    }
}

/*  In dynamic stack array, we focus more on Memory management. We want to add as many elements as we desire
without worrying about the size of the stack. Thus we used 'expand()'method. Similarly, we didnt want the
stack to be so much empty if a lot of elements are popped, due to alot of 0 (null) present in the upper
indices of the stack, thus we used shrink() method to reduce the size of stack array in case of very less
elements.
 */
