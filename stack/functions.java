package stack;

class Stack{
    int[] list;
    int capacity;
    int top;

    public Stack(int capacity) {
        this.capacity = capacity;
        list = new int[capacity];
        this.top = -1;

    }

    public void push(int key){
        list = new int[capacity];
        list[++top] = key;
    }

    public int pop(){
       return list[top--];
        

    }
    public int peek(){
        if(isEmpty()){
            return -1;
        }else{
            return list[list.length - 1];
        }
    }
    public boolean isEmpty(){
        return list.length == 0;
    }

    public boolean isFull(){
        return list.length == capacity;
    }
}
public class functions {

    public static void main(String[] args) {
        Stack stack = new Stack(5);

        stack.push(1);
        stack.push(2);
        stack.push(3);
       System.out.println( stack.pop());
      
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());
       System.out.println(stack.isFull());
    }
}
