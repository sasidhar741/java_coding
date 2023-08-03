package basic_programs.cp_3;

import java.util.Scanner;

public class Hypotenuse {
    //Program to find Hypotenuse
    // Formula (Right angled Triangle) - SquareRoot(a^2 + b^2)
    public static void main(String[] args) {

        System.out.println("Enter the a: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        System.out.println("Enter the b: ");
        int b = sc.nextInt();

        int hypotenuse = (int) Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.println("Hypotenuse: " + hypotenuse);
    }
}
