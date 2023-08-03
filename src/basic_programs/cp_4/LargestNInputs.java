package basic_programs.cp_4;

import java.util.Scanner;

public class LargestNInputs {

    public static void main(String[] args) {
        System.out.println("Enter the count of inputs you need: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int large = 0;
        for (int i = 1; i <= num; i++) {
            System.out.println("Enter the number: ");
            int input = sc.nextInt();
            if (input > large) {
                large = input;
            }
        }
        System.out.println("Largest number: " + large);
    }
}
