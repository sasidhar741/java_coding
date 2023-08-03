package basic_programs.cp_4;

import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {

        System.out.println("Enter the input number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(String.format("%d * %d = %d", num, i, num * i));
        }
    }
}
