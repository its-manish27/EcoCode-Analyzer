// Summary: The code implements the Sieve of Eratosthenes efficiently, achieving O(n log log n) time complexity. However, memory usage can be optimized by utilizing a bitset instead of a boolean array for larger limits, as the current implementation uses a boolean array which may become memory-intensive. For smaller limits, the memory usage is acceptable.
// Green Points: memory_usage_point: 8, time_efficiency_point: 9

// Summary: The code implements the Sieve of Eratosthenes efficiently, achieving O(n log log n) time complexity. However, memory usage can be optimized by utilizing a bitset instead of a boolean array for larger limits, as the current implementation uses a boolean array which may become memory-intensive. For smaller limits, the memory usage is acceptable.
// Green Points: memory_usage_point: 8, time_efficiency_point: 9

// Summary: The code implements the Sieve of Eratosthenes to generate prime numbers, which is efficient in both time (O(n log log n)) and space. However, the memory usage can be improved by using a bitset instead of a boolean array for large limits, as it would reduce memory consumption while maintaining operational efficiency. Additionally, for smaller limits, the current implementation is acceptable, balancing simplicity and performance.
// Green Points: memory_usage_point: 8, time_efficiency_point: 9

// Summary: The code uses the Sieve of Eratosthenes algorithm, which is efficient in both time and space for generating prime numbers. Memory usage is primarily due to the boolean array marking prime numbers, which is optimal for this approach. However, the memory efficiency could be improved by using a bitset if the limit is significantly large, as it consumes less memory than a boolean array. The time complexity is O(n log log n), which is appropriate for the input size being tested.
// Green Points: memory_usage_point: 8, time_efficiency_point: 9

import java.util.Arrays;

public class PrimeNumber {

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
        //change
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