class greatestCommon {
    public static String gcdOfStrings(String str1, String str2) {
    // its going to return basically the largest string that divides both str1 and str2
    // and the common divisor needs to be a prefix of each string
    // compare each string and see if they are equal
    // if they are increment in a new variable
    // we need to see the length of each string, and find their large common divisor
    // if they divide them increment, if not 
    // use eclidean algorithm

    int lengthStr1 = str1.length();
    int lengthStr2 = str2.length();
    StringBuilder sb = new StringBuilder();
    StringBuilder sb2 = new StringBuilder();

    int maxLength = Math.max(lengthStr1, lengthStr2) - 1;
    int remainder = 0;
    int number1 = lengthStr1;
    int number2 = lengthStr2;


  
    while (number2 != 0  ){
       if(number1 >= number2 && number2 != 0){
             remainder = number1 % number2;
             number1 = number2;
             number2 = remainder;
        }
      
        

    }
   

   // GDC - I needto take the prefix taking the total number of GDC 
   // and compare if str1 and str2 repeat itself using this prefix

   String substring = str1.substring(0, number1);



   // now i will check if both strings can be made using this substring

   // i can use the str1.length.

   // how many times can i concatenate until reachs the str1.lenght?

   while(sb.toString().length() != str1.length()){
    sb.append(substring);
   }

   while(sb2.toString().length() != str2.length()){
    sb2.append(substring);
   }

   if(sb.toString().equals(str1) && sb2.toString().equals(str2)){
    return substring;
   }
   else{
    return "";
   }




        



 
}

public static void main(String[] args) {
    System.out.println(gcdOfStrings("LEET", "CODE"));
}

}