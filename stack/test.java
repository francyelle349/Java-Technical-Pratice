
package stack;

// Erroneous code to demonstrate the use of continue statement

public class test {
    public static void main(String[] args) {
        int j = 0;
        int k = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println(", j: "+ j++);
            System.out.print(" k: "+ ++k);
            
        }
    }
}
// j++ --> update after
// ++k --> update before
