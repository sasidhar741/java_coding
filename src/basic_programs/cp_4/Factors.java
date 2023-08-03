package basic_programs.cp_4;

import java.util.Scanner;

public class Factors {

    public static void main(String[] args) {
        System.out.println("Enter the number for which you need factors: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
        }

    }
}
