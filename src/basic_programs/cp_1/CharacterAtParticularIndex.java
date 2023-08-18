package basic_programs.cp_1;

import java.util.Scanner;

public class CharacterAtParticularIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string input: ");
        String input = sc.next();
        int index = sc.nextInt();
        System.out.println("output: " + input.charAt(index));
    }
}