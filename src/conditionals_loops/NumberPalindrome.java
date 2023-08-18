package conditionals_loops;

import java.util.Scanner;

public class NumberPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int input = sc.nextInt();
        int original = input;
        int rev = 0;
        while (input > 0) {
            rev = (rev * 10) + (input % 10);
            input /= 10;
        }
        System.out.println(original == rev ? "Palindrome" : "Not a palindrome");
    }
}
