
import java.util.ArrayList;

public class reverseVowel {
    public static  Boolean ItsVowel(String letter){
       String[] list = {"a", "e", "i", "o", "u"};

       

        for(String i : list)
        {
            if( letter.toLowerCase().equals(i)){
                return true;
            }

        }

        return false;

       
    }
    public static String reverseVowels(String s) {

        ArrayList<String> lista = new ArrayList<>();

        String[] listaS = s.split("");



        for(int i = listaS.length - 1; i >= 0 ; i--){
           if(ItsVowel(listaS[i])){
            lista.add(listaS[i]);
           }

            

        }


        int count = 0;

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < listaS.length; i++) {
            if(ItsVowel(listaS[i])){

                listaS[i] = lista.get(count);

                count++;   
                
            }

            sb.append(listaS[i]);

            
        }

    return sb.toString();


        
    }

    public static void main(String[] args) {
        System.out.println(reverseVowels("leetcode"));
    }
}
