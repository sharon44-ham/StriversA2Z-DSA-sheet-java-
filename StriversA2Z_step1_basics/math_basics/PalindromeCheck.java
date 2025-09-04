package StriversA2Z_step1_basics.math_basics;
import java.util.Scanner;
public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int temp = n;
            int rev = 0;
            while (n > 0) {
                int lastDig = n % 10;
                rev = rev * 10 + lastDig;
                n = n / 10;
            }
            if (temp == rev) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }
        sc.close();
    }
}
