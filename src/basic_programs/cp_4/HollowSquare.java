package basic_programs.cp_4;

import java.util.Scanner;

public class HollowSquare {

    public static void main(String[] args) {
        System.out.println("Enter the input number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int middleSpacesCount = num - 2;
        System.out.println(" *".repeat(num));
        for (int i = 0; i < num - 2; i++) {
            System.out.println(" *" + "  ".repeat(middleSpacesCount) + " *");
        }
        System.out.println(" *".repeat(num));
    }
}
