package Functions;

import java.util.Scanner;

public class PalindromeNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        System.out.println("Is palindrome: " + isPalindrome(num));
    }

    static boolean isPalindrome(int num) {
        int original = num;
        int reverse = 0;
        while (num != 0) {
            reverse = (reverse * 10) + (num % 10);
            num /= 10;
        }
        return reverse == original;
    }
}
