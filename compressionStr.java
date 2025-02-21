public class compressionStr {
    
    public static int compress(char[] chars) {
     int index = 0;
     int counter = 1;
     char letter = chars[0];

     for (int i = 1; i < chars.length; i++) {
        if(chars[i] == chars[i-1]){
            counter++;
        }
        else{
            chars[index] = letter;
            index++;

            if(counter > 1){
                String counterStr = Integer.toString(counter);

                for (int j = 0; j < counterStr.length(); j++) {
                    chars[index++] = counterStr.charAt(j);
                    
                }
            }
            letter = chars[i];
            counter = 1;
        }
         
     }

     chars[index] = letter;
     index++;

     if(counter > 1){
         String counterStr = Integer.toString(counter);

         for (int j = 0; j < counterStr.length(); j++) {
             chars[index++] = counterStr.charAt(j);
             
         }
     }

     System.out.println(chars);

     return index;


}

public static void main(String[] args) {
    char[] list = {'a','a','b','b','c'};
    compress(list);
}
    

}