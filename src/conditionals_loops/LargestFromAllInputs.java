package conditionals_loops;

import java.util.Scanner;

public class LargestFromAllInputs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int largest = 0;
        while (true) {
            System.out.println("Enter the input number: ");
            int input = sc.nextInt();
            if (input == 0) {
                break;
            } else {
                largest = input > largest ? input : largest;
            }
            System.out.println();
        }
        System.out.println("Largest value: " + largest);
    }
}
