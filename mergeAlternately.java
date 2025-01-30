public class mergeAlternately{
    public static String mergeAlternately(String word1, String word2) {
        // str1 = "ab" str2 = "cd"

        // str3 = "acbd"

        // if its longer?

        // str1 = "abc" str2 = "de"

        // str 1 = "cd" str2 = "sdfe"

        // str3 = "adbec"

        // lets make a variable = Math.max(words1, words2).

        // a loop with variable

        // max = 3
        int maxLength = Math.max(word1.length(), word2.length());
        StringBuilder sb = new StringBuilder(); // word1 = "abc"
        // word2 = "de"
        // 

        // a 
        // d
        // sb = ad 0

        // 1 - b 
        // e 
        // s b= adbe

        // 2 - c 
        // word2 - out of letters (its not going to run)
        // sb = adbec


        for(int i = 0; i < maxLength; i++){

            if (i <= word1.length() - 1) {
                char letter = word1.charAt(i);
                sb.append(letter);

                
            }
            if (i <= word2.length() - 1) {
                char letter = word2.charAt(i);
                sb.append(letter);
                
            }

            // take a single character of word1 and put in the sb.
            // take a single character of word2 and put in the sb.

            // If the condition of both are true, then its going to execute the both 
            // of them

            
            // inside the loop i will keep track 
            // of the alternately.


        }


        return sb.toString();
        

        
        
    }
    public static void main(String[] args) {

       String str1 = "abcd";

       System.out.println(str1.length());

       System.out.println(mergeAlternately("abc", "de"));

      // adbec

    }
}