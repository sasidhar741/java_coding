package basic_programs.cp_5;

import java.util.Scanner;

public class HollowFullPyramid {

    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 1, leftSpaces = num - i; i <= num; i++, leftSpaces--) {
            if (i > 2 && i < num) {
                System.out.println(" ".repeat(leftSpaces) + " *" + "  ".repeat(i - 2) + " *");
            } else {
                System.out.println(" ".repeat(leftSpaces) + (" *".repeat(i)));
            }
        }
    }
}
