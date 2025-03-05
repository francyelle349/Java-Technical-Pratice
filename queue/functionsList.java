package queue;

public class functionsList {
    // FIFO --> first in first out, people waiting on line

    Integer[] array;
    int capacity;
    int write;
    int read;
    int size;


    // Enqueue : adds key to the collection
    // Dequeue: removes and removes the least recently added

    public functionsList(int capacity){
        this.capacity = capacity;
        array = new Integer[capacity];
          write = 0;
          read = 0;
    }

    // add to the end , and pop from the front


    public void Enqueue(int data){
        if(size == capacity){
            System.out.println("the queue is full");
            return;
    }
    else{
        array[write] = data;
        // circular way?
        // (write + 1) %capacity --> what means?
        // 1 2 3 n n -> write = 2 (+ 1) = 3 % 5 = 2 (ok the rest is 2) 
        // i think i understand: circular way, because the 
        // write will be controlled by this operation "automatically"
        // if the write is 5, the next write will be 0
        // if the write is 4, the next write will be 5 % 5 = 0

        write = (write+1)%capacity;

        size++;
        

    }

    }

    public void Dequeue(){
        if(size == 0){
            System.out.println("empty");
        }
        else{
            array[read] = null;
            // here the same logic, circular way to control the read
            read = (read + 1) % capacity;
            size--;

        }

    }

    public static void main(String[] args) {
        functionsList fun = new functionsList(5);

        fun.Enqueue(23);
        fun.Enqueue(78);
        fun.Enqueue(3);
        fun.Enqueue(45);
        fun.Enqueue(22);
        fun.Dequeue();
        fun.Dequeue();
        fun.Dequeue();
        fun.Dequeue();
        fun.Dequeue();
        fun.Dequeue();



        for(int i = 0; i < fun.array.length; i++) {
            System.out.println(fun.array[i]);
        }
    }
}