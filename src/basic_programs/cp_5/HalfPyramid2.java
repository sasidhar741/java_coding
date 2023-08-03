package basic_programs.cp_5;

import java.util.Scanner;

public class HalfPyramid2 {
    public static void main(String[] args) {
        System.out.println("Enter the from which number you need to print: ");
        Scanner sc = new Scanner(System.in);
        int firstNum = sc.nextInt();

        System.out.println("Enter how many rows: ");
        int secondNum = sc.nextInt();


        int n = firstNum;
        for (int i = 1; i <= secondNum; i++) {
            String modified = "";
            for (int j = 1; j <= i; j++) {
                modified += (" " + n++);
            }
            System.out.println(modified);
        }
    }

}
