package StriversA2Z_step1_basics.problem3;
import java.util.Scanner;

public class pattern17 {
    public pattern17(){

    }
        public static void main(String[] args){
        // testcases
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
       for(int i =0;i<t;i++){
            int n = sc.nextInt();
            System.out.println(n + ": ");

        // solution

        // spaces
        for(int j = 0 ;j<n;j++){
            for(int k =1;k<=n-j-1;k++){
                System.out.print(" ");
            }

            // alphabets
            int breakPoint = (2*j+1)/2;
            char ch = 'A';
            for(int k =1;k<=2*j+1;k++){
                System.out.print(ch);
                if(k<=breakPoint){
                    ch++;
                }
                else{
                  ch--;
                } 
            }
            // spaces
            for(int k =1;k<=n-j-1;k++){
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
       sc.close(); 
}
}

