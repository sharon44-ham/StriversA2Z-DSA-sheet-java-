// 
package StriversA2Z_step1_basics.problem3;
import java.util.Scanner;
public class pattern6 {
    public pattern6(){

    }

 public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i =0;i<t;i++){
            int n = sc.nextInt();
            System.out.println(n + ": ");
            for(int j =1;j<=n;j++){             //rows
                for(int k =1;k<=n-j+1;k++){      //columns
                    System.out.print(j);        
                }
            System.out.println(" ");          
            }
        }
        sc.close();
    }
    
}
