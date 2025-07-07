// triangle stars pattern incrementing to decrementing
package StriversA2Z_step1_basics.problem3;
import java.util.Scanner;

public class pattern9 {
    public pattern9(){
    }
 public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i =0;i<t;i++){
            int n = sc.nextInt();
            System.out.println(n + ": ");
           for (int j = 1; j <= n; j++) {
            for (int k = 1; k <= n - j; k++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * j - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower Half
        for (int j = n - 1; j >= 1; j--) {
            for (int k = 1; k <= n - j; k++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * j - 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
     sc.close();

}
}


