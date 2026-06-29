package Loops;

public class PrimeNoSpecificRange {
    public static void main(String[] args) {
        int start = 10;
        int end = 50;
        int primeCount = 0;

        System.out.print("Prime numbers between " + start + " and " + end + ": ");

        for (int num = start; num <= end; num++) {
            int factors = 0;

            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    factors++;
                }
            }

            if (factors == 2) {
                System.out.print(num + " ");
                primeCount++;
            }
        }

        System.out.println("\nTotal number of primes found = " + primeCount);
    }
}
