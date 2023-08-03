package basic_programs.cp_2;

import java.util.Scanner;

public class SecondHalfStr {

    public static void main(String[] args) {
        System.out.println("Enter the input word: ");
        Scanner sc = new Scanner(System.in);
        String inputWord = sc.next();

        int halfLength = inputWord.length() / 2;
        System.out.println("Second Half of the string is " + inputWord.substring(halfLength));
    }
}
