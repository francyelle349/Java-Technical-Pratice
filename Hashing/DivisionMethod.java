package Hashing;

public class DivisionMethod {

    
    int size;
    Integer[] array;

    

    
public static int division(int key, int size){
    return key % size;
} 

    public DivisionMethod( int size) {
        array = new Integer[size];
        this.size = size;
    }

public void DivisionApplied(int number){
   
    int result = division(number, size);

    
    array[result] = number;


}

public void print(){
    
    for(Integer i = 0; i < array.length; i++){
        System.out.println(array[i] );
    }
}
public static void main(String[] args) {
    
    DivisionMethod division = new DivisionMethod( 7);

    division.DivisionApplied(10);
    division.DivisionApplied(20);
    division.DivisionApplied(30);
    division.DivisionApplied(40);
    division.print();
}
}
