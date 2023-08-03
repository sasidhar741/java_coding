package basic_programs.cp_1;

import java.util.Scanner;

public class GetLastCharacter {
    //Print last character of the string
    public static void main(String[] args) {
        System.out.println("Enter the input word: ");
        Scanner sc = new Scanner(System.in);
        String inputWord = sc.next();

        if (!(inputWord.isEmpty())) {
            System.out.println("The last character in the input string is: " + inputWord.charAt(inputWord.length() - 1));
        }
    }
}
