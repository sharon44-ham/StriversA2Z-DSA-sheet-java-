package StriversA2Z_step1_basics.math_basics;

import java.util.Scanner;

public class prime {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for(int i =0;i<t;i++){
            int n= sc.nextInt();
            int cnt = 0; // Moved here — count for this number
             for (int j = 1; j * j <= n; j++) {
                if (n % j == 0) { // j is a divisor
                     cnt++; // count j
                if (j != n / j) { // count its pair (avoid double count for squares)
                    cnt++;
            }
        }
    }

    if (cnt == 2) {
        System.out.println("prime");
    } else {
        System.out.println("not prime");
    }
    System.out.println();
}
sc.close();
    }
}
