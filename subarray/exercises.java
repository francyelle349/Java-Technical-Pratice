package subarray;

import java.util.ArrayList;

class find{
  ArrayList<int[]> subarray;
  int maxSum;

    public find(int maxSum, ArrayList<int[]> subarray) {
        this.maxSum = maxSum;
        this.subarray = subarray; // its going to store the start end of a subarray
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(" Maximum Sum: ").append(maxSum + "\n");
        sb.append("Subarrays: \n");
        for (int[] elem : subarray) {
            sb.append("from index: ").append(elem[0]).append(" to "+ elem[1]);

        }


        return sb.toString();
    }

    


    
}
public class exercises {
 // i am going to use an array to see all the subarrays possible


 public static void AllSubArrays( ArrayList<Integer> list){

    for (int i = 0; i < list.size(); i++) {
        for (int j = i + 1; j < list.size(); j++) {
            System.out.println(list.subList(i, j + 1));
            
        }
        
    }

 }

 
 public static void FinSumSubArrays( ArrayList<Integer> list){

   
    int sum = 0;
    for (int i = 0; i < list.size(); i++) {
        for (int j = i + 1; j < list.size(); j++) {
            for (int num : list.subList(i, j)) {
                sum += num;
            }
            System.out.println(list.subList(i, j) + "= "+ sum);
            sum = 0;
            
            
        }
        
    }

 }

 public static String reverseWords(String input){
    // the main goal here is to: reverse a words in a string.

    String result = input.trim().replaceAll("\\s+", " ");
    // break these to a list
    String[] list = result.split(" ");

    // then i will make a string build
    StringBuilder sb = new StringBuilder();

    // then i will append from the last to the start

    for (int i = list.length - 1; i >= 0; i--) {
        sb.append(list[i]);
        if(i != 0){
            sb.append(" ");
        }
        
           
        //hello..world..

        
    }

    return sb.toString();



 }

 public static find MaximumSumSubArray(ArrayList<Integer> list){
   return null;
 }
 public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    AllSubArrays(list);
    FinSumSubArrays(list);
   System.out.println(MaximumSumSubArray(list));
   System.out.println(reverseWords("hello world"));
    
    
 }
 
}
