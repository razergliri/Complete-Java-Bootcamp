public class PrimeNumbers {
    public static void main(String[] args) {
        // Declare an array to store prime numbers
        int[] primes = new int[15]; // There are 15 prime numbers between 1 and 50

        // Counter for the number of primes found
        int primeCount = 0;

        // Loop through numbers from 2 to 50
        for (int num = 2; num <= 50; num++) {
            // Check if num is prime
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            // If num is prime, add it to the array
            if (isPrime) {
                primes[primeCount] = num;
                primeCount++;
            }
        }

        // Print the prime numbers stored in the array
        System.out.println("Prime numbers between 1 and 50:");
        for (int i = 0; i < primeCount; i++) {
            System.out.print(primes[i] + " ");
        }
    }
}
