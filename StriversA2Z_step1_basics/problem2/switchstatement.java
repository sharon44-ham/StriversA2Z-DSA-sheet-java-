// 3)switch statements
package StriversA2Z_step1_basics.problem2;
import java.util.Scanner;

public class switchstatement {
    public switchstatement(){

    }
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int day = sc.nextInt();
            System.out.println(day);
            switch(day){
                case 1:
                System.out.println("Monday");
                break;
                case 2:
                System.out.println("Tuesday");
                break;
                case 3:
                System.out.println("Wednesday");
                break;
                case 4:
                System.out.println("Thursday");
                break;
                case 5:
                System.out.println("Friday");
                break;
                case 6:
                System.out.println("Staurday");
                break;
                case 7:
                System.out.println("Sunday");
                break;
                default:
                System.out.println("Invalid day");
                break;
            }
            }
        sc.close();
        }
    }
    
    

