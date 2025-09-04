package StriversA2Z_step1_basics.math_basics;

import java.util.Scanner;

public class amstrong {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int n = sc.nextInt();
            int original = n;
            int temp = n;
            int sum = 0;
            int k = 0;
            while(temp > 0){
                temp = temp / 10;
                k++;
            }
            temp = n; // reset temp to n for digit extraction
            while(temp > 0){
                int ld = temp % 10;
                sum = sum + (int)Math.pow(ld, k);
                temp = temp / 10;
            }
            if(sum == original){
                System.out.println("true");
            }
            else{
                System.out.println("false");
            }   
           
        }
        sc.close();
    }
}


