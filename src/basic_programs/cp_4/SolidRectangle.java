package basic_programs.cp_4;

import java.util.Scanner;

public class SolidRectangle {

    public static void main(String[] args) {
        System.out.println("Enter the number of rows: ");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();

        System.out.println("Enter the number of columns: ");
        int columns = sc.nextInt();

        for (int i = 1; i <= rows; i++) {
            System.out.println("* ".repeat(columns));
        }
    }
}
