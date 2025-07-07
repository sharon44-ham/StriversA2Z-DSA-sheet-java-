package StriversA2Z_step1_basics.problem3;
import java.util.Scanner;
public class pattern19 {
    public pattern19(){
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        for(int i =0;i<t;i++){
            int n =sc.nextInt();
            System.out.println(n + ":");
            for(int j = 1;j<=2*n;j++){;
                if(j<=n){
                      for(int k = 1; k <=n-j+1; k++){
                    System.out.print("*");
                }
                for(int k = 1; k <= 2*j-2; k++){
                    System.out.print(" ");
                }
                for(int k = 1; k <= n-j+1; k++){
                    System.out.print("*");
                }

                } else {
    for (int k = 1; k <= j-n; k++) {
        System.out.print("*");
    }
    for (int k = 1; k <= 2 * (2*n-j); k++) {
        System.out.print(" ");
    }
    for (int k = 1; k <= j-n; k++) {
        System.out.print("*");
    }
        }
        System.out.println(" ");
    }
}
            sc.close();

}
}
