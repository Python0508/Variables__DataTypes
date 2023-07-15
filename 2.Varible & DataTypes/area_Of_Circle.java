import java.util.*;
public class area_Of_Circle {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Radius: ");
        int radius = sc.nextInt();
        float pie = 3.14f;

        float area_Of_Circle = pie * radius * radius;
        System.out.println("Area of Circle is: " + area_Of_Circle);
    }
    
}
