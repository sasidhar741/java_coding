package functions;

import java.util.Scanner;

public class CircleAreaCircumference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        double radius = sc.nextDouble();
        areaCircumference(radius);

    }

    static void areaCircumference(double radius) {
        double circumference = (2 * Math.PI * radius);
        double area = Math.PI * (radius * radius);
        System.out.println("Circumference of circle: " + String.format("%.2f", circumference));
        System.out.println("Area of circle: " + String.format("%.2f", area));
    }
}
