
import java.util.ArrayList;

public class reverseWord{
    public static String reverseWords(String s) {
        // the main goal it is to reverse a Words in string
        //see if the phrase has multiple spaces and reduce it
        // see if it has leading or trailing spaces, verify it.
        
        String trimmed = s.trim();

        String result = trimmed.replaceAll("\\s+", " ");

        ArrayList<String> lista = new ArrayList<>();

       String[] listaStr = result.split(" ");

       for(int i = listaStr.length - 1 ; i >= 0 ; i--){
       lista.add(listaStr[i]);

       }

       StringBuilder sb = new StringBuilder();

       for(int i = 0; i < lista.size(); i++){
        sb.append(lista.get(i) + " ");
        
       }



        return sb.toString();

        

        
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("   hello   world"));
    }
}