package StriversA2Z_step1_basics.problem3;
import java.util.Scanner;

public class pattern15 {
    public pattern15(){

    }
     public static void main(String[] args){
        // testcases
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
       for(int i =0;i<t;i++){
            int n = sc.nextInt();
            System.out.println(n + ": ");

        // solution
        for(int j =0;j<n;j++){
            for(char ch ='A';ch<='A'+ (n-j-1);ch++){
                System.out.print(ch);
            }
            System.out.println(" ");
        }
       }
       sc.close();
       }    
}
