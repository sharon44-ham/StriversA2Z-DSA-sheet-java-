package StriversA2Z_step1_basics.problem3;
import java.util.Scanner;
public class pattern11 {
   public pattern11(){
   }
   public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
     int t = sc.nextInt();
        for(int i =0;i<t;i++){
            int n = sc.nextInt();
            System.out.println(n + ": ");
            int start = 1;
            for(int j=0 ;j<=n; j++){
                if(j%2==0)start = 1;
                else start = 0;
                for(int k=1;k<=j;k++){
            System.out.print(start = 1- start);
            }
             System.out.println(" ");
   }
   
    
}
sc.close();
}
}
