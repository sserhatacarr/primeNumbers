public class Main {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++) {
            boolean isPrime = true; // We assume each number is prime by default.

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false; // If the number is divisible by another number, it's not prime.
                    break; // Exit the loop.
                }
            }

            if (isPrime) {
                System.out.println(i + " is a prime number.");
            }
        }
    }
}
