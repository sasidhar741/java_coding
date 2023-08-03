package basic_programs.cp_2;

import java.util.Scanner;

public class FirstLastDigit {

    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String numStr = Integer.toString(num);

        System.out.println("First digit: " + Integer.parseInt(numStr.substring(0, 1)));
        System.out.println("Last digit: " + Integer.parseInt(numStr.substring(numStr.length() - 1, numStr.length())));
    }
}
