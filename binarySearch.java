public class binarySearch{
    public static int binarySearching(int[] list, int target){
        int start = 0;
        int end = list.length - 1;

        // main goal: return the index of the number i want to find

        while(start <= end){
            int middle = start + (end - start) / 2;

            // the 3 conditions

            if(list[middle] == target){
                return middle;
            }
            if(target > list[middle] ){
                start = middle + 1;
            }
            else{
                end = middle - 1;
            }

           
        }
        return -1;

    }

    public static void main(String[] args) {
        int[] list = {1,2,3,4,5,6};
        System.out.println(binarySearch.binarySearching(list, 4));
    }
}