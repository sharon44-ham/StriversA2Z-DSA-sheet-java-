package StriversA2Z_step1_basics.math_basics;

import java.util.Scanner;

public class reversedigits {
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++){
            int n = sc.nextInt();
            int rev=0;
            while(n>0){
            int lastdig=n%10;
            rev = (rev*10) + lastdig;
            n=n/10;
            }
            System.out.println(rev);

    }
    sc.close();    
}
}
// The time complexity of this code is O(log n) because the number of digits in a number n is proportional to log(n) in base 10.
// The space complexity is O(1) because we are using a constant amount of space for variables like `rev`, `lastdig`, and `n`, regardless of the size of the input number.
// This means that the space used does not grow with the size of the input number, making it efficient in terms of space usage.

