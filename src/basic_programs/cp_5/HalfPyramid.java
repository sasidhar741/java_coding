package basic_programs.cp_5;

import java.util.Scanner;

public class HalfPyramid {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int n = 0;
        for (int i = 1; i <= num; i++) {
            String modified = "";
            for (int j = 1; j <= i; j++) {
                modified += (" " + ++n);
            }
            System.out.println(modified);
        }
    }
}
