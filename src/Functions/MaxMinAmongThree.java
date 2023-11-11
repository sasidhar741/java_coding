package functions;

import java.util.Scanner;

public class MaxMinAmongThree {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int first = sc.nextInt();

        System.out.println("Enter the second number: ");
        int second = sc.nextInt();

        System.out.println("Enter the third number: ");
        int third = sc.nextInt();
        maxMin(first, second, third); // Using predefined methods
        System.out.println("Max: " + max(first, second, third));
        System.out.println("Min: " + min(first, second, third));

    }

    static void maxMin(int a, int b, int c) {
        System.out.println("Maximum: " + Math.max(c, Math.max(a, b)));
        System.out.println("Minimum: " + Math.min(c, Math.min(a, b)));
    }

    static int max(int a, int b, int c) {
        int largest = a;
        if (b > largest) {
            largest = b;
        }

        if (c > largest) {
            largest = c;
        }
        return largest;

    }

    static int min(int a, int b, int c) {
        int smallest = a;
        if (b < smallest) {
            smallest = b;
        }

        if (c < smallest) {
            smallest = c;
        }
        return smallest;

    }
}
