class node{
  int data;
  node next = null;

    public node(int data) {
        this.data = data;
   
    }

  
}

public class listLinked{

  node head;

  // the head;

  void add(int data){
    node newNode = new node(data);
    // a new node

    if(head == null){
      head = newNode;
    }
    else{

      node current = head;

      while(current.next != null){

        current = current.next;
      }
      current.next = newNode;

    }
    // the conditions

    // if its null

    // if the head is not null

  }

  void print(){

    node current = head;
    
    while (current != null) { 
      System.out.println(current.data);      
      
      current = current.next;
    }

    
  }
  void reverse(){
      node previous = null;
      node current = head;
      node following = head;

      while (current != null) { 
          following = following.next;
          current.next = previous;
          previous = current;
          current = following;

      }

      head = previous;
     
  }

  public static void main(String[] args) {
    listLinked list = new listLinked();

    list.add(1);
    list.add(2);
    list.add(3);

    list.print();
    list.reverse();
    list.print();
    
    
    
  }
}