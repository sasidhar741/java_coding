package conditionals_loops;

import java.util.Scanner;

public class CircleArea {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        float radius = sc.nextFloat();

        System.out.println("Area of a circle is " + 3.14 * (Math.pow(radius, 2)));

    }
}
