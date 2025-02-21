package subarray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subArray {
    //Given an integer array nums, find the subarray
 // with the largest sum, and return its sum.

 public static int sumArray(int[] nums) {

   int sum = 0;

    // why??


    for (int i = 0; i < nums.length; i++) {


      // if a certain element is 0;

      if(nums[i] == 0){
        continue;
      };

      sum += nums[i];

      
        
    }
    
    return sum;
        
 }

 public static int MaximumElement(int[] nums) {

  int max = nums[0];

  for (int i = 1; i < nums.length; i++) {

    if(nums.length == 1){
      return max;
    }
    
    if(nums[i] > max){
      max = nums[i];

    }

    
      
  }
  return max;
 }

 public static int SumSubArray(int[] nums, int firstIndex, int secondIndex) {
 

  // definition of an subArray: A subarray is a contiguous part of an array. 
  //It is a sequence of elements from the array that are consecutive
  // and maintain their original order. 

  int sum = 0;

  for (int i = firstIndex; i <= secondIndex; i++) {
    sum += nums[i];
      
  }

  return sum;
 }

 public static int[] AllSubArrays(int[] nums) {

  int start = 0;
  int end = 0;

  List<int[]> list = new ArrayList<>();
  // convert later
  
  
  

  

//the main goal is to find all the possible subArrays in a array;
 


  for ( start = 0; start < nums.length; start++) {
      for (end = 0; end < nums.length; end++) {
        int[] subArray = Arrays.copyOfRange(nums, 1, 2);
        
          
      }
  }




  return nums;

 }


public static void main(String[] args) {
  int[] list = {-1, 3, 7};
   System.out.println(sumArray(list));
   System.out.println(MaximumElement(list));
   System.out.println(SumSubArray(list, 0, 2));
   System.out.println(Arrays.toString(AllSubArrays(list)));

}

}
