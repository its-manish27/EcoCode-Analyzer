public class Fibonacci {

    // Method to generate Fibonacci series up to a given number of terms
    public static void generateFibonacciSeries(int terms) {
        if (terms <= 0) {
            System.out.println("Number of terms must be greater than 0.");
            return;
        }

        // Initialize the first two terms
        int first = 0, second = 1;
        System.out.println("Fibonacci series up to " + terms + " terms:");
        for (int i = 1; i <= terms; i++) {
            System.out.print(first + " ");
            // Calculate the next term
            int next = first + second;
            first = second;
            second = next;
        }
        System.out.println();
    }
    // Main method for testing
    public static void main(String[] args) {
        generateFibonacciSeries(10); // Prints the first 10 terms of the Fibonacci series
    }

    //
}