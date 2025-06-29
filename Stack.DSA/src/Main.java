//FOR STATIC ARRAY ...

class World{
    int [] stack = new int [5];
    int top = 0;

    public void push(int data){
    stack[top] = data;
    top++;
    }

    public int pop(){
        int data;
        top--;
        data = stack[top];
        stack[top] = 0;
        return data;
    }

    public int size(){                        //'top' will be equal to the size of the stack
        return top;
    }

    public void show(){
        for(int var : stack){
            System.out.print(var + " ");
        }
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
      World obj = new World();
      obj.push(10);
      obj.push(20);
      obj.push(30);
      obj.push(40);
      obj.push(50);
        System.out.println(obj.size());
      obj.show();
        System.out.println(obj.pop());
        System.out.println(obj.pop());
        obj.show();
    }
}


/* IMP : the variable 'top' will always be one index ahead than the index of last (top) value of the stack
array. Thus, while using the pop() method, always decrease the value of top by -1 (top--) so that the
variable 'data' matches with the index of the top value of the stack.

You can only push as many elements as that of the size of the stack array.
 */