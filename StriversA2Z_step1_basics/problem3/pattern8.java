// triangle stars pattern decrementing
package StriversA2Z_step1_basics.problem3;
import java.util.Scanner;

public class pattern8 {
    public pattern8(){
    }
 public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i =0;i<t;i++){
            int n = sc.nextInt();
            System.out.println(n + ": ");
            for(int j =1;j<=n;j++){             //rows
                for(int k=0;k<j;k++){ 
                    System.out.print(" ");  //spaces
                }
                for(int k =0;k<2*n-(2*j-1);k++){      //columns
                    System.out.print("*");        
                }
                 for(int k=0;k<j;k++){ 
                    System.out.print(" ");  //spaces
                }
            System.out.println(" ");          
            }
        }
        sc.close();
    }
    
}


