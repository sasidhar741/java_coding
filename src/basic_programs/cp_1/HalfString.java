package basic_programs.cp_1;

import java.util.Scanner;

public class HalfString {
    //Print half of the string
    public static void main(String[] args) {
        System.out.println("Enter the input word: ");
        Scanner sc = new Scanner(System.in);
        String inputWord = sc.next();

        int halfLength = inputWord.length() / 2;
        //substring excludes endIndex
        System.out.println("Half string is " + inputWord.substring(0, halfLength));

    }
}
