package basic_programs.cp_5;

import java.util.Scanner;

//Exception cases for number ending with 0 => Example - 150 (Input) Output - 51
public class ReverseNumber {

    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int originalNumber = sc.nextInt(); //741

        int reversedNumber = 0;

        while (originalNumber != 0) {
            reversedNumber = ((reversedNumber * 10) + (originalNumber % 10));
            originalNumber /= 10;
        }

        System.out.println("Reversed number: " + reversedNumber);
    }
}
