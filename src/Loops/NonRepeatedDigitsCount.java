package Loops;

public class NonRepeatedDigitsCount {
    public static void main(String[] empty) {
        int number = 1015;

        String str = String.valueOf(Math.abs(number));
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (str.indexOf(ch) == str.lastIndexOf(ch)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
