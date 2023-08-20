package Functions;

import java.util.Scanner;

public class SumProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int first = sc.nextInt();

        System.out.println("Enter the second number: ");
        int second = sc.nextInt();

        System.out.println("Sum of two numbers: " + sum(first, second));
        System.out.println("Product of two numbers: " + product(first, second));

    }

    static int sum(int a, int b) {
        return a + b;
    }

    static int product(int a, int b) {
        return a * b;
    }
}
