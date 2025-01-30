public class bigONotation {
    private int[] theArray;
    private int arraySize;
    private int itemsInArray = 0;
    private long startTime;
    static long endTime;

    //O(1) - same amount of time regardless the amount of data

    bigONotation(int size){
        arraySize = size;
        theArray = new int[size];

    }

    public void addItemToArray(int newItem){
        theArray[itemsInArray++] = newItem;
    }

    //O(n) - a time to complete will grow with proportion to the amount of data

    public void linearSearchForValue(int value){
        boolean valueInArray = false;
        String indexWithValue = "";

        startTime = System.currentTimeMillis();

        for(int i = 0; i < arraySize;i++){
            if(theArray[i] == value){
                valueInArray = true;
                indexWithValue += i + "";
            }
        }
        System.out.println("value found: "+valueInArray);
        endTime = System.currentTimeMillis();
        System.out.println("linear search took: " + (endTime - startTime));
    }

    // O(n^2) this means the time 
    //to complete wll be proportionally 
    //to the square of amount of data

    public void bubblesort(){
        startTime = System.currentTimeMillis();

        for (int i = arraySize -1; i > 1; i--) {
            for (int j = 0; j < i; j++) {
                if(theArray[j] > theArray[j +1]){
                

                }
                
            }
            
        }

        endTime = System.currentTimeMillis();
        System.out.println("linear search took: " + (endTime - startTime));

    }


    public void generateRandomArray(){

        for(int i = 0; i < arraySize; i++){
            theArray[i] = (int) (Math.random() * 1000) + 10;

        }

    }

    public static void main(String[] args) {
        bigONotation test = new bigONotation(20000);
        test.generateRandomArray();

        bigONotation test2 = new bigONotation(100000);
        test2.generateRandomArray();

        bigONotation test3 = new bigONotation(100000);
        test3.generateRandomArray();

        bigONotation test4 = new bigONotation(100000);
        test4.generateRandomArray();

        test.linearSearchForValue(20);
        test2.linearSearchForValue(20);
        test3.linearSearchForValue(20);


        
    }



}