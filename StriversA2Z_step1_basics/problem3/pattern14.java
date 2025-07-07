package StriversA2Z_step1_basics.problem3;
import java.util.Scanner;

public class pattern14 {
    public pattern14(){
        
    }
    public static void main(String[] args){
        // testcases
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
       for(int i =0;i<t;i++){
            int n = sc.nextInt();
            System.out.println(n + ": ");

        // solution
            for(int j=1;j<=n;j++){
                for(char ch = 'A';ch<='A'+j;ch++){
                    System.out.print(ch);
                }
                System.out.println(" ");
            }
    }
 sc.close();   
}
}
