package StriversA2Z_step1_basics.problem3;
import java.util.Scanner;
public class pattern21 {
    public pattern21(){

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++){
           int n =sc.nextInt();
            System.out.println(n + ":");
            for(int j =0;j<n;j++){
                for(int k =0 ;k<n;k++){
                    if(j==0 || j==n-1 || k==0 || k==n-1){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
       }
        }
        sc.close();
        }
        }