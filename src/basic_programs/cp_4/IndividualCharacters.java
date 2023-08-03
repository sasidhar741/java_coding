package basic_programs.cp_4;

import java.util.Scanner;

public class IndividualCharacters {

    public static void main(String[] args) {
        System.out.println("Enter the word: ");
        Scanner sc = new Scanner(System.in);
        String inputWord = sc.next();
        String dashedWord = String.valueOf(inputWord.charAt(0));

        for (int i = 1; i < inputWord.length(); i++) {
            dashedWord += String.format("-%s", inputWord.charAt(i));
        }
        System.out.println("output: " + dashedWord);
    }
}
