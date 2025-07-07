package StriversA2Z_step1_basics.problem3;
import java.util.Scanner;

 
 public class pattern16{
    public pattern16(){

    }
        public static void main(String[] args){
        // testcases
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
       for(int i =0;i<t;i++){
            int n = sc.nextInt();
            System.out.println(n + ": ");

        // solution
            for(int j = 0;j<n;j++){
                char ch =  (char)('A' +j);
                for(int k = 0;k<=j;k++){
                    System.out.print(ch);
                } 
                   System.out.println(" ");
            }
        }
         sc.close();

 }
}
 
 
 
 
     