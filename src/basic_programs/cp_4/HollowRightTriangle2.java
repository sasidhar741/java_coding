package basic_programs.cp_4;

import java.util.Scanner;

public class HollowRightTriangle2 {

    public static void main(String[] args) {
        System.out.println("Enter the input number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int leftSpacesCount = num - 2, middleSpacesCount = 0;
        System.out.println("  ".repeat(num - 1) + " *");
        for (int i = 0; i < num - 2; i++, leftSpacesCount--, middleSpacesCount++) {
            System.out.println("  ".repeat(leftSpacesCount) + " *" + "  ".repeat(middleSpacesCount) + " *");
        }
        System.out.println(" *".repeat(num));
    }
}
