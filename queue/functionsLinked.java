package queue;

// Queue: FIFO --> first in first out, people waiting on line

class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;

    }
}
public class functionsLinked {
    
    // add to the end
    Node head;
    Node tail;


    public void Enqueue(int data){
        // new node
        Node newNode = new Node(data);
        Node current = head;
        if(head == null){
            head = newNode;
            tail = newNode;
        }
        else{
            while (current.next != null) {
                current = current.next; 
                
            }
            current.next = newNode;
            tail = newNode;
        }

        // if head == null

        // else:

        // while its not null then:

        // tail = newNode



    }

    public void Dequeue(){

        if(head == null){
            tail = null;
        }else{
            head = head.next;
        }



        // head ->  2, next 

        // head->  1, next --> 2, next;

        // head = new node

        // if head == null
        // tail == null
        



    }

    public void print(){
        Node current = head;
       
        while(current != null){
            System.out.print (current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
    // head -> node, next --> node2, next --> node3, null --> tail

    // remove from the front

    public static void main(String[] args) {
        functionsLinked fn = new functionsLinked();

        fn.Enqueue(1);
        fn.Enqueue(2);
        fn.Enqueue(4);
        fn.print();
        fn.Dequeue();
        fn.print();
        fn.Dequeue();
        fn.print();
    }
}
