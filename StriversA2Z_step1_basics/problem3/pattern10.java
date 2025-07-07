package StriversA2Z_step1_basics.problem3;
import java.util.Scanner;
public class pattern10 {
    public pattern10(){
    }
 public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i =0;i<t;i++){
            int n = sc.nextInt();
            System.out.println(n + ": ");
            for(int j = 1;j<=2*n-1;j++){
                int stars = j;
                  if (j>=n) stars=2*n-j; 
                for(int k=1;k<=stars; k++) {
                    System.out.print("*");
                }
                System.out.println(" ");
            }
}
 sc.close();
 }

}