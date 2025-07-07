package StriversA2Z_step1_basics.math_basics;
import java.util.Scanner;

public class countdigits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++){
            int n = sc.nextInt();
            int count = 0;
            while(n>0){
                n=n/10;
                count++;
            }
            System.out.println(count);
        }
        sc.close();
    }
}

//in this the time complexity is O(log n) and space complexity is O(1)
// The time complexity is O(log n) because the number of digits in a number n is proportional to log(n) in base 10.
// The space complexity is O(1) because we are using a constant amount of space for variables like `count` and `n`, regardless of the size of the input number.