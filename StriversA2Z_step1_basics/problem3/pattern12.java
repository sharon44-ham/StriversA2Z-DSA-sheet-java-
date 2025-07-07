package StriversA2Z_step1_basics.problem3;
import java.util.Scanner;
public class pattern12{
   public pattern12(){
   }

   public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
     int t = sc.nextInt();
        for(int i =0;i<t;i++){
            int n = sc.nextInt();
            System.out.println(n + ": ");
            
            for(int j=1;j<=n;j++){
                for(int k =1;k<=j;k++){
                    System.out.print(k);
                }

                for(int s =1;s<=2*(n-j);s++){
                System.out.print(" ");
                }

                for(int k=j;k>=1;k--){
                    System.out.print(k);
                }
                                System.out.println(" ");
            }

        }
        sc.close();
    }
}