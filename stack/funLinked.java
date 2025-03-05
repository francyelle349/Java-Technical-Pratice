package stack;
//LIFO -> Last In, first out. (stack of books)

// goal: use linked list to implement stack

// operations: pop, push, peek, isEmpty, isFull, size

// pop: remove from the top
// push: add from the top

class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;

    }
}

public class funLinked {
    Node head;

    public funLinked(){
        head = null;
    }

    // push

    public void push(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;

        // head -> 1, next -> 2,next -> 3, next 
        

    }

    public int pop(){

         if(head == null){
                System.out.println("the list is empty");
              return -1;
         }
       int top = head.data;

       head = head.next;

       return top;
    }

    // return the top element but not remove it
    public int peek(){
        int topData = head.data;
        return topData;

    }

    public boolean isEmpty(){
        if(head == null){
            return true;
        }else{
            return false;
        }
    }




}
