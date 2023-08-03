package basic_programs.cp_2;

import java.util.Scanner;

public class RectangleArea {

    public static void main(String[] args) {
        System.out.println("Enter the length: ");
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();

        System.out.println("Enter the breadth: ");
        int breadth = sc.nextInt();

        System.out.println("Area of rectangle: " + (length * breadth));

    }
}
