package conditionals_loops;

import java.util.Scanner;

public class DistanceBetweenTwoPoints {
    // Distance = $\sqrt{(x2-x1)^{2} + (y2-y1)^{2}}$

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x1 value: ");
        int x1 = sc.nextInt();

        System.out.println("Enter the x2 value: ");
        int x2 = sc.nextInt();

        System.out.println("Enter the y1 value: ");
        int y1 = sc.nextInt();

        System.out.println("Enter hte y2 value: ");
        int y2 = sc.nextInt();


        System.out.println("Distance between two points: " + Math.sqrt((Math.pow((x2 - x1), 2)) + (Math.pow((y2 - y1), 2))));

    }

}
