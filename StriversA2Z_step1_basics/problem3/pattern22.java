package StriversA2Z_step1_basics.problem3;
import java.util.Scanner;
public class pattern22{
      public pattern22(){

    }
      public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++){
           int n =sc.nextInt();
            System.out.println(n + ":");
          int size = 2 * n - 1;
            for(int j = 0; j < size; j++) {
                for(int k = 0; k < size; k++) {
                    int num = n - Math.min(Math.min(j, k), Math.min(size - 1 - j, size - 1 - k));
                    System.out.print(num);
                }
                System.out.println();
                 }
            }
        sc.close();
        }
    }