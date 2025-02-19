
public class stringCompression {
    public static int compress(char[] chars) {
        int writeIndex = 0;
        int counter = 1;
        char letter = chars[0];

        for (int i = 1; i < chars.length; i++) {

            if(chars[i] == chars[i - 1]){

                counter++;
            }
            else{
                writeIndex++;
                chars[writeIndex] = letter;

                if(counter > 1){
                    String countSt = Integer.toString(counter);
                   

                    for (int j = 0; j < countSt.length(); j++) {
                        char countChar = countSt.charAt(j);
                        
                        chars[writeIndex] = countChar;
                        writeIndex++;
                        
                    }
                }
                letter = chars[i];
                counter = 1;
            }

          
        }

        chars[writeIndex++] = letter;

        if(counter > 1){

            String countSt = Integer.toString(counter);
                   

            for (int j = 0; j < countSt.length(); j++) {
                char countChar = countSt.charAt(j);
                
                chars[writeIndex++] = countChar;
                
                
            }

        }

        System.out.println(chars);


        return writeIndex;
    }

    public static void main(String[] args) {
        char[] list = {'a','a', 'b', 'b', 'c' , 'c', 'c'};

        System.out.println(compress(list));



    

    }
    
}
