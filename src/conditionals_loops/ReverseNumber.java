package conditionals_loops;

import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int reversed = 0;
        while (num > 0) {
            reversed = (reversed * 10) + (num % 10);
            num /= 10;
        }
        System.out.println("Reverse number: " + reversed);
    }
}

