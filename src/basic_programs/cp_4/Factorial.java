package basic_programs.cp_4;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Enter the number for which you need factorial: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int fact = 1;
        for (int i = num; i > 0; i--) {
            fact *= i;
        }
        System.out.print("Output: " + fact);
    }
}
