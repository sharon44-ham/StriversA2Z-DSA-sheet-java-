// triangle stars pattern incrementing
package StriversA2Z_step1_basics.problem3;
import java.util.Scanner;

public class pattern7 {
    public pattern7(){
    }
 public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i =0;i<t;i++){
            int n = sc.nextInt();
            System.out.println(n + ": ");
            for(int j =0;j<n;j++){             //rows
                for(int k=0;k<n-j-1;k++){ 
                    System.out.print(" ");  //spaces
                }
                for(int k =0;k<2*j+1;k++){      //columns
                    System.out.print("*");        
                }
                 for(int k=0;k<n-j-1;k++){ 
                    System.out.print(" ");  //spaces
                }
            System.out.println(" ");          
            }
        }
        sc.close();
    }
    
}


