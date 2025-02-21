public class greatestTwo {
    public static String gcdOfStrings(String str1, String str2) {
        int len1 = str1.length(); // 6
        int len2 = str2.length();// 3
        int max = Math.max(len1, len2);
        int min = Math.min(len1, len2);
    

        while(len2 != 0){
            if (len1 < len2) {
                int var = len2;
               len2 = len1;
               len1 = var;
            }
            if(len1 >= len2){
                int r = len1 % len2;
                len1 = len2; //3
                len2 = r; // 0
              
            }
       
        }

        int gcd = len1;
        StringBuilder sb = new StringBuilder();
        int counter = 0;

        for (int i = 0; i < max; i++) {
           if(i < min){
            if(counter ==gcd){
                break;
             }
             if(str1.charAt(i) == str2.charAt(i)){
                
                sb.append(str1.charAt(i));
                counter++;
             }
             


           }
        }

        StringBuilder strBuilder = new StringBuilder();
        StringBuilder strBuilder2 = new StringBuilder();
        String subs = str1.substring(0, gcd);

        int numAppends = str1.length() % subs.length();
        int appendsStr = str1.length()/subs.length();

        for (int i = 0; i < appendsStr ; i++) {
            strBuilder.append(subs);

          
           
        }

        
        int numAppends2 = str2.length() % subs.length();
        int appendsStr2 = str2.length()/subs.length();

        for (int i = 0; i < appendsStr2 ; i++) {
            strBuilder2.append(subs);

          
           
        }


        // ABABAB AB = 6/2 = 3 -2
        // 
        if(numAppends != 0){
                strBuilder.append(subs.substring(0, numAppends ));
        }
        
        System.out.println(strBuilder.toString());
        System.out.println(strBuilder2.toString());
        Boolean state = false;

        if(strBuilder.toString().equals(str1) && strBuilder2.toString().equals(str2)){
            state = true;
        }


        System.out.println(len1);

       if(state){
        return sb.toString();

       }
       else{
        return "";
       }






    }

    public static void main(String[] args) {
        System.out.println(gcdOfStrings("ABABAB", "AB"));
    }
}
