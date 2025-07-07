// simple pattern
package StriversA2Z_step1_basics.problem3;
import java.util.Scanner;

public class pattern1{
    public pattern1(){
    }
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            for(int i = 0;i < t; i++){
                int n = sc.nextInt();
                System.out.println(n);
            
                for(int j=0;j<n;j++){
                    for(int k=0;k<n;k++){
                        System.out.print("*");
                    }
                    System.out.println(" ");
                }

            }
            sc.close();

        }
}
