import java.util.ArrayList;
import java.util.List;

public class greatestNumber {

      public static  List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        // the main goal here its to return which number is the maximum number of candies based on the extra candies number
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Boolean> listBool = new ArrayList<>();
       int max = candies[0] + extraCandies;
      
       for (int i = 0; i < candies.length; i++) {
          if(candies[i] > max){
            max = candies[i];
          }
           
       }

        for(int i = 0; i < candies.length ; i++)
        {
          if(candies[i] + extraCandies <= max ){
            listBool.add(i, false);
          }
          else if(candies[i] + extraCandies >= max){
            listBool.add(i, true);


          }
         
        }  
            
        System.out.println(max);
      return listBool;
         
    }
    
    public static void main(String[] args) {
      int[] list = {1,2,3,4,5, 10, 11, 12};
      System.out.println(kidsWithCandies(list, 3));
    }
}


