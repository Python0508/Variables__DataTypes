package Pratice_set;
import java.util.*;
public class area_Of_Square {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input side of Square: ");
        int side = sc.nextInt();
        int square = side * side;
        System.out.println("Area of Square is: " + square);
    }
}
