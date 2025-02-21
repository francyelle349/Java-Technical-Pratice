import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
      int[] answer = new int[1 * nums.length];

      int prefix = 1;

      for(int i = 0 ; i < nums.length ; i++){
        answer[i] = prefix;
        prefix *= nums[i];
      }

      //--------------------------------------


      int suffix = 1;

      for(int i = nums.length - 1 ; i >= 0 ; i--){
        answer[i] *= suffix;
        suffix *= nums[i];
        
      }


      return answer;

      

    }

    public static void main(String[] args) {
        int[] nums = {2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }
}