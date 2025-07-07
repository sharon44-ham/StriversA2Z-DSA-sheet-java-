package StriversA2Z_step1_basics.problem3;
import java.util.Scanner;
public class pattern13{
   public pattern13(){
   }

   public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
     int t = sc.nextInt();
     int a =1;
        for(int i =0;i<t;i++){
            int n = sc.nextInt();
            System.out.println(n + ": ");
            for(int j = 1;j<=n;j++){
                for(int k =1 ;k<=j;k++){
                    System.out.print(a + "");
                    a= a+1;
                }
                            System.out.println(" ");

            }
        }
        sc.close();
    }
}