import java.util.Scanner;

public class FactorialCalculator {

    // Method to calculate the factorial of a number
    public static long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1; // Base case: factorial of 0 or 1 is 1
        }
        long factorial = 1;
        for (int i = 2; i <= n; i++) {
            factorial *= i; // Multiply each number from 2 to n
        }
        return factorial;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner for user input
        
        System.out.println("Welcome to the Factorial Calculator!");
        System.out.println("This program calculates the factorial of a given number.");
        
        while (true) { // Infinite loop to allow multiple calculations
            System.out.print("\nEnter a non-negative integer (or type 'exit' to quit): ");
            String input = scanner.nextLine(); // Read user input
            
            // Check if the user wants to exit
            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Exiting the program. Goodbye!");
                break; // Exit the loop
            }
            
            try {
                int number = Integer.parseInt(input); // Convert input to an integer
                
                if (number < 0) {
                    System.out.println("Please enter a non-negative integer.");
                } else {
                    long result = calculateFactorial(number); // Calculate the factorial
                    System.out.println("The factorial of " + number + " is: " + result);
                }
                
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a valid integer.");
            }
        }
        
        scanner.close(); // Close the Scanner
    }


}