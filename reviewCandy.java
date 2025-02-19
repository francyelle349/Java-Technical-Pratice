import java.util.ArrayList;
import java.util.List;

public class reviewCandy {
     public static  List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();

        if(candies.length == 0){
            return result;
        }
        int max = candies[0];
        // to discover the number max
        for (int i = 1; i < candies.length; i++) {
            if(max < candies[i]){
                max = candies[i];
    
            }
           
        }

        

        for (int i = 0; i < candies.length; i++) {
            if(max < candies[i] + extraCandies){
                result.add(true);
    
            }
            else{
                result.add(false);
            }
           
        }
        return result;
     }
    public static void main(String[] args) {
        int[] result = {1,2,3,4};
        

        System.out.println(kidsWithCandies(result, 3));
    }
    
}
