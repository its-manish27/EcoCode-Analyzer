import java.util.Arrays;

public class PrimeGenerator {

    // Method to generate all prime numbers up to a given limit using the Sieve of Eratosthenes
    public static void sieveOfEratosthenes(int limit) {
        if (limit < 2) {
            System.out.println("No prime numbers less than 2.");
            return;
        }

        // Create a boolean array to mark prime numbers
        boolean[] isPrime = new boolean[limit + 1];
        Arrays.fill(isPrime, true); // Assume all numbers are prime initially
        isPrime[0] = isPrime[1] = false; // 0 and 1 are not prime

        // Mark non-prime numbers
        for (int i = 2; i * i <= limit; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= limit; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        // Print all prime numbers
        System.out.println("Prime numbers up to " + limit + ":");
        for (int i = 2; i <= limit; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    // Main method for testing
    public static void main(String[] args) {
        sieveOfEratosthenes(50);  // Prints all prime numbers up to 50

    }
}