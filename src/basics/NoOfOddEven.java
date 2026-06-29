package basics;
import java.util.Scanner;

public class NoOfOddEven {
    public static void main(String[] args) {
//        int a = 12;
//        int b = 7;
//        int c = 8;
//        int d = 15;
//        int e = 20;
//        int even = 0;
//        int odd = 0;
//
//        if(a % 2 == 0){
//            even++;
//        }
//        else {
//            odd++;
//        }
//        if(b % 2 == 0){
//            even++;
//        }else {
//            odd++;}
//        if(c % 2 == 0){
//            even++;
//        }else {
//            odd++;
//        }
//        if(d % 2 == 0){
//            even++;
//        }else {
//            odd++;
//        }
//        if(e % 2 == 0){
//            even++;
//        }else {
//            odd++;
//        }
//        System.out.println("even : "+even);
//        System.out.println("odd : "+odd);
//    }
//}
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // number of inputs

        int even = 0;
        int odd = 0;

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();

            if (num % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("even : " + even);
        System.out.println("odd : " + odd);
    }
}
//hh