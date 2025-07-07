package StriversA2Z_step1_basics.problem3;
import java.util.Scanner;
public class pattern18 {
    public pattern18(){

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        for(int i =0;i<t;i++){
            int n =sc.nextInt();
            System.out.println(n + ":");
            for(int j = 0; j < n; j++){
                char ch = (char)('E' - j);
                for(int k = 0; k <= j; k++){
                    System.out.print((char)(ch + k));
                
                }
                System.out.println(" ");
            }
            }
        sc.close();

        }
}
