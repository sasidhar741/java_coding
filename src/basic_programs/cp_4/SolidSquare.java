package basic_programs.cp_4;

import java.util.Scanner;

public class SolidSquare {

    public static void main(String[] args) {
        System.out.println("Enter the input: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            System.out.println("* ".repeat(num));
        }
    }
}
