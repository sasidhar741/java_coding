package conditionals_loops;

import java.util.Scanner;

public class Power {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base: ");
        int base = sc.nextInt();
        System.out.println("Enter the exponent");
        int exponent = sc.nextInt();
        int result = 1;

        while (exponent > 0) {
            result *= base;
            exponent--;
        }
        System.out.println("Result: " + result);
    }
}
