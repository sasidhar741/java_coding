package basic_programs.cp_1;

import java.util.Scanner;

public class StringRepetitionLastThreeChar {

    public static void main(String[] args) {
        System.out.println("Enter the input word: ");
        Scanner sc = new Scanner(System.in);
        String inputWord = sc.next();

        System.out.println("Enter the number of times you want to print the string: ");
        int numberOfTimes = sc.nextInt();

        String lastThreechar = inputWord.substring(inputWord.length() - 3, inputWord.length());
        System.out.println("Output: " + lastThreechar.repeat(numberOfTimes));
    }
}
