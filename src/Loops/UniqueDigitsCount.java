package Loops;

public class UniqueDigitsCount {
    public static void main(String[] args) {

        int num = 10151;
        String s = String.valueOf(num);
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (s.indexOf(ch) == s.lastIndexOf(ch)) {
                count++;
            }
        }
        System.out.println("Number of unique digits = " + count);
    }
}