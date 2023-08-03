package basic_programs.cp_4;

import java.util.Scanner;

public class KthPower {
    //Program: Sum of kth power  of first n  natural  numbers
    public static void main(String[] args) {
        System.out.println("Enter the n^th natural number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("Enter the k^th power (exponent): ");
        int k = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += Math.pow(i, k);
        }

        System.out.println("Sum of kth power  of first n  natural  numbers is " + sum);
    }
}
