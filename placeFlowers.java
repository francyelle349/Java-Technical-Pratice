public class placeFlowers {
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
      int count = 0;
      int next = 0;
      int previous = 0;

      for (int i = 0; i < flowerbed.length; i++) {

        if(flowerbed.length == 1){
            if(flowerbed[0] == 0){
                count++;
            }
            else if(flowerbed.length == 1){
                

            }
        }

        // my edge cases 
        if(0 == i){
            if(i + 1 < flowerbed.length && flowerbed[i + 1] == 0 && flowerbed[i] == 0){
                count ++;
                i++;
            }
            
        }
      
     

        else if(i - 1 >= 0 && flowerbed.length - 1 == i && flowerbed[flowerbed.length - 1 ] == 0){
            if(flowerbed[i - 1] == 0){
                count++;
                i++;
                
            }
        }

        

        // if the one i will verify its not the first or the last element
            else if( i + 1 < flowerbed.length && i - 1 < flowerbed.length && flowerbed[i +1] == 0 && flowerbed[i - 1] == 0 && flowerbed[i] == 0){
                
                count ++;
                i++;
            }

        
            if(count >= n){
                return true;
            }



      }

      return count >= n;

    }

    
    public static void main(String[] args) {
        int[] lista = {1};
        System.out.println(canPlaceFlowers(lista, 2));
    }
}
