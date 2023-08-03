package conditionals_loops;

import java.util.Scanner;

public class SumOfAllInputs {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while (true) {
            System.out.println("Enter the input number: ");
            int input = sc.nextInt();
            if (input == 0) {
                break;
            } else {
                sum += input;
            }
            System.out.println();
        }
        System.out.println("Total sum: " + sum);
    }
}
