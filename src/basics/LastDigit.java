package basics;

import java.util.Scanner;

public class LastDigit {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int lastDigit = n % 10;
        System.out.println(lastDigit);
    }
}
