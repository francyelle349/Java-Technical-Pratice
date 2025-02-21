
import java.util.ArrayList;


class StringIntPair{

    String letter;
    int number;

    public StringIntPair(String letter, int number){
        this.number = number;
        this.letter = letter;

    }

    public String toString(){
        return "("+ letter + ", "+number+")";
    }

    
    
        
}

public class countEquals {
    // a a a b b = 3 a's and 2 b's

  
  

    public static void main(String[] args) {
        int counter = 1;

        ArrayList<String> lista = new ArrayList<>();
        lista.add("h");
        lista.add("h");
        lista.add("h");
        lista.add("e");
        lista.add("e");

        ArrayList<StringIntPair> listaPair = new ArrayList<>();

        String letter = "";

        ArrayList<Integer> listaInt = new ArrayList<>();
        for (int i = 1; i < lista.size(); i++) {
            if(lista.get(i) == lista.get(i - 1)){
                counter++;
                letter = lista.get(i);

            }
            else{
                
        StringIntPair str = new StringIntPair(lista.get(i), counter);

                listaPair.add(str);
                listaInt.add(counter);
                counter = 1;

            }

        
            
        }

        
        StringIntPair str = new StringIntPair(letter, counter);

                listaPair.add(str);

        listaInt.add(counter);

        System.out.println(listaInt.toString());
        System.out.println(listaPair.toString());

        
    }
    
}

