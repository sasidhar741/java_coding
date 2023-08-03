package basic_programs.cp_2;

import java.util.Scanner;

public class Masking {

    public static void main(String[] args) {
        System.out.println("Enter the input word: ");
        Scanner sc = new Scanner(System.in);
        String inputWord = sc.next();

        String stars = "*".repeat(inputWord.length() - 2);

        System.out.println(inputWord.charAt(0)
                + stars
                + inputWord.charAt(inputWord.length() - 1)
        );
    }
}
