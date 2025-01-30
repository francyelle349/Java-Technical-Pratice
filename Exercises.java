
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Exercises {
 String personAge(int age){
    if(age < 18){
       return "Adulto";
    }
    else{
        return "minor";
        }
 }
 void listMovies(String[] movies){
    for(String i: movies){
        System.out.println(i);
    }
 }

 int square(int number){
    return number * number;

 }

 String yourName(String name){
    return String.format("Hello %s", name);
 }

 int sum(){
    int var = 0;
    for (int i = 1; i <= 10; i++) {
        var += i;
        
    }

    return var;

}

static int  largestNumber(int[] listIntegers){
    int num = 0;
    for(int i : listIntegers){

        if(num == 0){
            num = i;
        }
        else if(i > num){
            num = i;
        }
      
    }

    return num;

}

static boolean palindrome(String phrase){
    boolean state = false;
    String var = "";
    for(int i = phrase.length() - 1; i >= 0; i--){
        var += phrase.charAt(i);
    }

    System.out.println(var);

    if(phrase.equals(var)){
        state = true;
    }
    
    return state;
}
static void calculator(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Chosee your option: ");
    System.out.println("1- Add, 2- Subtract, 3- Multiply, 4- Divide");

    System.out.print("First Number: ");
    double firstNumber = sc.nextDouble();
    System.out.print("Second Number: ");
    double secondNumber = sc.nextDouble();
    double result = 0;
   
    System.out.print("Choose your option: ");

    int option = sc.nextInt();

    switch (option){
        case 1:

        result = firstNumber + secondNumber;
            
        break;

    case 2:
    result = firstNumber - secondNumber;

        break;
    
    case 3:
    result = firstNumber / secondNumber;
        break;

    default:
        break;
    }

    System.out.println("Result: "+ result);
     
    }


    static ArrayList<Integer> fibonacciSequence(){
        int firstNumber = 0;
        int secondNumber = 1;
        int sum = firstNumber + secondNumber;

        ArrayList<Integer> list = new ArrayList<>();
       
        for(int i = 0; i < 10; i++){

            list.add(sum);
             sum = firstNumber + secondNumber;
            
            firstNumber = secondNumber;
            secondNumber = sum;
        }
        

        return list;




        
    }


    

    static void authentication(String username, String password){
        HashMap<String, String> usersAuth = new HashMap<>();

        usersAuth.put("guy", "123");
        usersAuth.put("Person2", "Livro123");
        usersAuth.put("Cup234", "4444");


       


            if( usersAuth.containsKey(username) && usersAuth.containsValue(password)){
                System.out.println("user authenticated");
                
            }
            else{
                System.out.println("not authent");
                
            }
        




    }

public static void main(String[] args) {
  
System.out.println(palindrome("hello"));

System.out.println(fibonacciSequence());
Scanner sc = new Scanner(System.in);

System.out.println("login: ");
String login = sc.next();
System.out.println("password: ");
String password = sc.next();

authentication(login, password);

sc.close();
}
}
 



