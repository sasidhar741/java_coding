package conditionals_loops;

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character: ");
        char c = sc.next().charAt(0);
        String vowels = "aeiouAEIOU";
        System.out.println(vowels.indexOf(c) == -1 ? "Consonant" : "Vowel");
    }
}
