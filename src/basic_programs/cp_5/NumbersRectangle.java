package basic_programs.cp_5;

import java.util.Scanner;

public class NumbersRectangle {

    public static void main(String[] args) {
        System.out.println("Enter number of rows: ");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();

        System.out.println("Enter number of columns");
        int columns = sc.nextInt();

        String modified = "";
        for (int i = 1; i <= columns; i++) {
            modified += (" " + i);
        }
        for (int i = 0; i < rows; i++) {
            System.out.println(modified);
        }
    }
}
