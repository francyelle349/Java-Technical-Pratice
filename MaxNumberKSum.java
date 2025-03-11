import java.util.Arrays;

public class MaxNumberKSum {
    public static int maxOperations(int[] nums, int k) {
        // sort the array first
        Arrays.sort(nums);
        
        int left = 0;
        int right = nums.length - 1;
        int counter = 0;

        while(left < right) {
            int sum = nums[left] + nums[right];

            if(sum == k){
                
                left++;
                right--;
                counter++;
            }
            // if the sum is bigger than k
            else if(sum > k){       
                right--;
            }
            else{
                left++;
            }

            
        }

        
        return counter;
    }

    public static void main(String[] args) {

        int[] nums = {1,2,3,4};
        System.out.println( MaxNumberKSum.maxOperations(nums, 5));
    }
}

