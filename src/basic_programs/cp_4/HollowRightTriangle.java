package basic_programs.cp_4;

import java.util.Scanner;

public class HollowRightTriangle {

    public static void main(String[] args) {
        System.out.println("Enter the input number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println(" *".repeat(num));
        int leftSpacesCount = 1;
        int middleSpacesCount = num - 3;
        for (int i = 0; i < num - 2; i++, leftSpacesCount++, middleSpacesCount--) {
            System.out.println("  ".repeat(leftSpacesCount) + " *" + "  ".repeat(middleSpacesCount) + " *");
        }
        System.out.println("  ".repeat(num - 1) + " *");
    }
}
