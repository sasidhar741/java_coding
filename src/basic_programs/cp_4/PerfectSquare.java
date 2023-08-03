package basic_programs.cp_4;

import java.util.Scanner;

public class PerfectSquare {

    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        boolean isPerfectSquare = false;

        for (int i = 0; i * i <= num; i++) {
            if (i * i == num) {
                isPerfectSquare = true;
                break;
            }

        }
        if (isPerfectSquare) {
            System.out.println("It's a perfect square");
        } else {
            System.out.println("Not a perfect square");
        }
    }
}
