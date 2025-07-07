// if else-if statement
package StriversA2Z_step1_basics.problem1;
import java.util.Scanner;

public class ifelseif {
    public ifelseif(){

    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++){
          int marks= sc.nextInt();
          System.out.println(marks);
        
        
        if(marks>=90){
            System.out.println("A");
        }else if(marks>=70){
            System.out.println("B");
        }else if(marks>=50){
            System.out.println("C");
        }else if(marks>=35){
            System.out.println("D");
        }else{
            System.out.println("Fail");
        
        }
    }
    sc.close();

}
}
