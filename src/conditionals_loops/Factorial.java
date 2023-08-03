package conditionals_loops;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input number: ");
        int num = sc.nextInt();
        int fact = 1;
        while (num > 1) { // can also use num > 0, since multiplying with 1 gives the same value so we are ignoring 1
            fact *= num;
            num--;
        }
        System.out.println("Factorial: " + fact);
    }
}
