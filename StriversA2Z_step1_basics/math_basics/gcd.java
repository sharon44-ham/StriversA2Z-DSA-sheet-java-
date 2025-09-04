package StriversA2Z_step1_basics.math_basics;
import java.util.Scanner;
public class gcd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            // Euclidean algorithm for GCD
            while(b != 0){
                int temp = b;
                b = a % b;
                a = temp;
            }
            System.out.println(a);
        }
        sc.close();
    }
}

