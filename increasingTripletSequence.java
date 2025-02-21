
import java.util.ArrayList;

public class increasingTripletSequence{
    public static boolean increasingTriplet(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();

        // edge case
        if(nums.length < 3){
            return false;
        }
        int firstNumber = Integer.MAX_VALUE;
        int secondNumber = Integer.MAX_VALUE;

        //[1,2,3,4] [3,9,10] [9,3,10]
for (int elem : nums) {
    if(elem <= firstNumber){
        firstNumber = elem;
    }
    else if(elem <= secondNumber){
        secondNumber = elem;

    }
    else{
        return true;
    }
    
}
return false;
}

       public static void main(String[] args) {
        int[] list = {2,1,5,0,3};
        System.out.println(increasingTriplet(list));
       }


    }

    
