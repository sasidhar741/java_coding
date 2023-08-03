package basic_programs.cp_4;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        System.out.println("Enter the input string");
        Scanner sc = new Scanner(System.in);
        String inputStr = sc.next();

        String reversed = "";
        for (int i = inputStr.length() - 1; i >= 0; i--) {
            reversed += inputStr.charAt(i);
        }
        if (inputStr.equals(reversed)) {
            System.out.println("It's a palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}
