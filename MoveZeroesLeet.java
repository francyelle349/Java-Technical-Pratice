public class MoveZeroesLeet{
    public static void moveZeroes(int[] nums) {

        // the goal is to move the zeroes to the end of the list.
        // in-place approach

        int counter = 0;
        int insert = 0;
       
        // [0,0,1,2] == [1,2,0,0]

        while(counter < nums.length) {

            if(nums[counter] != 0){
               nums[insert] = nums[counter];
               insert++;
            }
                       // 0, 0 , 1, 2 - 0,1,0,2 -->     2 zeros,
          // find a zero and move to the end of the list
        counter++;

        

        }

        while(insert < nums.length) {
            nums[insert] = 0;
            insert++;

        }



       for (int elem : nums) {
           System.out.println(elem);
       }
      


    }

    public static void main(String[] args) {
        System.out.println("hello world");

        int[] nums = {0,1,2,0};

        moveZeroes(nums);
    }
    
}