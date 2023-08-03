package basic_programs.cp_1;

import java.util.Scanner;

public class StringRepetition {

    public static void main(String[] args) {
        System.out.println("Enter the input word: ");
        Scanner sc = new Scanner(System.in);
        String inputWord = sc.next();

        System.out.println("Enter the number of times you want to print the string: ");
        int numberOfTimes = sc.nextInt();

        //Repeat function used to repeat a string several times
        System.out.println((inputWord + " ").repeat(numberOfTimes));

    }
}
