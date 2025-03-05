class stack{

    public char[] stack;
    private int top;
    private int capacity;

    public stack( int size){
        this.capacity = size;
        this.top = -1;
        this.capacity = size;

    }

    public Boolean isEmpty(){

        return top == capacity - 1;
    }

    public void push(char item){
        if(capacity == top){
            throw new IllegalStateException("Stack is Full, cannot push more elements");
        }
        stack[++top] = item;

    }

    public char pop(){
        if(isEmpty()){
            throw new IllegalStateException("Stack is empty, cannot pop elements");
        }
        return stack[top--];

    }
    public void top(){

    }

    // return the top element without removing it

    public char peek(){
        if(isEmpty()){
            throw new IllegalStateException("error: stack is empty");

        }
        return stack[top];

    }


}



public class balanced {
    
    public Boolean isBalanced(stack[] input){

        stack st = new stack(input.length);

        if(st.peek() == '(' && st.peek() == '[' ){
            st.pop();
        }
             

return null;
        // initialize stack
       
    }
}
