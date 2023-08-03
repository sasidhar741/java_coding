package basic_programs.cp_1;

import java.util.Scanner;

public class SumOfDigits {

    public static void main(String[] args) {

        int sum = 0;

        System.out.println("Enter the input number: ");
        Scanner sc = new Scanner(System.in);
        int inputNumber = sc.nextInt();

        while (inputNumber != 0) {
            sum += inputNumber % 10;
            inputNumber /= 10;
        }

        System.out.println("The total sum of digits: " + sum);
    }
}
