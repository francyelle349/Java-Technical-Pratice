public class maximumProductSubArray {
    public static int maxProduct(int[] nums) {
        // " what contributes to the maximum subarray each step"
        int total = nums[0];
        int maxEnding = nums[0];
        int minEnding = nums[0];

        for (int i = 1; i < nums.length; i++) {

          
         
           if(nums[i] < 0){
            int temp = maxEnding;
            maxEnding = minEnding;
            minEnding = temp;
           }

            maxEnding = Math.max(maxEnding * nums[i], nums[i]);
            minEnding = Math.min(minEnding * nums[i], nums[i]);

            total = Math.max(total, maxEnding);
            

    

            
        }

        return total;
    }

    public static void main(String[] args) {
        int[] list = {2,3,-2,4};
        System.out.println(maxProduct(list));

        
    }
}
