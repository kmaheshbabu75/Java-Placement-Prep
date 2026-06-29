package Loops;

public class NthFibonacci {

    public static void main(String[] args) {

        int n = 5;

        int previous1 = 0;
        int previous2 = 1;
        int current = 0;

        for (int i = 2; i <= n; i++) {
            current = previous1 + previous2;
            previous1 = previous2;
            previous2 = current;
        }

        if (n == 0) {
            System.out.println(previous1);
        } else if (n == 1) {
            System.out.println(previous2);
        } else {
            System.out.println(current);
        }
    }
}

//modified123
