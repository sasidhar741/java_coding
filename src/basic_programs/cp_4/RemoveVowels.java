package basic_programs.cp_4;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class RemoveVowels {
    public static void main(String[] args) {
        System.out.println("Enter the input string");
        Scanner sc = new Scanner(System.in);
        String inputStr = sc.next();

        List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');

        for (int i = 0; i < inputStr.length(); i++) {
            for (Character vowel : vowels) {
                if (inputStr.charAt(i) == vowel) {
                    inputStr = inputStr.substring(0, i) + inputStr.substring(i + 1, inputStr.length());
                }
            }
        }

//        inputStr = inputStr.replaceAll("[aeiouAEIOU]", ""); - single line answer for removing vowels
        System.out.println("Input without vowels: " + inputStr);
//        System.out.println(Character.isDigit('1')); - checking a character is a digit or not


    }
}
