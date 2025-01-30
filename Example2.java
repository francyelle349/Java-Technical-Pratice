public class Example2 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4};

        // Nested loops (O(N²))
        for (int i = 0; i < numbers.length; i++) { // Outer loop
            for (int j = 0; j < numbers.length; j++) { // Inner loop
                System.out.println("Pair: (" + numbers[i] + ", " + numbers[j] + ")");
            }
        }
    }
}
