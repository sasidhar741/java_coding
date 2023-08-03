package basic_programs.cp_5;

import java.util.Scanner;

public class SolidDiamond {

    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int leftSpaces = num - 1;
        for (int i = 1; i <= num; i++, leftSpaces--) {
            System.out.println(" ".repeat(leftSpaces) + " *".repeat(i));
        }

        int numberOfStars = num - 1;
        for (int i = 1; i < num; i++, numberOfStars--) {
            System.out.println(" ".repeat(i) + " *".repeat(numberOfStars));
        }

    }
}
