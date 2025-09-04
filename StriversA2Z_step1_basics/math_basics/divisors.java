package StriversA2Z_step1_basics.math_basics;

import java.util.Scanner;

public class divisors {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int n = sc.nextInt();
            java.util.ArrayList<Integer> divisors = new java.util.ArrayList<>();
            for(int j=1;j*j<=n;j++){
                if(n%j==0){
                    divisors.add(j);
                    if(j != n/j){
                        divisors.add(n/j);
                    }
                }
            }
            java.util.Collections.sort(divisors);
            for(int d : divisors){
                System.out.print(d + " ");
            }
            System.out.println();
                }
                        sc.close();
            }
}
