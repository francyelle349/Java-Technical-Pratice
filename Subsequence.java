public class Subsequence {
    public static boolean isSubsequence(String s, String t) {
        StringBuilder sb = new StringBuilder();
        char current;
        int count = 0;
       if(s.isEmpty()){
        return false;
       }

        for (int i = 0; i < t.length(); i++) {
             current = s.charAt(count);
            if(current == t.charAt(i)){
                sb.append(current);
               if(count < s.length()-1){
                count++;
               }
                
            }
          
             
            }
            System.out.println(sb.toString());

        return sb.toString().equals(s);
            
       

       

    }

    public static void main(String[] args) {
        System.out.println(isSubsequence("b", "ahbgdc"));
    }
}

// conditions: its lowercase letters
// ex: abc = ac = true. ba = false.



