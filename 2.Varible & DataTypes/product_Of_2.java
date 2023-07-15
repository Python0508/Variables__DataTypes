import java.util.*;
public class product_Of_2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number 1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the Number 2: ");
        int num2 = sc.nextInt();

        int Product = num1 * num2;
        System.out.println("Product of Num 1 & Num 2: " + Product);
    }
}