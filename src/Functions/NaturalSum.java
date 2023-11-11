package functions;

import java.util.Scanner;

public class NaturalSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the ending number: ");
        int end = sc.nextInt();
        System.out.println("The sum of fist n natural numbers: " + sum(end));
    }

    static int sum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}
