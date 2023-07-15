package Pratice_set;
import java.util.*;
public class billing {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the cost of pencil: ");
        int pencil = sc.nextInt();
        System.out.print("Enter the cost of Pen: ");
        int pen = sc.nextInt();
        System.out.print("Enter the cost of Erasor: ");
        int erasor = sc.nextInt();
        int sum = pen + pencil + erasor;
        int billing = (sum * 118)/100;

        System.out.println("Before GST: " + sum);
        System.out.println("After Adding GST: " + billing);
    }
}
