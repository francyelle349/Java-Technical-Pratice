
class Node1{
    int key;
    Node1 next;

    Node1(int key){
        this.key = key;
        this.next = null;

    }

    public String toString() {
        return key+"";
    }
}

public class functions{
  Node1 head;
  Node1 tail;

 functions(){
    this.head = null;
    this.tail = null;
 }

 public void pushFront(int number){
    Node1 newNode = new Node1(number);
    // newNode will be connected to the head
    newNode.next = head;

    head = newNode;

    if(tail == null){
        tail = head;
    };
    // 1  head -->  2, next ---> 3


 }
// remove from the front of the list

 public void PopFront(){
    if(head == null){
        System.out.println("ERROR: empty list");
    }
    else{
        head = head.next;
        // if the new head its null then:
        if(head == null){
            tail = null;
        }
    }
 }
 
 // no tail, add to the end
 public void pushBackNoTail(int key){
    Node1 newNode = new Node1(key);

    // if the list is empty

    if(head == null){
        head = newNode;
    }else{
        Node1 current = head;
        while(current.next != null){
            current = current.next;

        }
        current.next = newNode;

    }

 }

 
 // w tail 1,next --> 2, next --> null  3, 
 
 public void pushBackTail(int key){
        Node1 newNode = new Node1(key);

        if(tail == null){
            tail = newNode;
            head = newNode;
        }
        else{
            tail.next = newNode;
            tail = newNode;

        }





 }
// remove a back item
 public void popBack(){
    if(head == null){
        System.out.println("ERROR: empty list");
    }
    if(head.next == null){
        head = null;
    }
    else{
        Node1 current = head;
        while(current.next.next != null){
            current = current.next;
        }
        current.next = null;
        tail = current;

    }

    
 }

public void printList() {
    Node1 current = head;
    while (current != null) {
        System.out.print(current + " -> ");
        current = current.next;
    }
    System.out.println("null");
}

// ex: 1, next --> 2, next --> 3, null
// 1, next --> 4, next -->         2, next --> 3, null

public void addAfter(int target, int key){
    Node1 newNode = new Node1(key);
    Node1 current = head;

    if(current != null && current.key != target){
        current = current.next;
    }
    newNode.next =  current.next;
    current.next = newNode;

    if(current == tail){
        tail = newNode;
    }






}

 public static void main(String[] args) {
    functions list = new functions();

    // Adding elements to the front of the list
    list.pushFront(3);
    list.pushFront(2);
    list.pushFront(1);

    // Printing the list
    list.printList(); // Output: 1 -> 2 -> 3 -> null

    list.PopFront();

    list.printList();

    list.pushBackTail(4);

    list.pushBackTail(5);

    list.printList();

    list.popBack();

    list.printList();
}
}
