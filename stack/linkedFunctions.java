package stack;

class Node{
    int data;
    Node next;
    
    public  Node(int data){
        this.data = data;
        this.next = null;
       

    }
}

public class linkedFunctions {
    //operations stack - push, pop, peek, isEmpty, isFull and size
    // push -> add an element to the top of the stack
    // pop -> remove and return the top element from the stack

    Node head; // head starting null

    public linkedFunctions(){
        head = null;
    }


    // i will change the head O(1)

    // so w have the: head --> currentNode 
    // head --> newNode
    //newNode, next --> head

    public void push(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;

    }

    // o(n) ??? without tail, O(1) w tail

    
    //LIFO -> Last In, first out. (stack of books)
    // remove and return the element from the top of the stack
    public int pop(){
        if(head == null){
            System.out.println("the list is empty");
        }
        int dataTop = head.data;
        head = head.next;

        return dataTop;

        

    }

    // return the top element from the stack w remove
    public int peek(){
        if(head == null){
            System.out.println("the list is empty");
        }

        return head.data;

    }

    public boolean isEmpty(){
        return head == null;
    }

    public void printStack(){
        if(isEmpty()){
            System.out.println("the list is empty");
        }

        Node currentNode = head;

        // while 
        //current = current.next

        while (currentNode != null) {
            System.out.print(currentNode.data + " --> "); 
            currentNode = currentNode.next;
        }
        System.out.println("Null");

        //null
    }

    public static void main(String[] args) {
        
        linkedFunctions st = new linkedFunctions();

        st.push(1);
        st.push(10);
        st.push(45);
        st.push(56);
        st.push(35);
        st.printStack();
        st.pop();
        st.pop();
        st.printStack();
        // every core operation of stack is O(1) in linked list
    }

}
