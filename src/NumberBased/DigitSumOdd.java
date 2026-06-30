package NumberBased;

public class DigitSumOdd {
    static void main(String[] args) {
        int num = 123456;
        int sum = 0;

        while (num != 0) {
            int digit = num % 10;
            num /= 10;

            if (digit % 2 != 0) {
                sum += digit;
            }
        }
        System.out.println(sum);
    }
}
