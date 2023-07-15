package Pratice_set;
import java.util.*;
public class average_Of_3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number 1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the number 2: ");
        int num2 = sc.nextInt();
        System.out.print("Enter the number 3: ");
        int num3 = sc.nextInt();

        float average = (num1 + num2 + num3)/3;

        System.out.println("Average Of 3 Number: " + average);
    }
    
}
