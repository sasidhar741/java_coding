package basic_programs.cp_5;

import java.util.Scanner;

public class FullPyramid {

    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 1, leftSpaces = num - i; i <= num; i++, leftSpaces--) {
            String modifiedStr = " ".repeat(leftSpaces);
            for (int j = 1; j <= i; j++) {
                modifiedStr += j + " ";
            }
            System.out.println(modifiedStr);
        }
    }
}
