public class container {
    public static int maxArea(int[] height) {

        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;

        // area =  math.abs(first position - second position) * math.min(height[i], height[j]);

        while(left < right){
            int currentArea = Math.abs(left - right) * Math.min(height[left], height[right]);

            if(currentArea > maxArea){
                maxArea = currentArea;
            }
            if(height[left] < height[right]){
                left++;
            }
            else{
                right --;
            }
            
                
            
          
        }
        return maxArea;
    }
    //idk :()
    public static void main(String[] args) {
        int[] height = {8,7,2,1};

        System.out.println(maxArea(height));
    }
}
